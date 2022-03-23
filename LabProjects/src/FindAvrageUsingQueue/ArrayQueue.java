package FindAvrageUsingQueue;

import lap7.Queue;

public class ArrayQueue<E> implements Queue<E> {
   static int capacity=100;
   E data [];
   int sz=0;
   int f=0;


    public ArrayQueue(int capacity) {
    data = (E[]) new Object [capacity];
    }

    public ArrayQueue() {
        this(capacity);
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[f];
    }

    @Override
    public void enqueue(E element) {
   if (size()==data.length)throw new IllegalStateException("Queue is full");
   int index = (f+sz)% data.length;
   data[index]=element;
   sz++;
    }

    @Override
    public E dequeue() {
if (isEmpty())return null;
        E deleted = data[f];
        data[f]=null;
        f=(f+1)% data.length;
        sz--;
        return deleted;
    }
}
