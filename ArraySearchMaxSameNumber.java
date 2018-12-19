package sergiy.dmb;

import java.util.Random;
import java.util.Arrays;

public class ArraySearchMaxSameNumber {
    public static void main(String[] args) {
        int [] mas = new int[20];
        int [] arraOfSameCount = new int[20];
        int [] arraOfSameNumbers = new int[20];
        int i, j;
        int maxSameCount = 0;
        Random rand = new Random();

        //push into array random int values
        for (i=0; i<mas.length; i++) {
            mas[i] = rand.nextInt(10);
        }

        for (i=0; i<mas.length; i++) {
            for (j=0; j<mas.length; j++) {
                if (j==i)
                        continue;
                if (mas[i] == mas[j]) {
                    arraOfSameCount[i]++;
                }
            }
        }

        //search max count
        for (i=0; i<arraOfSameCount.length; i++) {
            if (maxSameCount < arraOfSameCount[i]) {
                maxSameCount = arraOfSameCount[i];
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.print("Числа которые повторяются больше всего: ");

        //print max same count numbers
        Arrays.fill(arraOfSameNumbers, -1);
        j = 0;
        int foundIndex;
        for (i=0; i<arraOfSameCount.length; i++) {
            if (maxSameCount == arraOfSameCount[i]) {
                if (j > 0) {
                    foundIndex = Arrays.binarySearch(arraOfSameNumbers, mas[i]);
                    if (foundIndex < 0) {
                        System.out.print(mas[i] + " ");
                        arraOfSameNumbers[j++] = mas[i];
                        Arrays.sort(arraOfSameNumbers);
                    }
                } else {
                    System.out.print(mas[i] + " ");
                    arraOfSameNumbers[j++] = mas[i];
                    Arrays.sort(arraOfSameNumbers);
                }

            }
        }

    }
}
