package algorithm;

public class Algo4InterpolationSearch {
    /*
    Interpolation search is a searching algorithm that applies to a sorted array. It's particularly efficient for uniformly distributed arrays.
    Run Time Complexity: best case: 𝑂(log(log𝑛)), worst case: 𝑂(𝑛)
    Space Complexity: 𝑂(1)

    1. Databases: Efficient searching in sorted databases where the distribution of values is uniform, such as searching for a record in a large, sorted database.

    2. Data Analysis: Analyzing data sets where the values are uniformly distributed and quick searches are needed, such as financial data or sensor readings.

    3. Computer Networks: Efficiently managing routing tables or other sorted lists in network devices where the entries are uniformly distributed.

    4. File Systems: Searching for files or records in a sorted file system where the file sizes or timestamps are uniformly distributed.

    5. Gaming: Quickly searching for high scores or other sorted game data, especially if the scores are uniformly distributed.

    6. Inventory Management: Managing sorted inventories in warehouses or stores where the inventory items are uniformly distributed.

    7. Geographic Information Systems (GIS): Efficiently searching for locations or coordinates in sorted GIS data, especially if the coordinates are uniformly distributed
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
