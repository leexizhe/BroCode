package algorithm;

public class Algo3BinarySearch {
    /*
    Binary Search is a searching algorithm that efficiently finds the position of a target value within a sorted array.
    It repeatedly divides the search interval in half, comparing the target value to the middle element and narrowing down the interval until the target value is found.
    Run Time Complexity: best case: 𝑂(1), worst case: 𝑂(log 𝑛)

    1. Databases: Efficiently searching for records in sorted databases, such as finding a specific entry in a large dataset.

    2. File Systems: Quickly locating files or records in a sorted file system, especially useful for hierarchical file structures.

    3. Competitive Programming: Commonly used in coding competitions and interviews due to its efficiency and simplicity.

    4. Search Algorithms: Often used as a foundational technique in other more complex search algorithms, providing a quick method for locating elements.

    5. Game Development: Efficiently managing sorted game data, such as finding high scores or specific game assets.

    6. Library Systems: Searching for books or materials in a sorted catalog, improving the efficiency of the retrieval process.

    7. Operating Systems: Used in various system-level operations, such as memory management and process scheduling, where quick searches in sorted lists are required.
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
