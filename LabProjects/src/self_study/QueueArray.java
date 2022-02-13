package self_study;

public class QueueArray<E> implements Queue<E> {
    static int capacity = 100;
    E data[];
    int f = 0;
    int sz = 0;

    public QueueArray(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public QueueArray() {
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
    public void enqueue(E element) throws IllegalStateException{
     if (size()==data.length)throw new IllegalStateException("queue id full");
     int x = (f+sz)%data.length;
     data[x]= element;
     sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E deleted = data[f];
        data[f]=null;
        f= (f+1)%data.length;
        sz--;
        return deleted;
    }
}
