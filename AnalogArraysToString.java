package sergiy.dmb;

public class AnalogArraysToString {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 8,};
        System.out.println(arrayToString(array, 0));
        System.out.println(arrayToString(array, 1));
    }

    static String arrayToString(int[] array, int withoutToString) {
        if (withoutToString == 1) {
            String resultString = "[";
            for (int i=0; i<array.length; i++) {
                resultString += array[i];
                if (i != array.length - 1) resultString += ",";
            }
            resultString += "]";
            return resultString;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i=0; i<array.length; i++) {
                sb.append(array[i]);
                if (i != array.length - 1) sb.append(',');
            }
            sb.append(']');
            return sb.toString();
        }
    }
}
