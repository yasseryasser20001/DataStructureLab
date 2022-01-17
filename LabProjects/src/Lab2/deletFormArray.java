package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class deletFormArray {
        int x[];
        int numOfElemnts;

        public void AddSortedElemntss() {
            x= new int[5];
            numOfElemnts=0;
        }
    public static void main(String[] args) {
        ArrayOperations2 test = new ArrayOperations2();
        Scanner in = new Scanner(System.in);
        System.out.println("input the elements ");

        for (int i = 0; i < 7; i++) {
            if (test.delete() == 0)
                System.out.println("deleted sucessfuly");
            else

                System.out.println("array is empty");
            System.out.println(Arrays.toString(test.x));
        }
    }

    public int delete() {
        if (numOfElemnts > 0) {
            x[numOfElemnts - 1] = Integer.MIN_VALUE;
            numOfElemnts--;
            return 0;
        }
        return -1;
    }
}
