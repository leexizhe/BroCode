package algorithm;

import java.util.Arrays;

public class Algo9MergeSort {
    /*
    Merge Sort is a divide-and-conquer sorting algorithm that splits an array into halves, recursively sorts them, and then merges the sorted halves back together.
    Run Time Complexity:
    	- Best Case: 𝑂(𝑛 log 𝑛)
    	- Worst Case: 𝑂(𝑛 log 𝑛)
    	- Average Case: 𝑂(𝑛 log 𝑛)
    Space Complexity: 𝑂(𝑛) (due to temporary arrays used for merging)

    1. Algorithm:
    	- Divide: Recursively split the array into two halves until each subarray contains a single element.
    	- Conquer: Sort each of the smaller subarrays.
    	- Combine: Merge the sorted subarrays to produce the sorted array.

    2. Applications:
    	- Large Data Sets: Efficient for sorting large datasets where stability and efficiency are critical.
    	- External Sorting: Used when data is too large to fit in memory and needs to be sorted on disk.
    	- Linked Lists: Performs well on linked lists as they require no shifting of elements during merging.

    3. Advantages:
    	- Guarantees 𝑂(𝑛 log 𝑛) performance regardless of input order.
    	- Stable sorting algorithm (maintains the relative order of equal elements).
    	- Works well for data that does not fit in memory (e.g., external sorting).

    4. Limitations:
    	- Requires additional memory for temporary arrays, making it less efficient for in-place sorting.
    	- For smaller datasets, other algorithms like Insertion Sort or Quick Sort can be faster.

    5. Key Insight:
    	- The merging process is the core of Merge Sort, where two sorted arrays are combined into one sorted array.
    */

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
        mergeSort(array);

        Arrays.stream(array).forEach(System.out::println);
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];
        int i = 0;
        int j = 0;
        for (; i < length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[j] = array[i];
                j++;
            }
        }

        mergeSort(left);
        mergeSort(right);
        merge(left, right, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = array.length / 2;
        int rightLength = array.length - leftLength;
        int i = 0;
        int l = 0;
        int r = 0;
        while (l < leftLength && r < rightLength) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while (l < leftLength) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while (r < rightLength) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
