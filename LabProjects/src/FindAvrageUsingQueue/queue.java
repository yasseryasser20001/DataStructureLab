package FindAvrageUsingQueue;

public interface queue<E> {
    boolean isEmpty();
    int size();
    E first();
    void enqueue(E element);
    E dequeu();
}
