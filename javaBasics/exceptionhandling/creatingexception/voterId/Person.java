package exceptionhandling.creatingexception.voterId;

public class Person {

    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("Age=" + age);
        System.out.println("Name=" + name);
    }

    void checkEligibility(int age) throws VoterIdException {
        if (age >= 18) {
            System.out.println("Eligible for voter ID");
        } else {
            throw new VoterIdException("Not eligible for voter ID");
        }
    }
}
