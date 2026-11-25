package Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTreeSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(23);
        set.add(86);
        set.add(10);

        set.add(23);
        set.add(null);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(23);
        set2.add(86);
        set2.add(10);

        set2.add(23);
        //set2.add(null);

        System.out.println(set);
        System.out.println(set2);

    }
}
