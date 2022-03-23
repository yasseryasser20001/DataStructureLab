package assignment_4;

import CircularLinkedList.CircularLinkedList;

public class Jousph_problem<E> {



        public E circle( E person[], int k) {

            CircularLinkedList<E> circleQueue = new CircularLinkedList<E>();

            for (int i = 0; i <person.length ; i++) {
                circleQueue.addfirts(person[i]);
            }
            while (circleQueue.size() > 1) {
                for (int i = 1; i <=k-1; i++) {
                    circleQueue.rotate();
                }
                E element = circleQueue.removeFirst();
                System.out.println("The player '" + element + "' is out");

            }
            return circleQueue.removeFirst();
        }


}
