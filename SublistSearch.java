class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SublistSearch {

    Node head; // Head of the linked list

    // Function to add a new node to the end of the list
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // If list is empty, set head to the new node
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the last node
            }
            current.next = newNode; // Add new node at the end
        }
    }

    // Function to search for a sublist in the main list
    public boolean searchSublist(Node subList) {
        if (subList == null) {
            return true; // An empty sublist is always present
        }
        if (head == null) {
            return false; // Main list is empty but sublist is not
        }

        Node ptr1 = head;
        while (ptr1 != null) {
            Node current1 = ptr1;
            Node current2 = subList;

            // Compare sublist with the current portion of the main list
            while (current1 != null && current2 != null && current1.data == current2.data) {
                current1 = current1.next;
                current2 = current2.next;
            }

            // If sublist is completely traversed, it means we found it
            if (current2 == null) {
                return true;
            }

            // Move to the next node in main list
            ptr1 = ptr1.next;
        }

        return false;
    }

    public static void main(String[] args) {
        // Create Main List
        SublistSearch mainList = new SublistSearch();
        mainList.add(3);
        mainList.add(2);
        mainList.add(1);
        mainList.add(4);
        mainList.add(5);

        // Create Sublist
        SublistSearch subList = new SublistSearch();
        subList.add(1);
        subList.add(4);
        subList.add(5);

        // Search for Sublist
        boolean result = mainList.searchSublist(subList.head);

        // Output result
        if (result) {
            System.out.println("Sublist Found");
        } else {
            System.out.println("Sublist Not Found");
        }
    }
}
