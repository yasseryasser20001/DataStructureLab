import java.lang.reflect.Array;
import java.util.Arrays;

public class lab2_reverse {
    public static void main(String[] args) {
        int x[] = {11, 12, 13, 14, 15};
//        the first example for reverse
//        System.out.println(Arrays.toString(x));
//        System.out.println("After reverse");
//        System.out.println(Arrays.toString(reverse(x)));

//        the second example for shiftleft
//        System.out.println("after shiftLeft");
//        System.out.println(Arrays.toString(shiftLeft(x)));
//


        //the third example shiftRight
        System.out.println("after shiftRight");
        System.out.println(Arrays.toString(ShiftRight(x)));
//    }
//the first method for reverse
//    public static int[] reverse(int[]a){
//        int n = a.length-1;
//        for (int i = 0; i <a.length/2 ; i++) {
//            int t = a[i];
//            a[i]=a[n];
//            a[n]=t;
//            n--;
//        }
//        return a;
//    }


//    the second method for shift Left
//    public static int[] shiftLeft(int[] y){
//        int t = y[0];
//        for (int i = 0; i <y.length-1; i++) {
//            y[i]=y[i+1];
//        }
//        y[y.length-1]=t;
//        return y;
//    }
//
//}

    }


public static int[] ShiftRight(int[]y){
   int t = y[y.length-1];
    for (int i = y.length-1; i >0 ; i--) {
        y[i]=y[i-1];
    }
    y[0]=t;
    return y;
}

}