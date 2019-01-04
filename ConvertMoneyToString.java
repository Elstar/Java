package sergiy.dmb;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertMoneyToString {
    //Ввести с клавиатуры число (до миллиарда) которое обозначает количество долларов и центов пользователя.
    //Вывести это количество прописью на английском языке
    public static void main(String[] args) {
        double number = -1;
        int bettwenResult;
        int cent = 0;
        String centsString, cents;
        int pointPosition;
        int[] divs = {1000000, 1000};
        String[] divsValue = {"million", "thousand"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число до миллиарда с точностью до 2 знаков (центов): ");

        while (number<0 || number>1000000000) {
            number = Double.parseDouble(scanner.nextLine());
            if (number<0 || number>1000000000) {
                System.out.println("Введенное число должно быть > 0 и меньше миллиарда" +
                        "\nВведите число повторно");
            }
        }
        centsString = Double.toString(number);
        pointPosition = centsString.indexOf(".");
        if (pointPosition>0) {
            cents = centsString.substring(pointPosition + 1, centsString.length());
            cent = Integer.parseInt(cents);
        }

        for (int i=0; i<2; i++) {
            bettwenResult = (int) number / divs[i];
            if (bettwenResult>1) GetStrinOfNumber(bettwenResult, divsValue[i] + "s");
            else if (bettwenResult==1) GetStrinOfNumber(bettwenResult, divsValue[i]);
            number =  number - bettwenResult * divs[i];
        }

        GetStrinOfNumber((int) number, "dollars");


        if (cent != 0) {
            GetStrinOfNumber(cent, "cents");
        }
    }

    static void GetStrinOfNumber(int number, String rank) {
        int hundreds, tens;
        String[] numbersValue = {
                "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine"
        };
        String[] tensValue = {
                "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"
        };
        String[] numbersTeenValue = {
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"
        };
        hundreds  = number / 100;
        if (hundreds>0) {
            if (hundreds==1) System.out.print(" " + numbersValue[hundreds - 1] + " hundred");
            else System.out.print(" " + numbersValue[hundreds - 1] + " hundreds");
        }
        number = number - hundreds * 100;
        tens = number / 10;
        number = number - tens * 10;
        if (tens>1) {
            System.out.print(" " + tensValue[tens - 2]);
        } else if (tens==1) {
            System.out.print(" " + numbersTeenValue[number]);
        }

        if (number>0 && tens!=1) {
            System.out.print(" " + numbersValue[number - 1]);
        }
        System.out.print(" " + rank);
    }
}
