public class InsertionAtBeggining{
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
        Node head;
        int size=0;
        public void add(int data )
        {
            Node NewNode=new Node(data);
            if(head==null)
            {
                head=NewNode;
            }
        }

}
