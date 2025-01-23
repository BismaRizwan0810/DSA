public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Function to add a node at the end of the list
    public void add(int data) {
        Node NewNode = new Node(data);

        if (head == null) {
            head = NewNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = NewNode;
        }
    }

    // Function to detect loop
    public boolean DetectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer by one step
            fast = fast.next.next;   // Move fast pointer by two steps

            if (slow == fast) {
                return true;  // If slow and fast meet, loop is detected
            }
        }
        return false;  // No loop detected
    }

    // Main method to test the loop detection
    public static void main(String args[]) {
        LinkedList List = new LinkedList();
        List.add(1);  // Add node with data 1
        List.add(2);  // Add node with data 2
        List.add(3);  // Add node with data 3
        List.add(4);  // Add node with data 4

        // Create a wrong loop (making 4th node point to 2nd node, no circular loop)
        List.head.next.next.next.next = List.head.next;

        if (List.DetectLoop()) {
            System.out.println("Detectloop");  // Will print if loop detected
        } else {
            System.out.println("No loop");     // Will print if no loop detected
        }
    }
}
