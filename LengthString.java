package sergiy.dmb;

import java.util.Scanner;

public class LengthString {
    //Введите строку текста с клавиатуры — реализуйте программу для возможности подсчета
    //количества символа — 'b' в этой строке, с выводом результат на экран.b'b' в этой строке,
    //с выводом результат на экран. в этой строке, с выводом результат на экран.
    public static void main(String[] args) {
        String inputString;
        Scanner scanner = new Scanner(System.in);
        int countOfSymbol = 0;

        System.out.println("Введите строку");
        inputString = scanner.nextLine();
        for (int i=0; i<inputString.length(); i++) {
            if (inputString.charAt(i) == 'b') countOfSymbol++;
        }
        System.out.println("Кол-во символов 'b' в строке: " + countOfSymbol);
    }
}
