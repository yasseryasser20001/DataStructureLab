package Vid;

public class doublylist <E>{
    private Node<E>header;
    private Node<E>trailer;
    private int size=0;

    public doublylist() {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,header,null);
        header.setNext(trailer);
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return header.getNext().getElement();
    }
    public E last(){
        if (isEmpty())return null;
        return trailer.getPrev().getElement();
    }

    public void addBetween(E el , Node<E>p , Node<E>n ){
        Node<E> newest = new Node<>(el , p ,n);
        p.setNext(newest);
        n.setPrev(newest);
        size++;
    }
    public void addFirst(E el){
        addBetween(el ,header,header.getNext());
    }
    public void addLast(E el){
        addBetween(el ,trailer.getPrev(),trailer);
    }
    private E remove(Node<E>x ){
        Node<E> p = x.getPrev();
        Node<E> n = x.getNext();
        p.setNext(p);
        n.setPrev(p);
        size--;
        return x.getElement();

    }
    public E remover(){
        if (isEmpty())return null;
        return remove(header.getNext());
    }
    public E removerlast(){
        if (isEmpty())return null;
        return remove(trailer.getPrev());
    }

    private static class Node<E>{
        E element;
        Node<E>next;
        Node<E>prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
