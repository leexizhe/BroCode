package algorithm;

public class Algo8Recursion {
    /*
    Recursion is a programming concept where a function calls itself to solve smaller instances of a problem, eventually reaching a base case to stop the recursion.
    It is widely used for problems that can be divided into similar sub-problems.
    Time Complexity: Depends on the problem (e.g., factorial: 𝑂(𝑛), Fibonacci (naive): 𝑂(2ⁿ))

    1. Divide and Conquer: Recursion is effective for problems like merge sort, quicksort, or binary search, where the problem is divided into sub-problems.

    2. Tree and Graph Problems: It is often used for traversing trees (preorder, postorder, or inorder traversal) and graphs (DFS, backtracking).

    3. Mathematical Problems: Recursion simplifies the implementation of problems like factorials, Fibonacci sequences, and permutations/combinations.

    4. Elegance and Simplicity: Recursive solutions can be simpler and more elegant compared to iterative solutions for certain problems.

    5. Memory Usage: Recursion relies on the call stack, which can lead to higher memory usage and stack overflow if not carefully managed
    (e.g., tail recursion optimization is often needed for efficiency).
    */
    public static void main(String[] args) {
        walk(8);

        int factorial = factorial(7);
        System.out.println(factorial);

        int power = power(2, 8);
        System.out.println(power);
    }

    private static void walk(int steps) {
        if (steps < 1) return; // base case
        System.out.println("walk " + steps);
        walk(steps - 1);
    }

    private static int factorial(int num) {
        if (num == 1) return 1; // base case
        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent) {
        if (exponent == 0) return 1; // base case
        return base * power(base, exponent - 1);
    }
}
