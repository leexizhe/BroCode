package data_structure;

import java.util.ArrayList;
import java.util.List;

public class Data9AdjacencyList {
    /*
    An Adjacency List is an efficient representation of a graph as a collection of lists, where each list corresponds to a vertex.
    Each list contains the neighbors of the corresponding vertex.

    1. Key Features:
    	- List Representation: The graph is represented as an array of lists.
    	- Edge Representation:
    		- For unweighted graphs, lists store only the connected vertices.
    		- For weighted graphs, lists store pairs of vertices and edge weights.
    		- For directed graphs, only the outgoing edges for each vertex are stored.
    		- For undirected graphs, edges are stored symmetrically (i.e., in both lists of the connected vertices).
    	- Edge Storage: Suitable for sparse graphs due to compact memory usage.

    2. Run Time Complexity:
    		- Edge Lookup: O(V) in the worst case, as it requires scanning the list of neighbors.
    		- Insertion/Deletion:
    			- Adding an Edge: O(1) - Adding an element to a list.
    			- Removing an Edge: O(V) - Finding and removing the element from a list.

    3. Applications:
    	- BFS/DFS Algorithms: Efficiently traverses graphs using the adjacency list structure.
    	- Sparse Graph Representation: Ideal for graphs with fewer edges compared to the number of vertices.
    	- Network Analysis: Used to model networks, social connections, or transport systems efficiently.

    4. Advantages:
    	- Space Efficiency: Requires O(V + E) space, much lower than an adjacency matrix for sparse graphs.
    	- Flexibility: Handles dynamic graph changes (e.g., adding/removing edges) effectively.
    	- Faster Iteration: Suitable for traversing all neighbors of a vertex.

    5. Limitations:
    	- Edge Lookup Inefficiency: Requires scanning a list, which can be slow for vertices with many edges.
    	- Complexity: Slightly more complex implementation compared to an adjacency matrix.
    */

    public static void main(String[] args) {
        Data9AdjacencyList graph = new Data9AdjacencyList(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.display();
    }

    private List<List<Integer>> adjacencyList; // Adjacency list representation
    private int vertices; // Number of vertices in the graph

    // Constructor to initialize the adjacency list
    public Data9AdjacencyList(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Add an edge from source to destination (and optionally for undirected graphs)
    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        // Uncomment the following line for an undirected graph
        // adjacencyList.get(destination).add(source);
    }

    // Remove an edge from source to destination
    public void removeEdge(int source, int destination) {
        adjacencyList.get(source).remove(Integer.valueOf(destination));
        // Uncomment the following line for an undirected graph
        // adjacencyList.get(destination).remove(Integer.valueOf(source));
    }

    // Print the adjacency list
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex: " + i + " -> ");
            for (Integer edge : adjacencyList.get(i)) {
                System.out.print(edge + " -> ");
            }
            System.out.println();
        }
    }
}
