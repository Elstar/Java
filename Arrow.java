package sergiy.dmb;

import java.util.Scanner;

public class Arrow {
    public static void main(String[] args) {
        int arrowLength = 0;
        int arrowHeight;
        int beetwenLength = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите глубину стрелки: ");
        while (arrowLength<1) {
            arrowLength = scanner.nextInt();
            if (arrowLength<1) {
                System.out.println("Введенное число должно быть > 0" +
                        "\nВведите глубину стрелкив повторно");
            }
        }

        arrowHeight = arrowLength * 2 -1;

        for (int i=0; i<arrowHeight; i++) {
            if (i<arrowLength) {
                beetwenLength++;
            } else {
                beetwenLength--;
            }
            for (int j=0; j<beetwenLength; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
