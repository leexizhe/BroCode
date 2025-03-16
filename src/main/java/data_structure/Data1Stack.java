package data_structure;

import java.util.Stack;

public class Data1Stack {
    /*
    A Stack is a linear data structure that follows the Last In, First Out (LIFO) principle,
    meaning the last element added is the first to be removed. It operates much like a stack of plates in a cafeteria.

    1. Key Operations:
    	- Push: Adds an element to the top of the stack.
    	- Pop: Removes the top element from the stack.
    	- Peek/Top: Retrieves the top element without removing it.
    	- isEmpty: Checks if the stack is empty.

    2. Run Time Complexity:
    	- Push: 𝑂(1)
    	- Pop: 𝑂(1)
    	- Peek: 𝑂(1)

    3. Applications:
    	- Expression Evaluation: Used for evaluating and converting expressions (e.g., infix to postfix).
    	- Undo Mechanisms: Common in text editors or IDEs to store history of actions.
    	- Recursion: Manages function calls via the call stack in programming.
    	- Backtracking: Helps in solving puzzles like the N-Queens problem, mazes, or the Tower of Hanoi.
    	- Browser Navigation: Tracks visited pages to implement "back" functionality.
    	- Parsing: Assists in parsing language syntax in compilers and interpreters.

    4. Advantages:
    	- Simple and efficient for its intended operations.
    	- Useful for temporary storage during processing.

    5. Limitations:
    	- Limited access to elements (only the top element can be accessed).
    	- Memory limitations in implementations using arrays, unless dynamic allocation is used.

    6. Implementation:
    	- Can be implemented using arrays or linked lists.
    	- In Java, the `Stack` class in `java.util` package is often used.
    	Example:
    	Stack<Integer> stack = new Stack<>();
    	stack.push(10);  // Add an element
    	stack.pop();     // Remove the top element
    */

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Is it empty? " + stack.isEmpty());

        stack.push("Tinker");
        stack.push("Zeus");
        stack.push("Jakiro");
        stack.push("Rick Roll");

        System.out.println("Is it empty? " + stack.isEmpty());
        System.out.println("Size is " + stack.size());
        System.out.println(stack);
        System.out.println(stack.search("Jakiro"));

        System.out.println(stack.peek());
        String pop1 = stack.pop();
        System.out.println(pop1);
        String pop2 = stack.pop();
        System.out.println(pop2);

        System.out.println("Is it empty? " + stack.isEmpty());
        System.out.println("Size is " + stack.size());
        System.out.println(stack);
        System.out.println(stack.search("Jakiro"));
    }
}
