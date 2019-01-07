package sergiy.dmb;

import java.util.Scanner;

public class CountBinaryNumbersOne {
    public static void main(String[] args) {
        int number = getNumber();
        int countOnes = 0;
        String binaryString = Integer.toBinaryString(number);
        for (int i=0; i<binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') countOnes++;
        }
        System.out.println("Бинарное предсталение: " + binaryString);
        System.out.println("Колво 1 в бинарном представлении числа = " + countOnes);
    }

    static int getNumber() {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Введите целое число");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка воода. Введите целое число");
                sc.next();
            }
            number = sc.nextInt();
        } while (number == 0);

        return number;
    }
}
