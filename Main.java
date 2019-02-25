import java.util.*;

public class Main {
        public static void main(String[] args) {
                /*List<Integer> myList = new ArrayList<>();

                myList.add(5);
                myList.add(9);
                System.out.println(myList);

                myList.add(1, 7);
                System.out.println(myList);

                Integer number = myList.get(2);

                Iterator<Integer> itr = myList.iterator();
                for (;itr.hasNext();) {
                        Integer element = itr.next();
                        System.out.println(element);
                }

                Collections.sort(myList);
                System.out.println(myList);*/
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
