// implement array in string
package Queue;

public class QueueArray {
    static int size = 10;
    int arr[];
    int front =-1;
    int rear=-1;
    QueueArray(){
        arr=new int [size];
    }
    void offer(int data){ // adds new element
        if(rear==size-1){
            throw new IndexOutOfBoundsException("Queue is full");
        }
        if(front==-1 && rear==-1){
            front++;
            arr[++rear]=data;
            return;
        }
        arr[++rear]=data;
    }
    int poll(){// removes 1st added element
        if(front==-1 || rear==-1||front>rear){
             throw new IndexOutOfBoundsException("Queue is Empty");
        }
        return arr[front++];
    }
    public static void main(String[]args){
        QueueArray q = new QueueArray();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(3);
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
