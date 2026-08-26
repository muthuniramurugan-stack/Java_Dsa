
package LinkedList;
import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Traversal {
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
    }
}
