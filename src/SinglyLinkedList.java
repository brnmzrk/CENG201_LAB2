/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:       Baran MIZRAK
 * Your Student ID:  240444026
 * Your Date:       12.10.2026
 */

public class SinglyLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SinglyLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
        Node n1 = new Node(data);
        if (head == null){
            head = n1;
        }

        Node n2 = head;

        while (n2.next != null){
            n2 = n2.next;
        }

        n2.next = n1;
    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print the data values in this format:
        //
        // 1 --> 2 --> 3 --> 4 --> 5 --> NULL

        Node n3 = head;

        while (n3 != null){
            System.out.printf(n3.next + " -> ");
            n3 = n3.next;
        }
        System.out.println("null");
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        // TODO:
        //
        // Find and return the middle node.
        // For an odd number of nodes:
        //     1 --> 2 --> 3 --> 4 --> 5
        //                 ^
        //              middle
        //
        // For an even number of nodes:
        //     10 --> 20 --> 30 --> 40 --> 50 --> 60
        //                          ^
        //                        middle
        // IMPORTANT:
        // For an even-sized list, return the SECOND
        // middle node.
        if (head == null){
            return null;
        }
        Node n4 = head;
        Node n5 = head;

        while (n5 != null && n5.next != null){
            n4 = n4.next;
            n5 = n5.next.next;
        }
        return n4;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}