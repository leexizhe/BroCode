package algorithm;

import java.util.Arrays;

public class Algo9MergeSort {
    /*
    Merge Sort is a highly efficient, comparison-based sorting algorithm based on the divide-and-conquer paradigm.
    It divides the input array into smaller subarrays, sorts each of them, and then merges the sorted subarrays back into one sorted array.
    The process continues recursively until the entire array is sorted.
    Run Time Complexity: Best, Average, and Worst Case: O(n log n) (balanced divides and merges)
    Space Complexity: O(n) (requires temporary arrays for merging)

    1. Large Data Sets: Merge Sort is particularly effective for large datasets due to its O(n log n) time complexity.

    2. External Sorting: Often used in external sorting algorithms where data cannot all fit into memory, as it divides and processes chunks.

    3. Stable Sorting: Merge Sort is stable, preserving the relative order of equal elements in the original array.

    4. Predictable Performance: Unlike algorithms with varied time complexities based on input conditions, Merge Sort consistently performs in O(n log n).

    5. Divide-and-Conquer Nature: It is a prime example of this algorithmic strategy, making it ideal for teaching and understanding the divide-and-conquer methodology.
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
