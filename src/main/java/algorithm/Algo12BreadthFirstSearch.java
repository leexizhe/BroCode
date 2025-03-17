package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Algo12BreadthFirstSearch {
    /*
    Breadth-First Search (BFS) is a graph traversal algorithm that explores neighbors level by level before moving on to the next depth.

    1. Key Features:
    	- Exploration: BFS explores a graph breadth-wise, visiting all the neighbors of a node before moving deeper.
    	- Traversal Order: Can be used on directed and undirected graphs.
    	- Storage Mechanism: Utilizes a queue to manage the exploration order.

    2. Run Time Complexity:
    	- Time Complexity: O(V + E), where V = vertices, and E = edges.
    	- Space Complexity: O(V), due to the queue used for storing nodes.

    3. Applications:
    	- Shortest Path: Finds the shortest path in an unweighted graph.
    	- Connected Components: Identifies distinct connected components in undirected graphs.
    	- Web Crawling: Efficient for crawling web pages linked via hyperlinks.
    	- Solving Puzzles: Effective for finding the shortest sequence of moves in puzzle games.
    	- Level Order Traversal: Used in binary trees to traverse nodes level by level.

    4. Advantages:
    	- Shortest Path: Guarantees the shortest path in unweighted graphs.
    	- Iterative Implementation: More robust for avoiding stack overflow compared to recursive methods.

    5. Limitations:
    	- Memory Usage: Requires more memory compared to DFS for storing the queue.
    	- Inefficiency: May explore unnecessary paths in certain scenarios, leading to higher computation cost.
    */

    public static void main(String[] args) {
        Algo12BreadthFirstSearch graph = new Algo12BreadthFirstSearch(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.display();

        graph.breadthFirstSearch(1);
    }

    private int[][] matrix;

    public Algo12BreadthFirstSearch(int size) {
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

    public void breadthFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while (!queue.isEmpty()) {

            src = queue.poll();
            System.out.println(src + " = visited");

            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
