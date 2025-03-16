package algorithm;

import java.util.Arrays;

public class Algo10QuickSort {
    /*
    QuickSort is a highly efficient, divide-and-conquer sorting algorithm that works by selecting a 'pivot' element,
    partitioning the array around the pivot, and then sorting the partitions recursively.
    Run Time Complexity:
    	- Best Case: 𝑂(𝑛 log 𝑛)
    	- Average Case: 𝑂(𝑛 log 𝑛)
    	- Worst Case: 𝑂(𝑛²) (occurs when the pivot selection is poor, e.g., always choosing the smallest or largest element)
    Space Complexity: 𝑂(log 𝑛) (for recursive calls in the best case)

    1. Algorithm:
    	- Choose a pivot element from the array.
    	- Partition the array so that all elements less than the pivot go to the left and all elements greater go to the right.
    	- Recursively apply the same process to the left and right partitions.
    	- Combine the partitions to form the sorted array.

    2. Applications:
    	- Large Datasets: Efficient for large data due to its average time complexity of 𝑂(𝑛 log 𝑛).
    	- Systems with Limited Memory: Uses in-place sorting (low memory overhead compared to Merge Sort).
    	- Gaming: Useful for sorting objects, scores, or assets.
    	- Databases: Quickly organizes rows or entries in various fields.
    	- Networking: Helps with sorting routing data or other large datasets efficiently.

    3. Advantages:
    	- Fast for large datasets with a good pivot selection.
    	- Works well with in-memory datasets due to its in-place sorting nature.
    	- Flexible and adaptable for real-world applications.

    4. Limitations:
    	- Can degrade to 𝑂(𝑛²) in the worst case, especially with poor pivot selection.
    	- Not a stable sorting algorithm (equal elements' relative order may not be preserved).

    5. Key Insight:
    	- The choice of pivot significantly affects performance. Techniques like "median of three" or random pivot selection can reduce the risk of poor performance.
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
