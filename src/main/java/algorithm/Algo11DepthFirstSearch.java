package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Algo11DepthFirstSearch {
    /*
    Depth First Search (DFS) is a graph traversal algorithm that explores as far as possible along each branch before backtracking.

    1. Key Features:
    	- Exploration: DFS explores a graph depth-wise, prioritizing deeper nodes before backtracking.
    	- Traversal Order: Can be used on directed and undirected graphs.
    	- Storage Mechanism: Utilizes a stack, either explicitly (iterative) or implicitly (recursive call stack).

    2. Run Time Complexity:
    	- Time Complexity: O(V + E), where V = vertices, and E = edges.
    	- Space Complexity: O(V), due to the recursion stack or explicit stack usage.

    3. Applications:
    	- Pathfinding: Useful for exploring all possible paths in a graph.
    	- Cycle Detection: Determines if a graph contains cycles.
    	- Connected Components: Identifies distinct connected components in undirected graphs.
    	- Solving Puzzles: Effective for solving mazes or similar problems.
    	- Topological Sorting: Useful for directed acyclic graphs (DAGs).

    4. Advantages:
    	- Memory Efficiency: Efficient for traversing large sparse graphs.
    	- Recursive Implementation: Simple and intuitive to implement.

    5. Limitations:
    	- Stack Overflow: For graphs with a high depth, recursion may lead to stack overflow.
    	- Non-Optimal Paths: DFS doesn't guarantee the shortest path in weighted graphs.
    */

    public static void main(String[] args) {
        Algo11DepthFirstSearch graph = new Algo11DepthFirstSearch(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(4, 3);

        graph.display();

        System.out.println("DFS Traversal starting from vertex 0:");
//        graph.depthFirstSearch(0);
//        graph.depthFirstSearch(1);
        graph.depthFirstSearch(1);
//        graph.depthFirstSearch(3);
//        graph.depthFirstSearch(4);
    }

    private List<List<Integer>> adjacencyList; // Adjacency list representation of the graph
    private boolean[] visited; // Array to track visited vertices

    // Constructor to initialize graph with given vertices
    public Algo11DepthFirstSearch(int vertices) {
        adjacencyList = new ArrayList<>();
        visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add an edge from source to destination (directed graph)
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        // Uncomment for undirected graph:
        // adjacencyList.get(destination).add(source);
    }

    // Display the graph as an adjacency list
    public void display() {
        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print("Vertex " + i + " -> ");
            for (int neighbor : adjacencyList.get(i)) {
                System.out.print(neighbor + " -> ");
            }
            System.out.println();
        }
    }

    // Perform Depth First Search starting from a given vertex
    public void depthFirstSearch(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " -> ");

        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                depthFirstSearch(neighbor);
            }
        }
    }
}
