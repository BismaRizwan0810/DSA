public class LevelsOfBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    LevelsOfBinaryTree() {
        this.root = null;
    }
    //function to calculate the levels
    public int calculatelevels(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        //Create queue
        Node [] queue = new Node [100];
        //Initialize the pointers
        int front =0;
        int rear=0;
        //Enqueue the root
        //When the root node is added to the queue the rear point increases
        queue[rear++]=root;
        int levels =0;
        while(front<rear)
        {
            int size =rear-front;//Number of nodes in the current level
            //Deqeue the front node and store it into the cuurent variable
            for (int i=0;i<size;i++)
            {
                Node current = queue[front ++];
                if(current.left!=null)
                {
                    queue[rear++]=current.left;
                }
                if(current.right!=null)
                {
                    queue[rear++]=current.right;
                }
            }
            levels ++;
        }
        return levels;
    }
    public static void main (String args[])
    {
        LevelsOfBinaryTree BT = new LevelsOfBinaryTree();
        BT.root = new Node(1);
        BT.root.left = new Node(2);
        BT.root.right = new Node(3);
        BT.root.left.left = new Node(4);
        BT.root.left.right = new Node(5);
        BT.calculatelevels(BT.root);
        System.out.println(+BT.calculatelevels(BT.root));

    }
}