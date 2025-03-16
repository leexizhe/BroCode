package algorithm;

public class Algo1BigO {

    /*
    Big O Notation is a mathematical concept used in computer science to describe the performance or complexity of an algorithm, particularly in terms of its time or space requirements as the input size grows.

    1. Purpose:
    	- To estimate the efficiency of an algorithm by analyzing how its runtime or memory usage grows with input size.
    	- Helps compare different algorithms and choose the most optimal one for a specific problem.

    2. Types of Big O Complexity:
    	- Constant Time (𝑂(1)): Algorithm runs in the same amount of time, regardless of input size.
    	Example: Accessing an element in an array by index.
    	- Logarithmic Time (𝑂(log 𝑛)): Time increases logarithmically with input size.
    	Example: Binary Search.
    	- Linear Time (𝑂(𝑛)): Time grows linearly with the input size.
    	Example: Linear Search.
    	- Linearithmic Time (𝑂(𝑛 log 𝑛)): Time grows at a combination of linear and logarithmic rates.
    	Example: Merge Sort, QuickSort (on average).
    	- Quadratic Time (𝑂(𝑛²)): Time grows quadratically with input size.
    	Example: Bubble Sort, Selection Sort.
    	- Exponential Time (𝑂(2ⁿ)): Time doubles with each additional input.
    	Example: Solving the Tower of Hanoi problem.
    	- Factorial Time (𝑂(𝑛!)): Time grows factorially with input size.
    	Example: Solving the N-Queens problem using brute force.

    3. Applications:
    	- Algorithm Design: Helps in designing efficient algorithms for specific tasks.
    	- Performance Optimization: Identifies bottlenecks and suggests areas for improvement.
    	- Scalability Testing: Assesses how an algorithm performs with large inputs.

    4. Importance:
    	- Provides a worst-case, average-case, or best-case analysis of an algorithm.
    	- Ensures informed decision-making when selecting or implementing algorithms.

    5. Visual Insight:
    	- Graphs depicting these complexities show how runtime increases as the input size (𝑛) grows, highlighting which algorithms scale better.

    6. Examples:
    	- Searching:
    	* Linear Search: 𝑂(𝑛)
    	* Binary Search: 𝑂(log 𝑛)
    	- Sorting:
    	* Bubble Sort: 𝑂(𝑛²)
    	* Merge Sort: 𝑂(𝑛 log 𝑛)
    	- Recursion:
    	* Fibonacci (without memoization): 𝑂(2ⁿ)
    	* Fibonacci (with memoization): 𝑂(𝑛)
    */

    public static void main(String[] args) {
        System.out.println("Big O");
    }
}
