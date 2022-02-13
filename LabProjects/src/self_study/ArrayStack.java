package self_study;

public class ArrayStack<E> implements stack<E> {
   static int capacity = 100;
    int t = -1;
    E data[];

    public ArrayStack(int capacity) {
       data= (E[]) new Object[capacity];
    }

    public ArrayStack() {
        this(capacity);
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
       return t==-1;
    }

    @Override
    public void push(E element) {
      if (size()== data.length)throw new IllegalStateException("stack is full");
       t++;
       data[t]=element;
    }

    @Override
    public E pop() {
     if (isEmpty())return null;
     E del = data[t];
     data[t]= null;
     t--;
     return del;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return data[t];
    }
}
