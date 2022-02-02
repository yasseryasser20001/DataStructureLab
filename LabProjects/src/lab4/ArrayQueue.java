package lab4;

public class ArrayQueue<E> implements Queue<E> {
    final static int CAPACITY=100;
    E[] data ;
    int fr= 0;
    int sz= 0 ;



    public ArrayQueue(int c) {
        data = (E[]) new Object[c];
    }
    public ArrayQueue() {
        this(CAPACITY);
    }
    @Override
    public boolean is_empty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void en_queue(E element) {
      if ( size()==data.length)
    throw new IllegalStateException("Queue is full");
      int i = ( fr+ sz )% data.length;
      data[i]=element;
      sz++;
    }

    @Override
    public E de_queue() {
      if (is_empty()){
          return null;
      }
      else {
          E del=data[fr];
          data[fr]=null;
          fr=(fr+1)%data.length;
          sz--;
          return del;
      }

    }

    @Override
    public E first() {
        if (is_empty()){
            return null;
        }
        return data[fr];
    }
}
