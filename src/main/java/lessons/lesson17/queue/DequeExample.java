package lessons.lesson17.queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.push(2);
        queue.push(4);
        queue.push(56);
        queue.push(6);
        queue.push(9087);
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }
        System.out.println(queue.size());
    }
}
