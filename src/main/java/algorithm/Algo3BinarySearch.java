package algorithm;

public class Algo3BinarySearch {
    /*
    Binary Search is a highly efficient searching algorithm that works on sorted arrays by dividing the search interval in half.
    Run Time Complexity:
    - Best Case: 𝑂(1) (when the middle element is the target)
    - Average/Worst Case: 𝑂(log 𝑛)
    Space Complexity:
    - Iterative: 𝑂(1)
    - Recursive: 𝑂(log 𝑛) (due to the call stack)

    1. **Algorithm**:
    - Compare the target value to the middle element of the array.
    - If it matches, return the index.
    - If it's smaller, repeat the process on the left half.
    - If it's larger, repeat the process on the right half.
    - Repeat until the target is found or the interval is empty.

    2. **Applications**:
    - **Databases**: Searching for a record in a sorted database or index.
    - **Search Engines**: Retrieving data in sorted indexes or dictionaries.
    - **Gaming**: Quickly finding elements, like ranks or scores, in a sorted list.
    - **Networking**: Searching for IP addresses or other sorted data tables.
    - **Data Analysis**: Performing efficient searches in large sorted datasets.
    - **Library Systems**: Locating books or resources in a sorted catalog.

    3. **Advantages**:
    - Significantly faster than Linear Search for large datasets (𝑂(𝑛)).
    - Very low memory footprint in its iterative implementation.

    4. **Limitations**:
    - Requires the array to be sorted before searching.
    - Not suitable for dynamically updated datasets unless re-sorted frequently.
    */

    public static void main(String[] args) {
        int target = 1;
        int num = 100000;
        int[] array = new int[num];

        for (int i = 0; i < num - 1; i++) {
            array[i] = i;
        }

        //        int index =  Arrays.binarySearch(array, target);
        int index = binarySearch(array, target);

        if (index == -1) {
            System.out.println("No such element");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = array[mid];
            if (value < target) {
                low = mid + 1;
            } else if (value > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
