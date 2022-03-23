package assignment_3;

import lab3.ArratyStack;

import java.util.Scanner;

public class R_5_6 {
    public static ArratyStack removing(ArratyStack T)
    {
        while (T.isEmpty()!=true)
        {
            T.pop();
        }
        return T;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArratyStack<String> s=new ArratyStack<>(5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element: ");
            s.push(scanner.next());
        }
        System.out.println("Is it empty before removing ?  "+s.isEmpty());
        s=removing(s);
        System.out.println("Is it empty after removing ?  "+s.isEmpty());

    }
}
