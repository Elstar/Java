package sergiy.dmb;

import java.util.Arrays;

public class LassonArray4 {
    public static void main (String[] args) {
        int [] arrayForMiddleValue = {4, 7, 2, 4};
        double middleValue;
        middleValue = arrayForMiddleValue[0] +
                arrayForMiddleValue[1] +
                arrayForMiddleValue[2] +
                arrayForMiddleValue[3];
        middleValue = middleValue / arrayForMiddleValue.length;

        System.out.println(middleValue);
    }
}
