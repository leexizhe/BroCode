package algorithm;

import org.w3c.dom.ls.LSOutput;

public class Algo1BigO {

    /*
    Big O Notation for Common Operations in Java

    1. ArrayList:
    - Access (get): O(1)
    - Insertions/Deletions (beginning): O(n)
    - Insertions/Deletions (middle): O(n)
    - Insertions/Deletions (end): O(1) (amortized)

    2. LinkedList:
    - Access (get): O(n)
    - Insertions/Deletions (beginning): O(1)
    - Insertions/Deletions (middle): O(n) (but efficient pointer manipulation)
    - Insertions/Deletions (end): O(1)

    3. HashMap:
    - Access (get): O(1) average, O(n) worst case
    - Insertions/Deletions: O(1) average, O(n) worst case

    4. TreeMap:
    - Access (get): O(log n)
    - Insertions/Deletions: O(log n)

    5. HashSet:
    - Access (contains): O(1) average, O(n) worst case
    - Insertions/Deletions: O(1) average, O(n) worst case

    6. TreeSet:
    - Access (contains): O(log n)
    - Insertions/Deletions: O(log n)

    7. Stack (using LinkedList):
    - Push (addFirst): O(1)
    - Pop (removeFirst): O(1)
    - Peek (getFirst): O(1)

    8. Queue (using LinkedList):
    - Enqueue (addLast): O(1)
    - Dequeue (removeFirst): O(1)
    - Peek (getFirst): O(1)
    */

    public static void main(String[] args) {
        System.out.println("Big O");
    }
}
