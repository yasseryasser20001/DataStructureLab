package self_study;

public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray<Integer> queue = new QueueArray<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(30);
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
