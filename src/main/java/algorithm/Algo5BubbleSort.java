package algorithm;

import java.util.Arrays;

public class Algo5BubbleSort {
    /*
    Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements,
    and swaps them if they are in the wrong order. The process continues until the list is sorted.
    Run Time Complexity:
    	- Best Case: 𝑂(𝑛) (when the array is already sorted)
    	- Worst Case: 𝑂(𝑛²) (when the array is sorted in reverse order)
    	- Average Case: 𝑂(𝑛²)
    Space Complexity: 𝑂(1) (in-place sorting)

    1. **Algorithm**:
    	- Start from the first element and iterate through the array.
    	- Compare each pair of adjacent elements.
    	- Swap them if they are in the wrong order.
    	- Repeat the process for all elements, reducing the range with each pass.

    2. **Applications**:
    	- **Educational**: Often used for teaching the basics of sorting due to its simplicity.
    	- **Small Data Sets**: Useful for sorting small datasets where simplicity matters more than efficiency.
    	- **Partially Sorted Data**: Works better with almost sorted data since fewer swaps are required.

    3. **Advantages**:
    	- Simple and easy to implement.
    	- Does not require extra memory (in-place sorting).
    	- Provides insight into basic sorting mechanisms.

    4. **Limitations**:
    	- Inefficient for large datasets due to its quadratic time complexity.
    	- Performs poorly compared to advanced algorithms like Quick Sort, Merge Sort, or Heap Sort.

    5. **Optimization**:
    	- Improved versions of Bubble Sort stop early if no swaps are made in a pass, indicating the array is already sorted.
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
