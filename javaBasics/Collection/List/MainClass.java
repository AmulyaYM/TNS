package Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);

        List<Integer> evenNumber = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenNumber.add(list.get(i));
            }

        }
        for (Integer number : evenNumber) {
            System.out.println(number);

        }
        System.out.println(evenNumber);
    }

}
