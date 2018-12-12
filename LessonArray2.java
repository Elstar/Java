package sergiy.dmb;

import java.util.Arrays;

public class LessonArray2 {
    public static void main (String[] params) {
        int [] numbers = {2, 5, 8, 9};
        int lastElement = numbers.length - 1;
        int buffer = numbers[0];
        String result;
        numbers[0] = numbers[lastElement];
        numbers[lastElement] = buffer;
        result = Arrays.toString(numbers);

        System.out.println(result);
    }
}
