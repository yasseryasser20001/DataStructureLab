package StudyForExam;

import javax.swing.text.Element;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ExamArrayStackTest {
    public static void main(String[] args) {
        ExamArrayStack<Integer> myStack = new ExamArrayStack<>(5);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements");
        for (int i = 0; i <5; i++) {
            myStack.push(input.nextInt());
            System.out.println("Size = " + myStack.size());
            System.out.println(" Top is  = " + myStack.Top());
            System.out.println(" is my stack FUll = " + myStack.isEmpty());
        }
        for (int i = 0; i <5; i++) {
            myStack.pop();
            System.out.println("Size = " + myStack.size());
            System.out.println(" Top is  = " + myStack.Top());
            System.out.println(" is my stack FUll = " + myStack.isEmpty());
        }
    }

}
