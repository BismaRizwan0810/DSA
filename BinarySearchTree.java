/*

NAME : BISMA RIZWAN
ROLL NO : SE 231069
 */


import java.util.Scanner;

public class BinarySearchTree {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return key < root.data ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }

    private int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            minVal = root.left.data;
            root = root.left;
        }
        return minVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            bst.insert(scanner.nextInt());
        }

        System.out.println("In-order Traversal of BST:");
        bst.inOrderTraversal();

        System.out.println("Enter a number to search in the BST:");
        int searchKey = scanner.nextInt();
        if (bst.search(searchKey)) {
            System.out.println(searchKey + " is found in the BST.");
        } else {
            System.out.println(searchKey + " is not found in the BST.");
        }

        System.out.println("Enter a number to delete from the BST:");
        int deleteKey = scanner.nextInt();
        bst.delete(deleteKey);

        System.out.println("In-order Traversal of BST after deletion:");
        bst.inOrderTraversal();

        scanner.close();
    }
}
