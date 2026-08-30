// implement using linkedlist
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInbuiltLinked {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Enqueue / Add
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        System.out.println(q);
        // Dequeue / Remove
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q);
    }
}
