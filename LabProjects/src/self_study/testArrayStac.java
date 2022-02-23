package self_study;

public class testArrayStac {
    public static void main(String[] args) {
        ArrayStack<String> stack = new ArrayStack<String>();
        stack.push("y");
        stack.push("a");
        stack.push("s");
        stack.push("r");
      while (!stack.isEmpty()){
          System.out.println(stack.pop());
      }

    ArrayStack<Integer> number =new ArrayStack<Integer>(4);
    number.push(10);
        number.push(20);
        while (!number.isEmpty()){
            System.out.println(number.pop());
        }
}
 }