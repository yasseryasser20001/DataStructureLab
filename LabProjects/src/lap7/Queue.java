package lap7;

public interface Queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeue();

}
