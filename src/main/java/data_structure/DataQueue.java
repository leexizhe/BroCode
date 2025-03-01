package data_structure;

import java.util.LinkedList;
import java.util.Queue;

public class DataQueue {
    /*
    Queue = FIFO data structure. First-In First-Out
    			A collection designed for holding elements prior to processing
    			Linear data structure

    	insert - offer()
    	remove - poll()
    	examine - peek()

    Where are queues useful?

    1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
    2. Printer Queue (Print jobs should be completed in order)
    3. Used in LinkedLists, PriorityQueues, Breadth-first search
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
