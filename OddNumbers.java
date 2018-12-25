package sergiy.dmb;

import java.util.Arrays;

public class OddNumbers {
    //Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
    public static void main(String[] args) {
        int[] array = {0, 5, 2, 4, 7, 1, 3, 19};

        System.out.println("Дан массив: " + Arrays.toString(array));
        System.out.print("Нечетные числа в этом массиве: ");

        for (int i=0; i<array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
