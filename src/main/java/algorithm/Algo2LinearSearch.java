package algorithm;

public class Algo2LinearSearch {

    /*
    Linear Search is the simplest searching algorithm that checks every element in the list sequentially until the desired value is found or the list ends.
    Run Time Complexity:
    	- Best Case: 𝑂(1) (when the target element is at the beginning)
    	- Worst/Average Case: 𝑂(𝑛)
    Space Complexity: 𝑂(1)

    1. Algorithm:
    	- Start at the first element in the array.
    	- Compare each element with the target value.
    	- If a match is found, return the index of the element.
    	- If no match is found, return a flag value (e.g., -1) to indicate absence.

    2. Applications:
    	- Small Data Sets: Works well when dealing with small or unsorted data.
    	- Unordered Data: Ideal when the dataset is not sorted, as sorting is not required for this algorithm.
    	- Finding Duplicates: Useful for identifying duplicate entries in lists.
    	- Limited Comparisons: Can be used if the target is expected to be near the beginning.
    	- Debugging: Helps debug to check the presence of values in smaller collections.

    3. Advantages:
    	- Simple to implement and understand.
    	- No pre-processing of data (e.g., sorting) is needed.
    	- Works on all types of data structures like arrays, lists, and linked lists.

    4. Limitations:
    	- Inefficient for large datasets compared to more advanced algorithms like Binary Search.
    	- Higher time complexity for unsorted data compared to optimized methods.
    */

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 10, 7, 8};

        int index = linearSearch(arr, 12);

        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found index: " + index);
        }
    }

    private static int linearSearch(int[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                return i;
            }
        }
        return -1;
    }
}
