import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        // PriorityQueues => FIFO (highest priorities serves first before elements with
        // lower priorities)
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("D");
        queue.offer("E");
        // while (!queue.isEmpty()) {
        // System.out.println(queue.poll());
        // }
        System.out.println(queue);

    }
}
