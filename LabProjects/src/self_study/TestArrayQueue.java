package self_study;

import lab4.ArrayQueue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<Integer> myqueue = new ArrayQueue<Integer>(5);
        for (int i = 0; i <5 ; i++) {
            myqueue.en_queue(i+1);
        }
        System.out.println("The size = " + myqueue.size() +" The first is = " +myqueue.first());
        for (int i = 0; i <5 ; i++) {
            System.out.println(  myqueue.de_queue());
        }
        System.out.println("The size = " + myqueue.size() +" The first is = " +myqueue.first());



    }
}