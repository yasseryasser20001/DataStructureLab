package StudyForExam;


import java.util.Arrays;

public class ExamRevereseArrayUsingStack {
    public static void main(String[] args) {
       ExamArrayStack<Integer> buffer = new ExamArrayStack<>(5);
       int [] a ={10 ,20,30,40,50};
        System.out.println("before = " + Arrays.toString(a));
        for (int i = 0; i <5; i++) {
            buffer.push(a[i]);
        }
        for (int i = 0; i <5 ; i++) {
            a[i] = buffer.pop();
        }
        System.out.println("After = " + Arrays.toString(a));
        }
    }
