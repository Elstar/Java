package sergiy.dmb;

public class MultiplicationTable {
    public static void main(String[] args) {
        int multipleResult = 0;
        System.out.println("Таблица умножения на 5");
        for (int i = 1; i<11; i++) {
            multipleResult = 5 * i;
            System.out.println("5 * " + i + " = " + multipleResult);
        }
    }
}
