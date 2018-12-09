package sergiy.dmb;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double productPrice;
        System.out.println("Введите стоимость товара в грн: ");
        String price = scanner.nextLine();
        productPrice = Integer.parseInt(price);
        productPrice = productPrice * 0.75;
        System.out.println(
                "Стоимость товара с учетом скидки 25% составлила "
                        + productPrice + " грн");
    }
}
