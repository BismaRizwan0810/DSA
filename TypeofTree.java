
//Check whether the tree is complete tree ,full tree or both
public class TypeofTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    TypeofTree() {
        root = null;
    }

    public boolean isFullTree(Node node) {
        if (node == null)//Tree empty
        {
            return true;
        }
        if (node.left == null && node.right == null)//leaf node
        {
            return true;
        }
        if (node.left != null && node.right != null) {
            return isFullTree(node.left) && isFullTree(node.right);
        }
        // if one children is missing it is not a full binary tree
        return false;
    }

    public boolean iscompleteTree(Node root, int index, int nodeCount) {
        if (root == null) {
            return true;
        }
        if (index >= nodeCount) {
            return false;
        }
        return iscompleteTree(root.left, 2 * index + 1, nodeCount) &&
                iscompleteTree(root.right, 2 * index + 2, nodeCount);
    }

    public int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        TypeofTree tree = new TypeofTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        int nodeCount = tree.countNodes(tree.root);
        boolean isFull = tree.isFullTree(tree.root);
        boolean isComplete = tree.iscompleteTree(tree.root, 0, nodeCount);
        System.out.println("Is the tree full? " + isFull);
        System.out.println("Is the tree complete? " + isComplete);

        if (isFull && isComplete) {
            System.out.println("The tree is both full and complete.");
        } else if (isFull) {
            System.out.println("The tree is a full tree but not complete.");
        } else if (isComplete) {
            System.out.println("The tree is a complete tree but not full.");
        } else {
            System.out.println("The tree is neither full nor complete.");
        }
    }
    }


