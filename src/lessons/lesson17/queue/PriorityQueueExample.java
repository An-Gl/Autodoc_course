package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Bananas");
        queue.add("Oranges");
        queue.add("Mandarins");
        queue.add("Apple");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue.size());
    }
}
