package StudyForExam;

import java.util.EmptyStackException;

public class ExamArrayQueue<E> implements ExamQueue<E> {
    static int capacity = 100;
    int f = 0;
    int sz=0;
    E [] data;


    public ExamArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public ExamArrayQueue() {
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
        return data[f];
    }

    @Override
    public void enqueue(E element) {
         if (size()==data.length)throw new IllegalStateException("queue is full");
         int index = (f+sz)% data.length;
         data[index]=element;
         sz++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E deleted = data[f];
        data[f] = null;
        f=(f+1)% data.length;
        sz--;
        return deleted;
    }
}
