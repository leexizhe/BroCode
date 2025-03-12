package algorithm;

import java.util.Arrays;

public class Algo10QuickSort {
    /*
    QuickSort is an efficient comparison-based sorting algorithm based on the divide-and-conquer paradigm.
    It selects a pivot element and partitions the array around the pivot, placing smaller elements before it and larger elements after it.
    The process is repeated recursively on the subarrays, leading to a fully sorted array.
    Run Time Complexity: Best and Average Case: O(n log n), Worst Case: O(n²) (when partitions are unbalanced)
    Space Complexity: O(log n) (due to the recursion stack)

    1. Large Data Sets: QuickSort is highly efficient for large datasets because of its O(n log n) average time complexity.

    2. In-Place Sorting: It works in-place, meaning it requires minimal additional space compared to other sorting algorithms like Merge Sort.

    3. Unstable Sorting: QuickSort is not stable, so the relative order of equal elements may not be preserved.

    4. Pivot Selection: Proper choice of the pivot is crucial for ensuring good performance. Popular strategies include picking the first, last, middle, or random element.

    5. Divide-and-Conquer Nature: QuickSort exemplifies this strategy, making it a commonly studied algorithm in computer science for understanding partitioning and recursion.
    */

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);
        Arrays.stream(array).forEach(System.out::print);
    }

    private static void quickSort(int[] array, int start, int end) {
        if (start >= end) return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }
}
