package collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add(23);
        list.add("AMULYA");
        list.add(true);
        list.add(25.05);
        list.add('A');

        String a = (String) list.get(1);
        System.out.println(a);

        System.out.println(list);

        list.remove("AMULYA");
        System.out.println(list);

        List<Integer> list2
                = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        Collections.reverse(list2);
        System.out.println(list2);

        Comparator<Integer> com = new Comparator<>() {
            public int compare(Integer a, Integer b) {
                if (a < b) {
                    return 1;
                } else if (a > b) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(list2, com);
        System.out.println("Sorted with 2 digit: " + list2);
    }
}
