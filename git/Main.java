package exceptionhandling.creatingexception.voterId;

public class Main {

    public static void main(String[] args) {

        Person p = new Person(19, "abc");

        p.display();

        try {
            p.checkEligibility(p.age);
        } catch (VoterIdException e) {
            System.out.println(e.getMessage());
        }
    }
}
