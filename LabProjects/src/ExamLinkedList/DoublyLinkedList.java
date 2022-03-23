package ExamLinkedList;

public class DoublyLinkedList <E>{
    private Node<E>header;
    private Node<E>trailer;
    private int size = 0;

    public DoublyLinkedList() {
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
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
    private void addbetween(E element , Node<E>p , Node<E>s){

    }




    private static class Node<E>{
        E element;
        Node<E>prev;
        Node<E>Next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            Next = next;
        }

        public E getElement() {
            return element;
        }


        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return Next;
        }

        public void setNext(Node<E> next) {
            Next = next;
        }
    }
}
