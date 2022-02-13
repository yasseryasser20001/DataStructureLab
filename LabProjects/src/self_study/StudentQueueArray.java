package self_study;

public class StudentQueueArray<E> implements StudentQueue<E> {

    int capacity = 100;
    E data[];

    public StudentQueueArray(E[] data) {
        data = (E[]) new Object[capacity];
    }

    @Override
    public E sum() {
return null;
    }

    @Override
    public E avrage() {
        return null;
    }

    @Override
    public int numOfStudent() {
        return 0;
    }
}
