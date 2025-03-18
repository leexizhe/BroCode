package algorithm;

public class Data13BinarySearchTrees {
    /*
    Binary Search Tree (BST) is a node-based binary tree data structure with properties that make data retrieval efficient.

    1. Key Features:
    	- Hierarchical Structure: Each node contains a key, with smaller keys in the left subtree and larger ones in the right subtree.
    	- Search Efficiency: Enables O(log N) average search time due to its organized structure.
    	- Dynamic Storage: Can dynamically adjust to insertions and deletions without reorganizing the entire structure.

    2. Run Time Complexity:
    	- Time Complexity:
    		- Average Case: O(log N) for search, insert, and delete operations.
    		- Worst Case: O(N) when the tree becomes unbalanced (e.g., resembles a linked list).
    	- Space Complexity: O(N), where N = number of nodes (due to recursive stack memory usage for operations).

    3. Applications:
    	- Search Operations: Efficient for searching an element among a large dataset.
    	- Sorting: Facilitates in-order traversal to produce a sorted list of elements.
    	- Symbol Tables: Used for implementing symbol tables in compilers.
    	- Databases: Often leveraged for indexing purposes in databases.
    	- Interval Problems: Helps solve problems dealing with intervals.

    4. Advantages:
    	- Efficiency: Provides faster search, insert, and delete operations compared to linear data structures.
    	- Ordered Data: Maintains a sorted order, which simplifies traversal and data access.
    	- Flexibility: Allows dynamic insertion and deletion of elements.

    5. Limitations:
    	- Balance Dependency: Performance degrades to O(N) if the tree is unbalanced.
    	- Memory Usage: Can require significant memory overhead due to pointers.

    Implementation Note:
    	- Self-balancing variants like AVL Tree or Red-Black Tree can address the unbalanced tree issue.
    */
    public static void main(String[] args) {
        Data13BinarySearchTrees tree = new Data13BinarySearchTrees();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();
        tree.search(2);
        tree.remove(2);
        tree.search(2);
    }

    Node root;

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            System.out.println(data + " is not found");
            return false;
        } else if (root.data == data) {
            System.out.println(data + " is found");
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {

        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found");
        }
    }

    private Node removeHelper(Node root, int data) {

        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else { // node found
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}
