package lap7;

public class LinkedQueue<E> implements Queue<E> {
    SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.last();
    }

    @Override
    public void enqueue(E element) {
    list.addFirst(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
