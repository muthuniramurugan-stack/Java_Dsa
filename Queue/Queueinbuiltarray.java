package Queue;
import java.util.Queue;
import java.util.ArrayDeque;
public class Queueinbuiltarray {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        // Enqueue
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        // Dequeue
        System.out.println(q.poll());
        System.out.println(q.poll());
        // Peek
        System.out.println(q.peek());
        System.out.println(q);
    }
}
