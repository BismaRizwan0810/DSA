public class SumofNodesInBinaryTree {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    SumofNodesInBinaryTree() {
        root = null;
    }

    public int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }

    public static void main(String[] args) {
        SumofNodesInBinaryTree tree = new SumofNodesInBinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int totalSum = tree.sumNodes(tree.root);
        System.out.println("The sum of all nodes in the binary tree is: " + totalSum);
    }
}
