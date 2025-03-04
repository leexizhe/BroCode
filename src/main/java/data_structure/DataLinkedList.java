package data_structure;

import java.util.LinkedList;

public class DataLinkedList {
    /*
    LinkedList =  Nodes are in 2 parts (data + address)
    			Nodes are in non-consecutive memory locations
    			Elements are linked using pointers

    advantages?
    1. Dynamic Data Structure (allocates needed memory while running)
    2. Insertion and Deletion of Nodes is easy. O(1)
    3. No/Low memory waste

    disadvantages?
    1. Greater memory usage (additional pointer)
    2. No random access of elements (no index [i])
    3. Accessing/searching elements is more time consuming. O(n)

    uses?
    1. implement Stacks/Queues
    2. GPS navigation
    3. music playlist

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
