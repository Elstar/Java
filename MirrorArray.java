package sergiy.dmb;

import java.util.Arrays;

public class MirrorArray {
    //Написать программу для зеркального переворота массива (7,2,9,4) -> (4,9,2,7).
    //массив может быть произвольной длинны. (При выполнении задания использовать дополнительный массив нельзя)
    public static void main(String[] args) {
        int[] array = {7, 2, 9, 4, 5};
        int buffValue, rightIndex;
        int countIteration;

        System.out.println(Arrays.toString(array));

        countIteration = array.length / 2;

        for (int i=0; i<countIteration; i++) {
            rightIndex = array.length - i - 1;
            buffValue = array[i];
            array[i] = array[rightIndex];
            array[rightIndex] = buffValue;
        }

        System.out.println(Arrays.toString(array));
    }
}
