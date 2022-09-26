import java.util.LinkedList;
import java.util.List;

public class LinkedListdemo {
    public static void main(String[] args) {
        // LinkedList => Stores data in 2 parts (data + address to next memory location)
        // Elements are linked using pointers
        // Single Linked List
        // [data | address] -> [data | address]-> [data | address]
        // Double Linked List
        // [prevaddress | data | nextaddress] <-> [prevaddress | data | nextaddress]

        // Advantages
        // 1. Dynamic data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of nodes is easy O(1)
        // 3. No/Low memory waste
        // Disadvantages
        // 1. Greater memory usage (additional Pointer)
        // 2. No random access of elements (no index [i])
        // 3. Accessing / Searching Elements are more time Consuming O(n)

        // USES
        // 1. implements Stacks and Queue
        // 2. GPS navigation
        // 3. music Playlist

        // LinkedList<String> StacklinkList = new LinkedList<String>();
        // StacklinkList.push("A");
        // StacklinkList.push("B");
        // StacklinkList.push("C");
        // StacklinkList.push("D");
        // StacklinkList.push("F");
        // System.out.println(StacklinkList);
        // StacklinkList.pop();
        // System.out.println(StacklinkList);

        LinkedList<String> QueuelinkList = new LinkedList<String>();
        QueuelinkList.offer("A");
        QueuelinkList.offer("B");
        QueuelinkList.offer("C");
        QueuelinkList.offer("D");
        QueuelinkList.offer("F");
        // System.out.println(QueuelinkList);
        // QueuelinkList.add(4, "E");
        // System.out.println(QueuelinkList);
        // QueuelinkList.remove("E");
        System.out.println(QueuelinkList);
        System.out.println(QueuelinkList.indexOf("C"));
        System.out.println(QueuelinkList.peekFirst());
        System.out.println(QueuelinkList.peekLast());
        QueuelinkList.addFirst("0");
        QueuelinkList.addLast("9");
        QueuelinkList.addFirst("a");
        QueuelinkList.addLast("z");
        System.out.println(QueuelinkList);
        String first = QueuelinkList.removeFirst();
        String last = QueuelinkList.removeLast();
        System.out.println(last);

        System.out.println(first);
        // QueuelinkList.poll();
        // System.out.println(QueuelinkList);
    }
}
