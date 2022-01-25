package lab3;

import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        ArratyStack<Integer> myStack = new ArratyStack<>(5);
        Scanner in = new Scanner(System.in);
        System.out.println("is the satck empty" + myStack.isEmpty());
        System.out.println("input elents");
        for (int i = 0; i <5 ; i++) {
            myStack.push(in.nextInt());
            System.out.println("top element = " + myStack.top());
            System.out.println("size = " + myStack.size());
            System.out.println("is the satck empty ? " + myStack.isEmpty());
        }
        for (int i = 0; i <6 ; i++) {

            System.out.println("deleted element is" + myStack.pop() );
            System.out.println("top  element after deleted = " + myStack.top());
            System.out.println("size = " + myStack.size());
            System.out.println("is the satck empty ? " + myStack.isEmpty());
        }
    }
}
