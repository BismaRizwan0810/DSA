/*
NAME: BISMA RIZWAN
ROLL NO:SE 231069

 */
class Queue {
    Node front, rear;
    int size;


    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int dequeue() {
        if (front == null) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    boolean isEmpty() {
        return front == null;
    }

    int size() {
        return size;
    }

    void reverseFirstKElements(int k) {
        if (k <= 0 || k > size) {
            return;
        }

        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(dequeue());
        }

        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }

        int remaining = size - k;
        for (int i = 0; i < remaining; i++) {
            enqueue(dequeue());
        }
    }

    int getMinimum() {
        if (isEmpty()) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int currentSize = size;

        for (int i = 0; i < currentSize; i++) {
            int value = dequeue();
            if (value < min) {
                min = value;
            }
            enqueue(value);
        }

        return min;
    }

    void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(100);
        queue.enqueue(150);

        System.out.println("Original Queue:");
        queue.display();

        int k = 3;
        queue.reverseFirstKElements(k);
        System.out.println("Queue after reversing first " + k + " elements:");
        queue.display();

        int min = queue.getMinimum();
        System.out.println("Minimum value in the queue: " + min);
    }
}
