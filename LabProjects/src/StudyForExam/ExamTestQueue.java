package StudyForExam;

import java.util.Scanner;

public class ExamTestQueue {
    public static void main(String[] args) {
        ExamArrayQueue<Integer> myqueue = new ExamArrayQueue<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("enter  1 for enqueue");
        System.out.println("enter  2 for dequeue");
        System.out.println("enter  0 to exit");
        int choice = -1 ;
        while (choice!=0){
            System.out.println("what is your choice ??");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input a number ---- ");
                    myqueue.enqueue(in.nextInt());
                    break;
                case 2:
                    System.out.println("deleted is = " + myqueue.dequeue());
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            System.out.println("The size is " + myqueue.size());
            System.out.println(" The first element is " + myqueue.first());
        }
    }
}
