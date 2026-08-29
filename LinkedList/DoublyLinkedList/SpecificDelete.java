package LinkedList.DoublyLinkedList;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class SpecificDelete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Nodes");
        int n = scan.nextInt();
        Node head = null;
        Node current = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                current = newnode;
            } else {
                current.next = newnode;
                newnode.prev = current;
                current = newnode;
            }
        }
        current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println("Enter the target element to be Deleted");
        int target = scan.nextInt();
        // find the target value
        current = head;
        while (current != null && current.data != target) {
            current = current.next;
        }
        // checks if value found or not
        if (current == null) {
            System.out.println("Value not found");
        }
        // if target is first node deletes the first node
        else if (current.prev == null) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            }
        }
        // delete last node if last node is target
        else if (current.next == null) {
            current.prev.next = null;
        }
        // if target found in middle delete middle node
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        // Display After Deletion
        System.out.println("After Deleting:");
        current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
    }
}