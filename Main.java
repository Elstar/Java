import java.util.*;

public class Main {
        public static void main(String[] args) {
                fillList(10);
        }

        public static void fillList(int countElements) {
                Random random = new Random();
                if (countElements<1) {
                        throw new IllegalArgumentException();
                }
                List<Integer> newList = new ArrayList<>();
                for (int i=0; i<countElements; i++) {
                        newList.add(random.nextInt(100));
                }
                System.out.println(Arrays.toString(newList.toArray()));
                newList.remove(0);
                newList.remove(0);
                newList.remove(newList.size()-1);
                System.out.println(Arrays.toString(newList.toArray()));
        }
}
