package lab3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[]a = {10,20,30,40,50};
     ArratyStack<Integer> s = new ArratyStack<>(a.length);
        System.out.println(Arrays.toString(a));
        for (int i = 0; i <a.length ; i++) {
            s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
            a[i]=s.pop();
        }

        System.out.println("after revers using stack");
        System.out.println(Arrays.toString(a));
    }
}
