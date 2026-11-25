package collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Employee a) {
        if (this.name.length() > a.name.length()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}

public class ComparatorAndAnnymousClass {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Rohit", 18));
        list.add(new Employee(5, "Kartik", 23));
        list.add(new Employee(6, "Maheen", 27));
        list.add(new Employee(7, "Raj", 20));

        Comparator<Employee> com = new Comparator<Employee>() {
            public int compare(Employee a, Employee b) {
                if (a.name.length() > b.name.length()) {
                    return 1;
                }
                return -1;
            }
        };

        Collections.sort(list, com);

        for (Employee val : list) {
            System.out.println(val);
        }
    }
}
