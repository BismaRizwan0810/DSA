public class ReverseLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // Head of the linked list

    // Add method to insert elements into the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, newNode becomes head
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the last node
                current = current.next;
            }
            current.next = newNode; // Add newNode at the end
        }
    }

    // Reverse method to reverse the linked list
    public void reverse() {
        Node prev = null, current = head, temp;
        while (current != null) {
            temp = current.next; // Save next node
            current.next = prev; // Reverse pointer
            prev = current;      // Move prev to current
            current = temp;      // Move current to next node
        }
      head=prev;
    }

    // Print method to display the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();

        // Add elements to the linked list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original Linked List:");
        list.printList();

        // Reverse the linked list
        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}
