package Collection.javaCollection;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        l.add(1);
        l.add(2);
        l.add(3);

        //addFirst()
        l.addFirst(5);

        //addLast()
        l.addLast(8);
        l.addLast(7);

        System.out.println("Number : " + l);
        System.out.println("After removing first : " + l.removeFirst());
        System.out.println(l);

    }
}
