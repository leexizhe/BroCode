package data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class Data2Queue {
    /*
    A Queue is a linear data structure that follows the First In, First Out (FIFO) principle,
    meaning the first element added is the first one to be removed, much like a line of people waiting for a service.

    1. Key Operations:
    	- Enqueue: Adds an element to the end of the queue.
    	- Dequeue: Removes an element from the front of the queue.
    	- Peek/Front: Retrieves the element at the front without removing it.
    	- isEmpty: Checks if the queue is empty.

    2. Run Time Complexity:
    	- Enqueue: 𝑂(1)
    	- Dequeue: 𝑂(1)
    	- Peek: 𝑂(1)

    3. Applications:
    	- Task Scheduling: Used in CPU scheduling, print queue management, and task planning.
    	- Data Buffers: Implements buffers in networking, like packets sent over the internet.
    	- Breadth-First Search (BFS): Traverses trees or graphs level by level.
    	- Producer-Consumer Problem: Manages tasks between producers and consumers in concurrency.
    	- Order Processing: Maintains the sequence of orders in e-commerce or delivery systems.

    4. Advantages:
    	- Simple to implement and understand.
    	- Efficient for managing elements in a sequential order.

    5. Limitations:
    	- Limited access (can only operate on the front and rear elements).
    	- Memory allocation can be inefficient if a static array is used without a circular implementation.

    6. Types of Queues:
    	- Simple Queue: Standard FIFO queue.
    	- Circular Queue: Overcomes memory issues by wrapping around to use unused spaces.
    	- Priority Queue: Assigns priorities to elements, where higher-priority elements are dequeued first.
    	- Deque (Double-Ended Queue): Allows insertion and deletion from both ends.

    7. Implementation:
    	- Can be implemented using arrays or linked lists.
    	- Java Example:
    	Queue<Integer> queue = new LinkedList<>();
    	queue.add(10);   // Enqueue
    	queue.poll();    // Dequeue
    */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        System.out.println("Is it empty? " + queue.isEmpty());

        queue.offer("Tinker");
        queue.offer("Zeus");
        queue.offer("Jakiro");
        queue.offer("Rick Roll");

        System.out.println("Is it empty? " + queue.isEmpty());
        System.out.println("Size is " + queue.size());
        System.out.println(queue);

        System.out.println(queue.peek());
        String poll1 = queue.poll();
        System.out.println(poll1);
        String poll2 = queue.poll();
        System.out.println(poll2);
    }
}
