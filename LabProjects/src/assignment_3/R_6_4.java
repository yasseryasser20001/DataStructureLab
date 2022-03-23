package assignment_3;

import lab3.ArratyStack;
import self_study.ArrayStack;

import java.util.Scanner;
public class R_6_4 {


        public static ArratyStack transfer(ArratyStack s, ArratyStack t)
        {
            while (s.isEmpty()!=true)
            {
                t.push(s.pop());
            }
            return t;
        }
        public static void main(String[] args) {
            ArratyStack<String> S =new ArratyStack<>(5);
            ArrayStack<String> T =new ArrayStack<>(5);
            Scanner scanner=new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter element: ");
                S.push(scanner.next());
                System.out.println("S Top = "+S.top());
            }
            System.out.println();

            for (int i = 0; i < 5; i++) {
                System.out.print("T Top = "+T.Top());
                T.pop();
                System.out.println( );

            }

        }

}
