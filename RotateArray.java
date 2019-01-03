package sergiy.dmb;

import java.util.Arrays;

public class RotateArray {
    //«Перевернуть массив». Т.е. написать программу которая повернет базовый массив на 90,180,270 градусов
    //по часовой стрелке. (При выполнении задания использовать дополнительный массив нельзя).
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {2, 2, 3, 4, 5, 6},
                {3, 7, 3, 4, 5, 6},
                {4, 2, 3, 9, 5, 6},
                {5, 2, 3, 4, 5, 6},
                {6, 2, 3, 4, 5, 6}
        };

        int x = array.length;
        int y = array[0].length-1;


        System.out.println(Arrays.deepToString(array));

        RotateArrayIn90Degree(array, x, y);
        System.out.println("Массив повернутый на 90 градусов\n" + Arrays.deepToString(array));

        RotateArrayIn90Degree(array, x, y);
        System.out.println("Массив повернутый на 180 градусов\n" + Arrays.deepToString(array));

        RotateArrayIn90Degree(array, x, y);
        System.out.println("Массив повернутый на 270 градусов\n" + Arrays.deepToString(array));
    }

    static void RotateArrayIn90Degree(int[][] array, int x, int y) {
        int buff1, buff2;
        for (int i=0; i<x/2; i++) {
            for (int j=i; j<y-i; j++) {
                buff1 = array[j][y-i];
                array[j][y-i] = array[i][j];

                buff2 = array[y-i][y-j];
                array[y-i][y-j] = buff1;

                buff1 = array[y-j][i];
                array[y-j][i] = buff2;

                array[i][j] = buff1;
            }
        }
    }
}
