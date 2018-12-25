package sergiy.dmb;

import java.util.Arrays;

public class RotateArray {
    //«Перевернуть массив». Т.е. написать программу которая повернет базовый массив на 90,180,270 градусов
    //по часовой стрелке. (При выполнении задания использовать дополнительный массив нельзя).
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}
        };


        System.out.println(Arrays.deepToString(array));

        RotateArrayIn90Degree(array);
        System.out.println("Массив повернутый на 90 градусов\n" + Arrays.deepToString(array));

        RotateArrayIn90Degree(array);
        System.out.println("Массив повернутый на 180 градусов\n" + Arrays.deepToString(array));

        RotateArrayIn90Degree(array);
        System.out.println("Массив повернутый на 270 градусов\n" + Arrays.deepToString(array));
    }

    static void RotateArrayIn90Degree(int[][] array) {
        int buffValue;
        for (int i=0; i<array.length; i++) {
            for (int j=i; j<array[i].length; j++) {
                buffValue = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = buffValue;
            }
        }
    }
}
