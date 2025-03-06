package data_structure;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Data3PriorityQueue {
    /*
    Priority Queue = A FIFO data structure that serves elements
    with the highest priorities first
    before elements with lower priority
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
