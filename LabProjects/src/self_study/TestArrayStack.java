package self_study;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayStack<Integer>stack = new ArrayStack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
