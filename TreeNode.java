class TreeNode {
    int data;
    TreeNode left, right;

    // Constructor to create a new node
    TreeNode(int item) {
        data = item;
        left = right = null;
    }

    // Function to check the children sum property
    boolean checkChildrenSumProperty(TreeNode node) {
        // Agar node null ho ya leaf node ho (left aur right dono null hon)
        if (node == null || (node.left == null && node.right == null)) {
            return true;
        }

        // Left aur right child ka data ko manually check kar rahe hain
        int leftData = 0;
        if (node.left != null) {
            leftData = node.left.data;
        }

        int rightData = 0;
        if (node.right != null) {
            rightData = node.right.data;
        }

        // Agar current node ka data left aur right ka sum ke barabar ho
        if (node.data == leftData + rightData
                && (node.left == null || checkChildrenSumProperty(node.left))  // Left child ki property check karo
                && (node.right == null || checkChildrenSumProperty(node.right))) {  // Right child ki property check karo
            return true;
        }

        return false;  // Agar property violate ho rahi ho
    }

    public static void main(String[] args) {
        // Tree bana rahe hain
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(8);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(2);

        // Function ko call kar ke result dekh rahe hain
        if (root.checkChildrenSumProperty(root)) {
            System.out.println("Children sum property is satisfied");
        } else {
            System.out.println("Children sum property is violated");
        }
    }
}
