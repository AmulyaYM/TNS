package Collection.javaCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {

    String name;
    int price;

    public Product(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Name :" + name + " " + "Price :" + price);
    }
}

//sort by name
class Productname implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        return o1.name.compareTo(o2.name);
    }

}
//sort by price

class Productprice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {

        return Integer.compare(o1.price, o2.price);
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        List<Product> al = new ArrayList<>();
        al.add(new Product("Laptop", 500000));
        al.add(new Product("Lipstick", 5000));
        al.add(new Product("Keyboard", 60000));
        al.add(new Product("Monitor", 800000));

        //sort by name
        Collections.sort(al, new Productname());
        System.out.println("sorted by name");
        for (Product p : al) {
            p.display();
        }

        //sort by price
        Collections.sort(al, new Productprice());
        System.out.println("sorted by price");
        for (Product p : al) {
            p.display();
        }

    }
}
