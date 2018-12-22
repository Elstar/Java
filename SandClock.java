package sergiy.dmb;

import java.util.Scanner;

public class SandClock {
    public static void main(String[] args) {
        int left;
        int right;
        int clockWidth = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину песочных часов: ");
        while (clockWidth<1 || clockWidth % 2 == 0) {
            clockWidth = scanner.nextInt();
            if (clockWidth<1 || clockWidth % 2 == 0) {
                System.out.println("Введенное число должно быть > 0 и нечетным" +
                        "\nВведите ширину песочных часов повторно");
            }
        }

        left = 1;
        right = clockWidth;
        int middle = clockWidth / 2 + 1;

        for (int i=1; i<=clockWidth; i++) {
            for (int j=1; j<=clockWidth; j++) {
                if (j>=left && j<=right) {
                    System.out.print("*");
                } else  {
                    System.out.print(" ");
                }
            }
            if (i<middle) {
                left++;
                right--;
            } else {
                left--;
                right++;
            }
            System.out.println();
        }
    }
}
