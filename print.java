// A linked list node
class Node {
    int data;
    Node next;

    // Constructor to initialize a new node with data
    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

class GfG {

    // Function to print the singly linked list
    static void printList(Node head) {

        // Base condition is when the head is nullptr
        if (head == null) {
            return;
        }

        // Printing the current node data
        System.out.print(head.data + " ");

        // Moving to the next node
        printList(head.next);
    }

    public static void main(String[] args) {
      
        // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);
    }
}