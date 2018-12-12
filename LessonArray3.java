package sergiy.dmb;

import java.util.Arrays;
import java.util.Scanner;

public class LessonArray3 {
    public static void main (String[] args) {
        int [] a = new int[10];
        int [] array1;
        int [] array2;
        int countElements;
        int newLengthOfArray;
        Scanner scanner = new Scanner(System.in);
        String inputArrayVar = scanner.nextLine();
        a[0] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[1] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[2] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[3] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[4] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[5] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[6] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[7] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[8] = Integer.parseInt(inputArrayVar);
        inputArrayVar = scanner.nextLine();
        a[9] = Integer.parseInt(inputArrayVar);

        countElements = a.length;
        newLengthOfArray = countElements / 2;
        /*array1 = new int[newLengthOfArray];
        array2 = new int[newLengthOfArray];*/
        array1 = Arrays.copyOfRange(a, 0, newLengthOfArray);
        array2 = Arrays.copyOfRange(a, newLengthOfArray, countElements);

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
