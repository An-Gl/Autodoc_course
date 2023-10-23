package lessons.lesson17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    static Queue<Integer> myQueue = new LinkedList<>();

    public static void main(String[] args) {
        addMethod(myQueue);
        elementExample(myQueue);
    }

    static void addMethod(Queue<Integer> queue){
        queue.add(2);
        queue.add(4);
        queue.add(56);
        queue.add(6);
        queue.add(9087);
    }

    static void showQueue(Queue<Integer> queue) {
        for (Integer i: queue) {
            System.out.print(i + " ");
        }
    }

    static void pollExample(Queue<Integer> queue){
        System.out.println("\n" + "Before deleting with pool method");
        showQueue(queue);
        queue.poll();
        System.out.println("\n" + "After deleting with pool method");
        showQueue(queue);
    }
    //удаляет верхний элемент и в случае пустого листа выбрасывает Exception
    static void removeExample(Queue<Integer> queue){
        System.out.println("\n" + "Before deleting with remove method");
        showQueue(queue);
        queue.remove();
        System.out.println("\n" + "After deleting with remove method");
        showQueue(queue);
    }
    //удаляет элемент по значению и в случае пустого листа выбрасывает Exception
    static void removeByObjExample(Queue<Integer> queue, int obj){
        System.out.println("\n" + "Before deleting with remove by object method");
        showQueue(queue);
        queue.remove(obj);
        System.out.println("\n" + "After deleting with remove by object method");
        showQueue(queue);
    }
    static void offerExample(Queue<Integer> queue, int obj){
        System.out.println("\n" + "Before using offer method");
        showQueue(queue);
        queue.offer(obj);
        System.out.println("\n" + "After using offer method");
        showQueue(queue);
    }
    //вернет верхний элемент и в случае пустого листа НЕ выбрасывает Exception и вернет null
    static void peakExample(Queue<Integer> queue){
        System.out.println(queue.peek());
        showQueue(queue);
    }

    //вернет верхний элемент и в случае пустого листа выбрасывает Exception
    static void elementExample(Queue<Integer> queue){
        System.out.println(queue.element());
        showQueue(queue);
    }
}
