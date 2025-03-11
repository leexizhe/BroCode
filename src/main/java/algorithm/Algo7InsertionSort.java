package algorithm;

import java.util.Arrays;

public class Algo7InsertionSort {
    /*
    Insertion Sort is a simple comparison-based sorting algorithm.
    It builds the sorted list incrementally, by taking one element at a time from the unsorted part and inserting it into its correct position in the sorted part.
    The process continues until all elements are sorted.
    Run Time Complexity: best case: 𝑂(𝑛) (nearly sorted), worst case: 𝑂(𝑛²)

    1. Small Data Sets: Insertion sort works well on small datasets where its simplicity and efficiency for such cases are advantageous.

    2. Educational Purposes: Often used to teach sorting algorithms, as it provides a clear example of how elements can be moved and inserted.

    3. Nearly Sorted Data: Insertion sort is particularly efficient for nearly sorted data, as it only needs a few swaps to complete the task.

    4. Stable Sorting: Insertion sort is stable, meaning the relative order of equal elements is preserved.

    5. Adaptive Nature: It adapts quickly to nearly sorted data, offering faster performance in such cases compared to other 𝑂(𝑛²) algorithms.
    */
    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};

        insertionSort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
