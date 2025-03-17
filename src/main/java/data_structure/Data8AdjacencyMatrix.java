package data_structure;

public class Data8AdjacencyMatrix {
    /*
    An Adjacency Matrix is a 2D array representation of a graph, where rows and columns correspond to graph vertices.
    Each entry in the matrix indicates the presence or weight of an edge.

    1. Key Features:
    	- Matrix Representation: A square matrix of size V x V, where V is the number of vertices in the graph.
    	- Edge Representation:
    		- For unweighted graphs, a cell contains 1 if an edge exists and 0 otherwise.
    		- For weighted graphs, a cell contains the edge weight or 0 if no edge exists.
    		- For directed graphs, an edge from vertex i to vertex j is represented by matrix[i][j].
    		- For undirected graphs, edges are symmetric, so both matrix[i][j] and matrix[j][i] are marked.
    	- Diagonal Entries: Represent self-loops if applicable.

    2. Run Time Complexity:
    		- Edge Lookup: O(1) - Constant time access to check if an edge exists.
    		- Insertion/Deletion:
    			- Average Case: O(1) - Modify a single matrix entry.
    			- Worst Case: O(V^2) - Updating the entire matrix structure.

    3. Applications:
    	- Pathfinding Algorithms: Useful in algorithms like Floyd-Warshall for shortest path computation.
    	- Graph Representation: Ideal for dense graphs with many edges.
    	- Network Analysis: Commonly used to model communication or transport networks.
    	- Quick Edge Checking: Allows for constant time adjacency queries.

    4. Advantages:
    	- Fast Access: Efficient for edge existence checks.
    	- Consistent Structure: Works equally well for weighted, unweighted, directed, and undirected graphs.
    	- Simplicity: Straightforward to implement and easy to interpret.

    5. Limitations:
    	- Memory Inefficiency: Requires O(V^2) space, even for sparse graphs.
    	- Not Ideal for Sparse Graphs: Overhead when the number of edges is far fewer than the maximum possible.
    	- Inefficiency in Edge Operations: Requires unnecessary memory allocation for sparse graphs.
    */

    public static void main(String[] args) {
        Data8AdjacencyMatrix graph = new Data8AdjacencyMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.display();
    }

    private int[][] matrix; // 2D array to store the adjacency matrix
    private int vertices; // Number of vertices in the graph

    // Constructor to initialize the matrix
    public Data8AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // Add an edge from source to destination (and optionally for undirected graphs)
    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
        // Uncomment the following line for an undirected graph
        // matrix[destination][source] = 1;
    }

    // Remove an edge from source to destination
    public void removeEdge(int source, int destination) {
        matrix[source][destination] = 0;
        // Uncomment the following line for an undirected graph
        // matrix[destination][source] = 0;
    }

    // Print the adjacency matrix
    public void display() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
