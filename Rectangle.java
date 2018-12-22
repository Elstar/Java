package sergiy.dmb;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        int height, width;

        height = innerData("высоту");
        width = innerData("ширину");

        for(int i=1; i<=height; i++) {
            for (int j=1; j<=width; j++) {
                if (i==1 || i==height) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == width) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static int innerData(String paramName) {
        int param = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите " + paramName +" прямоугольника: ");

        while (param<1) {
            param = scanner.nextInt();
            if (param<1) {
                System.out.println("Введенный параметр прямоугольника должен быть больше 0" +
                        "\nВведите " + paramName + " повторно");
            }
        }

        return param;
    }
}
