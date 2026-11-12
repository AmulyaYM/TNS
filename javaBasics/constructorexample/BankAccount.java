package constructorexample;
//this is an example of constructor overloading
//this is used to initialize the variables or data members of class
//this is used to create multiple constructors with different parameters in the same class
//this is used to create multiple objects of the same class with different values
class Person{
    int balance;
    String name;

    Person(int balance, String name){
        this.balance = balance;
        this.name = name;
    }
    Person(){
        System.out.println("HELLO CONSTRUCTOR");
    }

}
public class BankAccount{
    public static void main(String[] args){
        Person person = new Person(1000, "Alice");
        System.out.println("Person name is: " + person.name);
        System.out.println("Person balance is: " + person.balance);

        Person person1 = new Person();
        System.out.println("Person name is: " + person1.name);
        System.out.println("Person balance is: " + person1.balance);
    }
}
