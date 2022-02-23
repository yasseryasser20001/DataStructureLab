package Singl_linked_list;

import java.util.List;
import java.util.Scanner;

public class testSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> list=new SinglyLinkedList<>();
     Scanner in = new Scanner(System.in);
        int choice = -1;
        System.out.println("1 add first");
        System.out.println("2 add last");
        System.out.println("3 add remove first");
        System.out.println("4 add remove all");
        System.out.println("0 add exit");
        while (choice!=0){
            System.out.println("what is your choice");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name");
                    list.addFirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addlast(in.next());
                    break;
                case 3:
                    System.out.println("remove : " +list.removeFirst());
                    break;
                case 4:
                 while (!list.isEmpty())
                     System.out.println(list.removeFirst()+ "\t");
                 break;
                case 0:
                    System.exit(0);
            }
            System.out.println("first = " + list.first() + " last = " +list.last() + "  size =" + list.size());
        }
    }

}
