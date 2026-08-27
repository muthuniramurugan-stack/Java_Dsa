// search the element using the index
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

public class SearchIndex {
    public static void main(String[] args) {
        int index = 3;
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
        int i = 1;
        while (current != null) {
            if (i == index) {
                System.out.println(current.data);
                break;
            }
            i++;
            current = current.next;

        }
    }
}
