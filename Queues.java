import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Queue => FIFO (First in First Out)
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Anup");
        queue.offer("Anant");
        queue.offer("Asmita");
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // String pollop = queue.poll();
        // System.out.println(pollop);
        // System.out.println(queue);
        // queue.poll();
        // queue.poll();
        // queue.poll();
        // queue.element();

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Anup"));

        // Where are Queues used ?
        // 1. Keyboard Buffer (Letters shoukd appear on the screen in the order they are
        // pressed)
        // 2. Printer Queue(Printing should be done in the order)
        // 3. Used in Linked List , Priority Queues and Breadth First Search
    }
}
