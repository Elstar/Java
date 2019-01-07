package sergiy.dmb;

public class AnalogEquals {
    public static void main(String[] args) {
        short[] array = {1, 3, 6, 7};
        short[] array2 = {1, 3, 6, 8};
        System.out.println(Boolean.toString(shortEquals(array, array2)));
    }

    static boolean shortEquals(short[] array1, short[] array2) {
        if (array1.length != array2.length) return false;
        for (int i=0; i<array1.length; i++) {
            if (array1[i] != array2[i]) return false;
        }
        return true;
    }
}
