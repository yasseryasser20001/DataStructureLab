package self_study;

public class ArrayStack<E> implements Stack<E>{
    static int capacity=100;
    E data[];
    int t= -1;

    public ArrayStack(int capacity) {
      data= (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(capacity);
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public E Top() {
        if (isEmpty())return null;
        return data[t];
    }

    @Override
    public void push(E element) {
    if (size()==data.length)throw new IllegalStateException("satck is full") ;
    data[++t]=element;
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E deleted = data[t];
        data[t]=null;
        t--;
        return deleted;
    }
}
