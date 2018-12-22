package sergiy.dmb;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        long f = 1;

        System.out.println("Введите число больше 4 и меньше 16:");
        while (n<4 || n>16) {
            n = scanner.nextInt();
            if (n<4 || n>16) {
                System.out.println("Введенное чисто должно быть больше 4 и меньше 16\nВведите число повторно");
            }
        }

        for(int i=1; i<=n; i++) {
            f = f * i;
        }

        System.out.println("Факториал числа " + n + " = " + f);
    }
}
