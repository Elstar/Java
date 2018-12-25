package sergiy.dmb;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    //Создать массив случайных чисел (размером 15 элементов).
    //Создайте второй массив в два раза больше, первые 15 элементов должны быть равны элементам первого массива,
    //а остальные элементы заполнить удвоенных значением начальных. Например
    //Было → {1,4,7,2}
    //Стало → {1,4,7,2,2,8,14,4}
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        int[] finalArray = new int[30];

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100);
            finalArray[i] = array[i];
            finalArray[array.length + i] = array[i] * 2;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(finalArray));
    }
}
