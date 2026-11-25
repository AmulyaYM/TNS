package Collection.javaCollection;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<String>();

        //add
        s.add("Bindu");
        s.add("Bhuvi");
        s.add("Amulya");
        s.add("Arjun");
        s.add("Ram");

        System.out.println("Students : " + s);

        //get() - access to element
        System.out.println("Name : " + s.get(1));

        //set() - update
        s.set(4, "Rohan");
        System.out.println("After updating : " + s);

        //remove
        s.remove("Arjun");
        System.out.println("Afetr removing : " + s);

        System.out.println("Size is : " + s.size());

    }
}
