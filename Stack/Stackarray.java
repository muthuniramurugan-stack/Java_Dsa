// implement stack using array
package Stack;

public class Stackarray {
    int size;
    int[] stack;
    int top = -1;

    Stackarray() {
        size = 100;
        stack = new int[size];
    }

    void push(int data) { // inserts element
        if (top == size - 1) {
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        stack[top] = data;
    }

    int pop() { // removes the top element
        return stack[top--];
    }

    int peek() { // look at the top of the element and it doesn't remove the element
        return stack[top];
    }

    int isEmpty() { // checks if the stack is empty or not
        if (top == -1) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Stackarray stack = new Stackarray();
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
