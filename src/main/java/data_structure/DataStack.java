package data_structure;

import java.util.Stack;

public class DataStack {
    /*
    stack = LIFO data structure. Last-In First-Out
    stores objects into a sort of "vertical tower"
    push() to add objects to the top
    pop() to remove objects from the top

    uses of stacks?
    1. undo/redo features in text editors
    2. moving back/forward through browser history
    3. backtracking algorithms (maze, file directories)
    4. calling functions (call stack)
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
