package lab4;

import java.util.Scanner;
public class TestQueue {
    public static void main(String[] args) {
        ArrayQueue<Character> q = new ArrayQueue<>(5);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            q.en_queue(input.next().charAt(0));
            System.out.println("Size = " +q.size());
            System.out.println("First = " + q.first());
        }
        for (int i = 0; i <5 ; i++) {
            System.out.print(q.de_queue()+ "\t");
        }

    }
}
