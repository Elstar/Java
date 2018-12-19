package sergiy.dmb;

import java.util.Random;
import java.util.Arrays;

public class ArraySearchMinMax {
    public static void main(String[] args) {
        int [] mas = new int[20];
        int i;
        Random rand = new Random();

        //push into array random int values
        for (i=0; i<mas.length; i++) {
            mas[i] = rand.nextInt(100);
        }

        Arrays.sort(mas);
        int lastIndex = mas.length - 1;
        int maxValue = mas[lastIndex];
        int minValue = mas[0];

        System.out.println(Arrays.toString(mas));
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Максимальное значение массива: " + maxValue);
    }
}
