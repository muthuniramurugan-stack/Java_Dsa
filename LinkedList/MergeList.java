// Merge Two Sorted Lists
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
        // -------- linkedList 01 --------
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
        // -------- LinkedList 02 --------
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
        // -------- Print List 1 --------
        System.out.println("List 1:");
        current1 = head1;
        while (current1 != null) {
            System.out.print(current1.data + " -> ");
            current1 = current1.next;
        }
        System.out.println("null");
        // -------- Print List 2 --------
        System.out.println("List 2:");
        current2 = head2;
        while (current2 != null) {
            System.out.print(current2.data + " -> ");
            current2 = current2.next;
        }
        System.out.println("null");
        // -------- Merge Two Lists --------
        Node p1 = head1;
        Node p2 = head2;
        Node mergedhead = null;
        Node mergedcurrent = null;
        // Compare both lists
        while (p1 != null && p2 != null) {
            Node newnode;
            if (p1.data <= p2.data) {
                newnode = new Node(p1.data);
                p1 = p1.next;
            } else {
                newnode = new Node(p2.data);
                p2 = p2.next;
            }
            // Add node to the new merged list
            if (mergedhead == null) {
                mergedhead = newnode;
                mergedcurrent = newnode;
            } else {
                mergedcurrent.next = newnode;
                mergedcurrent = newnode;
            }
        }
        // -------- Remaining Nodes from List 1 --------
        while (p1 != null) {
            Node newnode = new Node(p1.data);
            mergedcurrent.next = newnode;
            mergedcurrent = newnode;
            p1 = p1.next;
        }
        // -------- Remaining Nodes from List 2 --------
        while (p2 != null) {
            Node newnode = new Node(p2.data);
            mergedcurrent.next = newnode;
            mergedcurrent = newnode;
            p2 = p2.next;
        }
        // -------- Print Merged List --------
        System.out.println("Merged List:");
        Node current = mergedhead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}