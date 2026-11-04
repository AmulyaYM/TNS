package OOPS.Polymorphism;


class Learing{
    public void course(){
        System.out.println("online course");
    }
}
//super -- whenever we want to call the parent class method from child class we can use super keyword
// super-- whenebver we want to access the old implementation along with the new implementation we can use super keyword
//static method cannot be overridden because static methods are bound at compile time and are associated with the class rather than an instance of the class. Overriding is a runtime concept that applies to instance methods, allowing subclasses to provide their own implementation of a method defined in a superclass. Since static methods do not belong to an instance, they cannot be overridden in the same way that instance methods can. Instead, if a subclass defines a static method with the same signature as a static method in the superclass, it is considered method hiding, not overriding.

class Learing2 extends Learing{
    public void course(){
        super.course();
        System.out.println("offline course");
    }
}
public class OverridingExample {
    public static void main(String[] args) {
        Learing2 l2 = new Learing2();
        l2.course();
    }
}
