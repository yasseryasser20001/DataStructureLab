package assignment_1;

public class Copy_array_to_another_array {
    public static void main(String[] args) {
        int [] oldArray = { 1,2,3,4,5,6};
        int [] newArray = new int[oldArray.length];
        for (int i = 0; i <oldArray.length ; i++) {
            newArray[i] = oldArray[i];
        }
        System.out.println("The new array is = " );
        for (int i = 0; i <newArray.length ; i++) {
            System.out.print( newArray[i]);
            System.out.print(" ");
        }
    }
}
