package Stack;

public class Stackarray {
    int size;
    int [] stack;
    int top = -1;
    Stackarray(){
        size = 100;
        stack = new int[size];
    }
    void push(int data){
        if(top==size-1){
            throw new RuntimeException("Stack Overflow");
        }
        top++;
        stack[top]=data;
    }
    int pop(){
        return stack[top--];
    }
    int peek(){
        return stack[top];
    }
    int isEmpty(){
        if(top==-1){
            return -1;
        }else{
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
