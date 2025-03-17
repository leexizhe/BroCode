package algorithm;

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
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.display();

        System.out.println("DFS Traversal starting from vertex 0:");
        graph.depthFirstSearch(1);
    }

    private int[][] matrix;

    public Algo11DepthFirstSearch(int size) {
        matrix = new int[size][size];
    }

    public void addEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public void display() {
        System.out.println("Graph Adjacency List:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {

        if (visited[src]) {
            return;
        } else {
            visited[src] = true;
            System.out.println(src + " = visited");
        }

        for (int i = 0; i < matrix[src].length; i++) {
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
    }
}
