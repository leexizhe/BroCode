package data_structure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Data3PriorityQueue {
    /*
    A Priority Queue is a special type of queue where each element is associated with a priority,
    and elements are dequeued based on their priority rather than their insertion order.
    By default, the element with the highest (or lowest) priority is dequeued first.

    1. **Key Operations**:
    	- **Enqueue (add)**: Inserts an element into the queue with an associated priority.
    	- **Dequeue (poll)**: Removes the element with the highest (or lowest) priority.
    	- **Peek**: Retrieves the highest (or lowest) priority element without removing it.

    2. **Run Time Complexity**:
    	- Insertion: 𝑂(log 𝑛) (with a binary heap implementation)
    	- Deletion: 𝑂(log 𝑛)
    	- Peek: 𝑂(1)

    3. **Applications**:
    	- **Scheduling Algorithms**: Used in operating systems for task scheduling, such as CPU scheduling.
    	- **Dijkstra's Algorithm**: Helps find the shortest paths in graphs.
    	- **Event-Driven Simulations**: Manages events in simulation systems.
    	- **Job Queueing**: Processes tasks by priority in job queues (e.g., print queues).
    	- **Data Compression**: Implements Huffman coding in text compression.
    	- **Networking**: Schedules packets based on priority in routers.

    4. **Types of Priority Queues**:
    	- **Min-Priority Queue**: Dequeues elements with the lowest priority first.
    	- **Max-Priority Queue**: Dequeues elements with the highest priority first.

    5. **Advantages**:
    	- Efficiently manages elements based on priority.
    	- Flexible, allowing dynamic changes in priorities.

    6. **Limitations**:
    	- Typically requires extra memory for managing priority.
    	- Insertion and deletion are slower compared to a simple queue.

    7. **Implementation in Java**:
    	- Java's `PriorityQueue` class in the `java.util` package provides a built-in implementation.
    	Example:
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	pq.add(10);     // Enqueue
    	pq.add(5);      // Enqueue
    	pq.poll();      // Dequeue (removes the smallest element by default)
    */

    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();
        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(5.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("--------------------------------");

        Queue<Double> queueReverse = new PriorityQueue<>(Collections.reverseOrder());
        queueReverse.offer(1.0);
        queueReverse.offer(2.0);
        queueReverse.offer(3.0);
        queueReverse.offer(4.0);
        queueReverse.offer(5.0);

        while (!queueReverse.isEmpty()) {
            System.out.println(queueReverse.poll());
        }
    }
}
