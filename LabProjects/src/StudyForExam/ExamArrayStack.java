package StudyForExam;

public class ExamArrayStack<E> implements ExamStack<E> {
  static   int CAPACITY= 100;
    int t =-1;
    E data[];

    public ExamArrayStack(int CAPACITY) {
        data = (E[]) new Object[CAPACITY];
    }

    public ExamArrayStack() {
        this(CAPACITY);
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
       if (size()==data.length)throw new IllegalStateException("Stack is full");
       t++;
       data[t] = element;
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E deleted = data[t];
        data[t] = null;
        t--;
        return deleted;
    }
}
