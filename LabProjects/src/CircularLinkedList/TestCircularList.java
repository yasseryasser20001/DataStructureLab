package CircularLinkedList;

import java.util.Scanner;

public class TestCircularList {
    public static void main(String[] args) {
        CircularLinkedList<String> list = new CircularLinkedList<String>();
        Scanner input= new Scanner(System.in);
        System.out.println("1 add first      2 add last      3 rotate     4 remove     5 exit");
        int choice = -1;
        while (choice!=0){
            System.out.println("what is your choice");
            choice=input.nextInt();;
            switch (choice){
                case 0:
                    System.exit(0);
                case 1 :
                    System.out.println("Input name");
                    list.addfirts(input.next());break;
                case 2 :
                    System.out.println("Input name");
                    list.addlast(input.next());break;
                case 3:
                    list.rotate();break;
                case 4:
                    System.out.println("removed is" + list.removeFirst());break;
            }
            System.out.println("  first = " + list.first() +"  last =" + list.last() + "  size = " + list.size());
        }
    }
}
