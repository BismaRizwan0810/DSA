public class CreatingLinkedList {
    // Node class to store data and reference to the next node
    class Node {
        int data; // store the data of the node
        Node next; // store the next node address

        // Constructor to initialize the node with data
        Node(int data) {
            this.data = data; // Set the data of the node
            this.next = null; // Initially, this node does not point to any other node
        }
    }

    Node head; // Points to the first node of the list
    int size = 0; // Track the number of nodes in the list

    // Method to add a new node to the linked list
    public void add(int data) {
        // Create a new node with the given data
        Node NewNode = new Node(data);

        // If the list is empty
        if (head == null) {
            head = NewNode;
        }
        // If the list is not empty
        else {
            Node current = head;
            // Traverse the linked list until current.next != null;
            while (current.next != null) {
                current = current.next;
            }
            current.next = NewNode;
        }
        size++;
    }

    // Method to print the elements and the size of the linked list
    public void printList() {
        if (head == null) {
            System.out.println("The List is Empty");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print("|"+current.data+"|"+current.next+"| ->");
                current = current.next;
            }
            System.out.println("null");
            System.out.println("Size of the list: " + size);
        }
    }

    public static void main(String args[]) {
        CreatingLinkedList CLL = new CreatingLinkedList();
        CLL.add(20);
        CLL.add(30);
        CLL.add(40);
        CLL.add(50);

        // Call the printList method to print the list and its size
        CLL.printList();

    }
}
