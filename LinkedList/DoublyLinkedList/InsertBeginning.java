// insert the element in the begining of the Linkedlist
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
public class InsertBeginning {
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
                newnode.prev=current;
                current = newnode;
            }
        }

        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.print("null");
        current = head;
        System.out.print("Enter the value to added");
        int val = scan.nextInt();
        Node n1 = new Node(val);
       n1.prev=null;
       n1.next=head;
       head.prev=n1;
       head=n1;
       current=head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }

    }
}
