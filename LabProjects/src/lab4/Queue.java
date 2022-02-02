package lab4;

public interface Queue<E>{

    boolean is_empty ();
    int size ();
    void  en_queue (E element);
    E de_queue();
    E first ();

}
