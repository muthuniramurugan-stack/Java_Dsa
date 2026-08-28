package LinkedList.SingleLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCycle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Nodes");
        int n = scan.nextInt();
        Node head = null;
        Node current = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value: ");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if (head == null) {
                head = newnode;
                current = newnode;
            } else {
                current.next = newnode;
                current = newnode;
            }
        }
        current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle) {
            System.out.print("LinkedList Cycle");
        } else {
            System.out.println("Not A LinkedList");
        }
    }
}
