package lab8;

import java.util.Scanner;

public class TestSoublylinkedList {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        Scanner input =new Scanner(System.in);
        System.out.println("\t\t\tEnter your choice ??");
        System.out.println("\t 1 add first ");
        System.out.println("\t 2 add last ");
        System.out.println("\t 3 remove first");
        System.out.println("\t 4 remove last ");
        System.out.println("\t 0 to Exit ");
        int choice = -1;
        choice=input.nextInt();

        while (choice !=0){
            switch(choice){
                case 1:
                    System.out.println("input name ");
                    list.addFirst(input.next());
                    break;
                case 2:
                    System.out.println("input name ");
                    list.addLast(input.next());
                    break;
                case 3:
                    System.out.println("removed  = "+ list.removeFirst() );
                    break;
                case 4 :
                    System.out.println("removed = " + list.removeLast());
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println(" first = " + list.first() + " last = " + list.last() + " Size =  " + list.size() );
        }




    }
}
