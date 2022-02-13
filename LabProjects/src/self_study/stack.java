package self_study;

public interface stack<E> {
    int size();
    boolean isEmpty();
    void push(E element);
    E pop();
    E top();
}
