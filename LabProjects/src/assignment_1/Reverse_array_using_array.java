package assignment_1;

public class Reverse_array_using_array {
    public static void main(String[] args) {
        int [] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] distination = new int[source.length];

        for (int i = 0; i < distination.length; i++) {
            distination[i] = source[source.length-1-i];
            System.out.println("distination position of " + i +" is know " + distination[i]);
        }

    }
}
