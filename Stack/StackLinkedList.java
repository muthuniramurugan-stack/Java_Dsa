package Stack;

import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }
}

public class StackLinkedList {
    Node top = null;

    void push(int data) {// inserts element
        Node newnode = new Node(data);
        if (top == null) {
            top = newnode;
            return;
        } else {
            newnode.next = top;
            top = newnode;
        }
    }

    int pop() {// removes the top element
        if (top == null) {
            System.out.println("UnderFlow");
        }
        int temp = top.data;
        top = top.next;
        return temp;
    }

    int peek() { // look at the top of the element and it doesn't remove the element
        return top.data;
    }

    int isEmpty() {// checks if the stack is empty or not
        if (top == null) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
