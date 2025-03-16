package algorithm;

import java.util.Arrays;

public class Algo7InsertionSort {
    /*
    Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It is much like the way you might sort playing cards in your hands.
    Run Time Complexity:
    	- Best Case: 𝑂(𝑛) (when the array is already sorted)
    	- Worst/Average Case: 𝑂(𝑛²)
    Space Complexity: 𝑂(1) (in-place sorting)

    1. Algorithm:
    	- Start with the second element (first element is considered sorted).
    	- Compare it with the previous elements.
    	- Shift all larger elements one position to the right.
    	- Insert the current element into its correct position.
    	- Repeat for all elements.

    2. Applications:
    	- Small Data Sets: Works efficiently for small or nearly sorted datasets.
    	- Online Sorting: Ideal for scenarios where new elements are continuously added and need to be sorted in real-time.
    	- Educational Use: Commonly used for teaching sorting concepts due to its simplicity.

    3. Advantages:
    	- Simple and easy to implement.
    	- Efficient for small or partially sorted arrays.
    	- In-place sorting algorithm with no additional memory requirement.

    4. Limitations:
    	- Inefficient for large datasets due to its quadratic time complexity.
    	- Requires more shifts compared to other sorting algorithms for larger arrays.
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
