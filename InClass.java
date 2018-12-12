package sergiy.dmb;

import java.util.Scanner;
import java.util.Arrays;

public class InClass {
    public static void main(String[] args) {
        int [] a = {3, 5, 1, 44, 2, 11, 10, 8, 2, 10};
        Arrays.sort(a);
        String s = Arrays.toString(a);
        System.out.println(s);

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

        Arrays.sort(a);
        s = Arrays.toString(a);
        System.out.println(s);
    }
}
