
package Collection.javaCollection;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1> {

    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [id = " + id +
               ", name = " + name +
               ", marks = " + marks + "]";
    }

    @Override
    public int compareTo(Student1 s) {
        return this.name.compareTo(s.name);
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student1> s = new ArrayList<>();

        s.add(new Student1(102, "Bindu", 50));
        s.add(new Student1(62, "Bhuvi", 11));
        s.add(new Student1(152, "Raj", 36));
        s.add(new Student1(10, "Arun", 24));

        Collections.sort(s);

        System.out.println("After sorting by name:");

        for (Student1 g : s) {
            System.out.println(g);
        }
    }
}