package data_structure;

import java.util.LinkedList;

public class Data4LinkedList {
    /*
    A LinkedList is a linear data structure where each element (called a node) is a separate object that contains two parts:
    	- **Data**: The value of the node.
    	- **Pointer**: A reference to the next (and sometimes previous) node in the list.

    1. **Types of LinkedLists**:
    	- **Singly Linked List**: Each node points to the next node, and the last node points to null.
    	- **Doubly Linked List**: Each node contains two pointers, one pointing to the next node and the other to the previous node.
    	- **Circular Linked List**: Similar to a singly or doubly linked list, but the last node points back to the first node (making it circular).

    2. **Run Time Complexity**:
    	- Access: 𝑂(𝑛) (must traverse to reach an element)
    	- Insertion/Deletion:
    		* Beginning or Middle: 𝑂(1) (if the node location is known)
    		* End: 𝑂(𝑛) (traversal required in singly linked lists)

    3. **Applications**:
    	- **Dynamic Memory Allocation**: Suitable for collections that frequently grow and shrink.
    	- **Undo Mechanisms**: Used in text editors or IDEs for maintaining action history.
    	- **Hash Tables**: Used to handle collisions via separate chaining.
    	- **Graphs**: Represent adjacency lists for graphs.
    	- **Real-Time Applications**: Ideal for when the size of data is unpredictable and frequent insertions/deletions are required.

    4. **Advantages**:
    	- Dynamic in size; no need to predefine the size of the list.
    	- Insertion and deletion are faster compared to arrays (no shifting of elements is required).
    	- Can easily implement other data structures like stacks and queues.

    5. **Limitations**:
    	- Memory overhead due to storing pointers.
    	- Sequential access makes it slower compared to random access in arrays.

    6. **Implementation in Java**:
    	- Java’s `LinkedList` class in the `java.util` package is a built-in implementation that supports both singly and doubly linked lists.
    	Example:
    	LinkedList<Integer> linkedList = new LinkedList<>();
    	linkedList.add(10);    // Add an element
    	linkedList.remove();  // Remove an element
    */

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // LinkedList as a Stack
        // push(E e) - Adds the specified element to the beginning of the list.
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        // pop() - Removes and returns the first element of the list.
        String pop = list.pop();
        System.out.println(pop);
        System.out.println(list);
        list.clear();

        // LinkedList as a Queue
        // offer(E e) - Adds the specified element to the end of the list.
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        // poll() Retrieves and removes the first element of the list
        String poll = list.poll();
        System.out.println(poll);
        System.out.println(list);

        list.add(3, "E");
        list.add(4, "F");
        System.out.println(list.indexOf("E"));
        list.remove("E");
        System.out.println(list);
    }
}
