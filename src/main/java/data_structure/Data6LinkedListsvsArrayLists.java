package data_structure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Data6LinkedListsvsArrayLists {

    public static void main(String[] args) {

        /*
        1. Structure:
        	- LinkedList: Uses a doubly linked list structure; each node points to its previous and next node.
        	- ArrayList: Uses a dynamic array structure; elements are stored contiguously.

        2. Performance:
        	- Adding/Removing:
        		* LinkedList: Efficient for frequent insertions/removals at the beginning or middle (𝑂(1) when at a node, otherwise 𝑂(𝑛)).
        		* ArrayList: Inserting/removing elements at the end is efficient (𝑂(1)), but costly elsewhere (𝑂(𝑛)).
        	- Access:
        		* LinkedList: Slow (𝑂(𝑛)) as you must traverse nodes sequentially.
        		* ArrayList: Fast (𝑂(1)) as it uses direct index-based access.

        3. Memory Usage:
        	- LinkedList: More memory-intensive due to storage of pointers for previous/next nodes.
        	- ArrayList: Uses less memory as it doesn’t have pointers.

        4. Iteration:
        	- LinkedList: Better performance for iterative operations like adding/removing elements during iteration (using ListIterator).
        	- ArrayList: Performs well with simple traversal and random access.

        5. Use Cases:
        	- LinkedList: Suitable for scenarios requiring frequent insertions/removals in the middle or beginning of a list.
        	- ArrayList: Ideal for cases requiring fast random access and minimal modifications.

        6. Thread-Safety:
        	- Both are not thread-safe by default; synchronization must be handled externally for concurrent use.
        */

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        /*
        Implementation: ArrayList is backed by a dynamic array.
        Time Complexity: It offers O(1) time complexity for accessing elements by index.
        This means that any element can be accessed directly by its index without iterating through other elements.
        The index calculation is very straightforward.
         */

        /*
        Implementation: LinkedList is backed by a doubly linked list.
        Time Complexity: It offers O(n) time complexity for accessing elements by index.
        To get to the desired element, the linked list must traverse the list from the beginning
        (or end, if it is closer) until the desired index is reached.
         */

        startTime = System.nanoTime();
        linkedList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get(0): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get(0):" + elapsedTime + " ns");

        startTime = System.nanoTime();
        linkedList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get(500000): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get(500000):" + elapsedTime + " ns");

        startTime = System.nanoTime();
        linkedList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList get(999999): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.get(999999);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList get(999999):" + elapsedTime + " ns");

        System.out.println("----------------");

        /*
        ArrayList
        Time Complexity: Generally O(n) for the worst case.
        Removing an element from ArrayList involves shifting all subsequent elements one position to the left to fill the gap.
        This makes the remove() operation slower for larger lists, especially when removing elements from the beginning or middle.
         */

        /*
        LinkedList
        Time Complexity: O(1) for removal of the first or last elements, O(n) for removal of an element at an arbitrary position.
        Removing an element from LinkedList is generally faster than ArrayList for arbitrary removals.
        Since nodes are linked, removing a node involves re-linking the previous and next nodes, which can be done in constant time if the node's position is known.
         */

        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove(0): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove(0):" + elapsedTime + " ns");

        startTime = System.nanoTime();
        linkedList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove(500000): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(500000);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove(500000):" + elapsedTime + " ns");

        startTime = System.nanoTime();
        linkedList.remove(999990);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList remove(999990): " + elapsedTime + " ns");
        startTime = System.nanoTime();
        arrayList.remove(999990);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList remove(999990):" + elapsedTime + " ns");
    }
}
