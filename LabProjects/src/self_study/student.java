package self_study;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {

        System.out.println("enter number of students ");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = 3;
        System.out.println("student numebr 1");
        int mark1 = input.nextInt();
        System.out.println("student numebr 2");
        int mark2 = input.nextInt();
        System.out.println("student numebr 3");
        int mark3 = input.nextInt();

        int sum = mark1 + mark2 + mark3;
        int avg = sum/3;
        System.out.println("the avg is " + avg);
    }
}
