package sergiy.dmb;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
    //Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры)
    // и возможности заполнения каждого его элемента вручную. Выведите этот массив на экран.
    public static void main(String[] args) {
        int[] array;
        int sizeOfArray = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");

        while (sizeOfArray<1) {
            sizeOfArray = scanner.nextInt();
            if (sizeOfArray<1) {
                System.out.println("Введенное число должно быть > 0" +
                        "\nВведите размер массива повторно");
            }
        }

        array = new int[sizeOfArray];

        for (int i=0; i<sizeOfArray; i++) {
            array[i] = innerData(i);
        }

        System.out.println(Arrays.toString(array));
    }

    static int innerData(int arrayIndex) {
        int arrayElement;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите " + arrayIndex +"-й элемент массива: ");
        arrayElement = Integer.parseInt(scanner.next());

        return arrayElement;
    }
}
