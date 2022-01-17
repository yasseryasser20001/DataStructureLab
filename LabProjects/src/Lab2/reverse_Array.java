package Lab2;

import java.util.Arrays;

public class reverse_Array {
    public static void main(String[] args) {
        int x[]={10,20,30,40,50};
        System.out.println("before reverse");
        System.out.println(Arrays.toString(x));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(reversArray(x)));
    }
    public static int[] reversArray(int[] x){
        int n = x.length-1;
        for (int i = 0; i <x.length/2 ; i++) {
            int temp = x[n];
            x[n] = x[i];
            x[i] = temp;
            n--;
        }
        return x;
    }
}
