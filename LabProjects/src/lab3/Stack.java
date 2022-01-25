package lab3;

public interface Stack<E>{
    boolean isEmpty();
    int size();
    void push(E element);
    E pop();
    E top();
}
