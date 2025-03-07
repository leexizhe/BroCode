package data_structure;

import java.util.ArrayList;
import java.util.LinkedList;

public class Data6LinkedListsvsArrayLists {

    public static void main(String[] args) {

        /*
        LinkedList: Better suited for scenarios with frequent insertions and deletions at the beginning or middle, and when implementing deque operations.
        ArrayList: Better suited for scenarios requiring fast random access and less frequent modifications.
        */

        /*
        Comparison of ArrayList and LinkedList Operations

        1. Access (get):
        - ArrayList: O(1)
        - LinkedList: O(n)

        2. Insertions/Deletions (beginning):
        - ArrayList: O(n)
        - LinkedList: O(1)

        3. Insertions/Deletions (middle):
        - ArrayList: O(n)
        - LinkedList: O(n) (but efficient pointer manipulation)

        4. Insertions/Deletions (end):
        - ArrayList: O(1) (amortized)
        - LinkedList: O(1)

        5. Memory Efficiency:
        - ArrayList: Less memory-efficient
        - LinkedList: More memory-efficient for frequent changes

        6. Deque Operations:
        - ArrayList: Not implemented
        - LinkedList: Implemented (e.g., addFirst, addLast)
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
