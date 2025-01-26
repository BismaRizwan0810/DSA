public class BinaryTree
{
    static class Node
    {
        int data;
        Node left;
        Node right ;

        Node ( int data ) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    Node root;
    BinaryTree()
    {
        this.root=null;
    }

    //Post Order traversal (Left -> right -> root)
    public void postorder(Node node )
    {
        if(node==null)
        {
            System.out.print("-1 ");
            return;
        }
        else
        {
            postorder(node.left);//visit left subtree
            postorder(node.right);//visit right subtree
            System.out.print(node.data+ " ");//visit root
        }

    }
    public void preorder(Node node)
    {
        if(node==null)
        {
            System.out.print("-1 ");
            return;
        }
        else
        {
            System.out.print(node.data+" ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    public void inorder(Node node)
    {
      if(node==null)
      {
          System.out.print("-1 ");
          return;
      }
      else
      {
          inorder(node.left);
          System.out.print(node.data+" ");
          inorder(node.right);
      }
    }

    public static void main( String [] args)
    {
        BinaryTree BT = new BinaryTree();
        BT.root = new Node(1);
        BT.root.left = new Node(2);
        BT.root.right =new Node(3);
        BT.root.left.left= new Node(4);
        BT.root.left.right= new Node(5);
        BT.root.right.right=new Node(6);
        System.out.print("\nPREORDER TRAVERSAL");
        BT.preorder(BT.root);
        System.out.print("\nINORDER TRAVERSAL");
        BT.inorder(BT.root);
        System.out.print("\nPOSTORDER TRAVERSAL");
        BT.postorder(BT.root);
    }
}