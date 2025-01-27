public class NodesInBinaryTree
{
    static class Node
    {
        int data;
        Node right;
        Node left;
        Node(int data )
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    Node root;
    NodesInBinaryTree()
    {
        root=null;
    }
    //Function to calculate count of nodes
    public int countofNodes(Node root)
    {
        //Base Case
        if(root==null)
        {
            return 0;
        }
        return 1+countofNodes(root.left)+countofNodes(root.right);
    }
    public static void main (String args[])
    {
        NodesInBinaryTree tree = new NodesInBinaryTree();
        // Manually create a binary tree for testing
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right=new Node(6);
        tree.countofNodes(tree.root);
        System.out.println("Total No of Nodes: "+tree.countofNodes(tree.root));
    }
}
