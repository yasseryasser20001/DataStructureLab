package self_study;

public class arrayQueue<E> implements Queue<E> {
   static int capacity = 100;
    E data[];
    int f =0;
    int sz =0;

    public arrayQueue(int capacity) {
    data = (E[]) new Object[capacity];
    }

    public arrayQueue() {
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
        if (isEmpty())return null;
        return data[f];
    }

    @Override
    public void enqueue(E element) {
       if (size()== data.length)throw new IllegalStateException("Queue is full ");
       int x = (sz+f)% data.length;
       data[x]=element;
       sz++;

    }

    @Override
    public E dequeue() {
       if (isEmpty())return null;
       E del = data[f];
       data[f]=null;
       f=(f+1)% data.length;
       sz--;
       return del;
    }
}
