package algorithm;

import java.util.Arrays;

public class Algo5BubbleSort {
    /*
    Bubble Sort is a simple comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
    The pass through the list is repeated until the list is sorted.
    Run Time Complexity: best case: 𝑂(𝑛), worst case: 𝑂(𝑛²)
    Space Complexity: 𝑂(1) (in-place sorting).

    1. Small Data Sets: Bubble sort can be useful for small data sets where the simplicity of the algorithm outweighs its inefficiency.

    2. Educational Purposes: Bubble sort is often used for educational purposes to help students understand the concept of sorting algorithms.

    3. Nearly Sorted Data: When the data is already nearly sorted, bubble sort can efficiently complete the sorting with minimal swaps.

    4. Debugging: Bubble sort can be useful for debugging purposes to ensure that data is correctly sorted when more efficient algorithms are too complex to use.

    5. Limited Resources: In environments with limited computational resources where the overhead of more complex algorithms is not justified.
    */

    public static void main(String[] args) {
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        Arrays.stream(array).forEach(System.out::println);
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
