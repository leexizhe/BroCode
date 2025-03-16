package algorithm;

public class Algo4InterpolationSearch {
    /*
    Interpolation Search is a searching algorithm designed for sorted arrays with uniformly distributed values.
    It estimates the position of the target value by using the values' range to "interpolate" the position, making it particularly efficient for large datasets with predictable distributions.
    Run Time Complexity:
    	- Best Case: 𝑂(log(log 𝑛))
    	- Worst Case: 𝑂(𝑛) (when values are not uniformly distributed)
    Space Complexity: 𝑂(1)

    1. Algorithm:
    	- Calculate the estimated position using:
    	position = low + ((target - array[low]) * (high - low)) / (array[high] - array[low])
    	- Compare the estimated position's value with the target:
    	* If it matches, return the index.
    	* If it’s smaller, repeat the process on the right portion.
    	* If it’s larger, repeat on the left portion.
    	- Continue until the target is found or the search space is empty.

    2. Applications:
    	- Databases: Efficient searching in sorted databases with uniform distribution, such as finding records by ID.
    	- Financial Analysis: Searching for specific values in uniformly distributed financial datasets.
    	- Networking: Managing routing tables sorted by IP addresses or weights, especially when entries are uniformly distributed.
    	- Gaming: Quickly locating player scores or leaderboard rankings in a sorted dataset with predictable distributions.
    	- Inventory Systems: Searching for items in sorted inventories where item attributes are evenly spaced.
    	- Scientific Analysis: Finding specific measurements or readings in uniformly distributed datasets, like sensor data.

    3. Advantages:
    	- Outperforms Binary Search for uniformly distributed data due to its adaptive estimation.
    	- Requires no additional memory.

    4. Limitations:
    	- Performs poorly if the data is not uniformly distributed.
    	- Prone to division by zero errors when array[low] equals array[high].
    	- Works only on sorted data.
    */

    public static void main(String[] args) {
        //        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] array = {1, 2, 3, 5, 8, 109, 200, 201, 209, 1000};

        int index = interpolationSearch(array, 201);

        if (index == -1) {
            System.out.println("No match");
        } else {
            System.out.println("Found at index " + index);
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int low = 0;
        int high = array.length - 1;
        while (low <= high && value >= array[low] && value <= array[high]) {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe " + probe);
            if (array[probe] > value) {
                high = probe - 1;
            } else if (array[probe] < value) {
                low = probe + 1;

            } else {
                return probe;
            }
        }
        return -1;
    }
}
