// input: 1 → 2 → 3 → 4 → 5
// output: 1 → 5 → 2 → 4 → 3 → null
package LinkedList.SingleLinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReorderList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Nodes");
        int n = scan.nextInt();
        Node head = null;
        Node current = null;
        for(int i=0;i<n;i++){
            System.out.print("Enter the value: ");
            int value = scan.nextInt();
            Node newnode = new Node(value);
            if(head==null){
                head=newnode;
                current=newnode;
            }else{
                current.next=newnode;
                current=newnode;
            }
        }
        current=head;
        while(current!=null){
            System.out.print(current.data+ "->");
            current=current.next;
        }
        System.out.println("null"); 
        current=head;
        while(current!=null && current.next!=null){
            Node prev = null;
            Node tail = head;
            while(tail.next!=null){
                prev=tail;
                tail=tail.next;
            }
            if(prev!=null){
                prev.next=null;
            }
            tail.next=current.next;
            current.next=tail;
            current=tail.next;
        }
         current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
