package StudyForExam;

public class StackSandT {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        ExamArrayStack<Integer> firstStack = new ExamArrayStack<>(5);
        ExamArrayStack<Integer> secondStack = new ExamArrayStack<>(5);
        for (int i = 0; i <5 ; i++) {
            firstStack.push(a[i]);
        }
        System.out.println("Top of the Stack is = " + firstStack.Top());
        for (int i = 0; i <5 ; i++) {
            secondStack.push(firstStack.pop());
        }
        System.out.println("The Top of the Second Stack is  = " + secondStack.Top());
    }
}
