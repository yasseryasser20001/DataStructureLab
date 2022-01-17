package Lab2;

import java.util.Arrays;

public class shift_To_Left {
    public static void main(String[] args) {
        int x[] = {10, 20, 30, 40, 50};
        System.out.println("array before shifting to left");
        System.out.println(Arrays.toString(x));
        System.out.println("array after shifting to left");
        System.out.println(Arrays.toString(shiftLeft(x)));
    }
    public static int[] shiftLeft(int[] y){
        int first_index =y[0];
        for (int i = 0; i <y.length-1 ; i++) {
            y[i]=y[i+1];
        }
        y[y.length-1]=first_index;
        return y;
    }
}
