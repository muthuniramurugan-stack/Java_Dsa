// Merge Two Sorted List
package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // LinkedList 01
        System.out.print("Enter number of nodes for List 1: ");
        int n1 = scan.nextInt();
        Node head1 = null;
        Node current1 = null;
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter value for List 1: ");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if (head1 == null) {
                head1 = newnode;
                current1 = newnode;
            } else {
                current1.next = newnode;
                current1 = newnode;
            }
        }
        // LinkedList 02
        System.out.print("Enter number of nodes for List 2: ");
        int n2 = scan.nextInt();
        Node head2 = null;
        Node current2 = null;
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter value for List 2: ");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if (head2 == null) {
                head2 = newnode;
                current2 = newnode;
            } else {
                current2.next = newnode;
                current2 = newnode;
            }
        }
        // print first linkedlist
        System.out.println("List 1:");
        current1 = head1;
        while (current1 != null) {
            System.out.print(current1.data + " -> ");
            current1 = current1.next;
        }
        System.out.println("null");

        // print secondLinkedList
        System.out.println("List 2:");
        current2 = head2;
        while (current2 != null) {
            System.out.print(current2.data + " -> ");
            current2 = current2.next;
        }
        System.out.println("null");
    }
}
