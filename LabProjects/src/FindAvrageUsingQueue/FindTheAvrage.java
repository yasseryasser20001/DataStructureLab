package FindAvrageUsingQueue;

public class FindTheAvrage {
    public static void main(String[] args) {
        int    sum = 0;
        int [] a={90,80,70,85,90};
        ArrayQueue<Integer> MyQueue = new ArrayQueue<>(5);
        for (int i = 0; i <5 ; i++) {
            MyQueue.enqueue(a[i]);
        }
        for (int i = 0; i < 5; i++) {
            sum = sum+MyQueue.dequeue();
        }
        int avrage = sum/5;
        System.out.println("avrage = " + avrage);
        }
    }

