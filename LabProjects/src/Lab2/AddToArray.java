package Lab2;
import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    int x[];
    int sumOfTheElemnts;

    public AddToArray() {
     x= new int[5];
     sumOfTheElemnts=0;
}
    public int addElemnts(int e) {
        if (sumOfTheElemnts < x.length) {
            x[sumOfTheElemnts] = e;
            sumOfTheElemnts++;
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
           AddToArray test =new AddToArray();
           Scanner in = new Scanner(System.in);
        System.out.println("enter your elemnts ");
        for (int i = 0; i <7; i++) {
            if (test.addElemnts(in.nextInt())==0)
            {
                System.out.println("added sucessfuly");
            }
            else {
                System.out.println("the array is full");
            }
            System.out.println(Arrays.toString(test.x));
        }
    }
}
