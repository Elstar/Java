package sergiy.dmb;

public class SimpleNumbers {
    public static void main(String[] args) {
        int n = 100;

        System.out.println("Простые числа от 1 до 100");

        for (int i=1; i<=100; i++) {
            if (IsSimpleNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean IsSimpleNumber(int n) {
        Boolean result = true;
        for (int i = 2; i<n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
