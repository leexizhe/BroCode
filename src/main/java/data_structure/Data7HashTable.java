package data_structure;

import java.util.Hashtable;

public class Data7HashTable {
    /*
    A Hash Table is a data structure that stores data in key-value pairs, allowing for efficient data retrieval using a unique key.
    It uses a hash function to compute an index where the value is stored.

    1. **Key Features**:
    	- **Key-Value Pairing**: Data is stored in the form of keys and their associated values.
    	- **Hash Function**: Computes the index for storing data in an array (buckets).
    	- **Collision Handling**: Uses techniques like chaining or open addressing to manage collisions (when multiple keys hash to the same index).

    2. **Run Time Complexity**:
    	- Access: Average Case: 𝑂(1), Worst Case: 𝑂(𝑛) (with poor hash function or collisions)
    	- Insertion/Deletion: Average Case: 𝑂(1), Worst Case: 𝑂(𝑛)

    3. **Applications**:
    	- **Databases**: Quickly indexing and retrieving data, such as user profiles by unique ID.
    	- **Caching**: Storing frequently accessed data (e.g., web pages, session data) for faster lookup.
    	- **Cryptography**: Efficiently managing keys for secure data storage or transmission.
    	- **Compilers**: Maintaining symbol tables to manage variables and functions.
    	- **Routing Tables**: Used in networking to map IP addresses to hostnames or routes.
    	- **Search Engines**: Quickly indexing and retrieving search results.
    	- **Gaming**: Managing assets (e.g., objects, player stats) with unique identifiers.

    4. **Advantages**:
    	- High efficiency for lookup, insert, and delete operations.
    	- Flexible for dynamic datasets with unique keys.

    5. **Limitations**:
    	- Collisions require extra handling, which can impact performance.
    	- Inefficient for ordered data (does not maintain sorting).
    	- Memory overhead due to storing pointers or managing collisions.
    */

    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(10);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
    }
}
