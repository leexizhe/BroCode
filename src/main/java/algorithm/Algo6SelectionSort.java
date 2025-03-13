package algorithm;

import java.util.Arrays;

public class Algo6SelectionSort {

    /*
    Selection Sort is a simple comparison-based sorting algorithm that repeatedly selects
    the smallest (or largest) element from the unsorted part and moves it to the beginning (or end) of the array.
    Run Time Complexity:
    	- Best Case: 𝑂(𝑛²)
    	- Worst Case: 𝑂(𝑛²)
    	- Average Case: 𝑂(𝑛²)
    Space Complexity: 𝑂(1) (in-place sorting)

    1. **Algorithm**:
    	- Divide the array into a sorted and an unsorted region.
    	- Find the smallest element in the unsorted region.
    	- Swap it with the first element of the unsorted region.
    	- Expand the sorted region by one and repeat until the array is sorted.

    2. **Applications**:
    	- **Small Data Sets**: Useful when working with small datasets due to its simplicity.
    	- **Learning Algorithms**: Frequently used in educational environments to teach sorting concepts.
    	- **Embedded Systems**: Used in systems with strict memory constraints where in-place sorting is required.
    	- **Partially Ordered Data**: Handy when only a few swaps are needed due to pre-sorted elements.

    3. **Advantages**:
    	- Simple to understand and implement.
    	- Does not require extra memory (in-place sorting).
    	- Performs well on small arrays or nearly sorted data.

    4. **Limitations**:
    	- Inefficient on large datasets due to its quadratic time complexity.
    	- Always makes 𝑛-1 swaps, even if the array is already sorted.

    5. **Key Insight**:
    	- Selection Sort minimizes the number of swaps but performs the same number of comparisons regardless of the input's order.
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
