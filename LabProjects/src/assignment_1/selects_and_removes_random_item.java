package assignment_1;

import java.util.Random;

public class selects_and_removes_random_item {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeElemnts(array);
    }

    static void removeElemnts(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int i = index; i < array.length - 1; i++)
                array1[i] = array[i + 1];
            array = array1;
        }
    }
}