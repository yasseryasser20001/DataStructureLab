import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations2 {
    int x[];
    int numOfElements;

    public ArrayOperations2() {
// قيم افتراضيه داخل الكونستراكتور
        x = new int[5];
        numOfElements = 0;
    }
    //  arrayOperation example 1
//    public int add(int e){
//        if (numOfElements<x.length){
//            x[numOfElements]=e;
//            numOfElements++;
//            return 0;
//        }
//        return -1;
//    }

    //example sorted elemnts 2
    public int addStoredElement(int e) {
        if (numOfElements < x.length) {
            int i = numOfElements;
            while (i > 0 && e < x[i - 1]) {
                x[i] = x[i - 1];
                i--;
            }
            x[i] = e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
//  arrayOperation example 1
//    public static void main(String[] args) {
//        ArrayOperations2 test = new ArrayOperations2();
//        Scanner in  =new Scanner(System.in);
//        System.out.println("input the elements ");
//        for (int i = 0; i <7 ; i++) {
//            if (test.add(in.nextInt())==0)
//                System.out.println("added sucessfuly");
//            else
//
//            System.out.println("array is full");
//            System.out.println(Arrays.toString(test.x));
//        }
//    }



// delete
    public int delete() {
        if (numOfElements > 0) {
            x[numOfElements - 1] = Integer.MIN_VALUE;
            numOfElements--;
            return 0;
        }
        return -1;
    }
    //example sorted elemnts 2
    public static void main(String[] args) {
        ArrayOperations2 test = new ArrayOperations2();
        Scanner in = new Scanner(System.in);
        System.out.println("input the elements ");
        for (int i = 0; i < 7; i++) {
            if (test.addStoredElement(in.nextInt()) == 0)
                System.out.println("added sucessfuly");
            else

                System.out.println("array is full");
            System.out.println(Arrays.toString(test.x));
        }

        // delete 
        for (int i = 0; i < 7; i++) {
            if (test.delete() == 0)
                System.out.println("deleted sucessfuly");
            else

                System.out.println("array is empty");
            System.out.println(Arrays.toString(test.x));
        }
    }

}
