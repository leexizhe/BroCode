package algorithm;

import java.util.Arrays;

public class Algo6SelectionSort {

    /*
    Selection Sort is a simple comparison-based sorting algorithm.
    It repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted part of the list and moves it to the sorted part.
    The process continues until the entire list is sorted.
    Run Time Complexity: best case: 𝑂(𝑛²), worst case: 𝑂(𝑛²)

    1. Small Data Sets: Selection sort can be useful for small data sets where the overhead of more complex algorithms is not justified.

    2. Educational Purposes: Selection sort is often used in teaching to help students understand how sorting algorithms work and develop algorithmic thinking.

    3. Memory Efficiency: Selection sort requires very little additional memory (𝑂(1) space complexity), making it suitable for situations where memory usage is a concern.

    4. Stable Sorting: While the standard implementation of selection sort is not stable, it can be modified to become stable, making it a suitable choice in specific scenarios.

    5. Simplicity: The algorithm is straightforward to implement and understand, which is beneficial when simplicity is a key consideration.
    */

    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        selectionSort(array);

        Arrays.stream(array).forEach(System.out::println);
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
