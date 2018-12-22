package sergiy.dmb;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countLines = 0;
        System.out.println("Введите число строк для обоев");
        while (countLines<1) {
            countLines = scanner.nextInt();
            if (countLines<1) {
                System.out.println("Введенное число строк должно быть больше 0" +
                        "\nВведите число строк обоев повторно");
            }
        }

        for (int i=0; i<countLines; i++) {
            System.out.println("***+++***+++***+++***");
        }
    }
}
