package self_study;

import lab4.ArrayQueue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<Integer>();
        queue.en_queue(10);
        queue.en_queue(13);
        queue.en_queue(15);
        queue.en_queue(17);

            System.out.println(queue.de_queue());
        System.out.println(queue.de_queue());
        System.out.println(queue.de_queue());
        System.out.println(queue.de_queue());
        System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());    System.out.println(queue.de_queue());
    }
}
