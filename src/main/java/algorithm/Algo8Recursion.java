package algorithm;

public class Algo8Recursion {
    /*
    Recursion is a technique where a function calls itself directly or indirectly to solve a problem.
    Each recursive call should reduce the problem to a simpler or smaller version of itself.
    Run Time Complexity:
    	- Depends on the problem and the depth of recursion.
    	- Can be optimized with techniques like memoization or dynamic programming.
    Space Complexity:
    	- Depends on the depth of the recursion stack (𝑂(𝑛) in some cases).

    1. **Key Components**:
    	- **Base Case**: The condition where recursion stops (to prevent infinite recursion).
    	- **Recursive Case**: The part where the function calls itself to break the problem into smaller sub-problems.

    2. **Applications**:
    	- **Mathematics**: Calculating factorials, Fibonacci sequences, or powers.
    	- **Sorting Algorithms**: Used in algorithms like Quick Sort and Merge Sort.
    	- **Searching Algorithms**: Depth-first search in trees and graphs.
    	- **Game Development**: For traversing game states or decision trees.
    	- **Backtracking**: Solving puzzles like Sudoku, N-Queens, or mazes.
    	- **Data Structures**: Operating on recursive data structures like linked lists, trees, and graphs.

    3. **Advantages**:
    	- Elegantly solves problems that can be broken into similar sub-problems.
    	- Simplifies the code for complex problems.

    4. **Limitations**:
    	- Inefficient for deep recursion without optimization (e.g., stack overflow).
    	- May require additional memory for the recursion stack.

    5. **Example**:
    	- Factorial of a number:
    	int factorial(int n) {
    		if (n == 0) return 1;  // Base case
    		return n * factorial(n - 1);  // Recursive case
    	}
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
