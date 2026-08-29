package LinkedList.CircularLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class circularlist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number of Nodes");
        int n = scan.nextInt();
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                tail = newnode;
                tail.next = head;
            } else {
                tail.next = newnode;
                tail = newnode;
                tail.next = head;
            }
        }
        System.out.println("Circular LinkedList: ");
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + "->");
                current = current.next;
            } while (current != head);
            System.out.println("(back to head)");
        }
    }
}
