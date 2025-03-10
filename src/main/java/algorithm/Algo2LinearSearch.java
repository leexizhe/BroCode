package algorithm;

public class Algo2LinearSearch {

    /*
    Linear Search is a simple search algorithm that checks each element in the list sequentially until the target element is found or the end of the list is reached.
    It works on both sorted and unsorted lists.
    Run Time Complexity: best case: 𝑂(1), worst case: 𝑂(𝑛)

    1. Small Data Sets: Linear search is useful for small data sets where the overhead of more complex algorithms is not justified.

    2. Unsorted Lists: When the data is unsorted, linear search is one of the simplest methods to find an element.

    3. Debugging: Linear search can be used for debugging purposes to ensure that data is correctly located.

    4. Searching Linked Lists: Linear search is often used in linked lists since random access is not possible in such data structures.

    5. Finding Minimum/Maximum: Linear search can be used to find the minimum or maximum value in an unsorted list.

    6. Arrays with Few Elements: If the array contains only a few elements, the simplicity of linear search can be advantageous.

    7. First Occurrence Search: Linear search can be used to find the first occurrence of an element in a list.
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
