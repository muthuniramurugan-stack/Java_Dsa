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

public class Reverse {
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

        // forward traversal
        System.out.println("Forward");
        current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("null");
        current=head;
        while(current.next!=null){
            current=current.next;
        }
        // Reverse traversal
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.prev;
        }
        System.out.print("null");
    }
}
