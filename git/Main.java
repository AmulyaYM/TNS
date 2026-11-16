package OOPS.encapsulation;

public class Main {
    public static void main(String[] args) {

        Bank1 bank1 = new Bank1();

        System.out.println("Balance: " + bank1.getBalance());

        bank1.withdraw(500);

        System.out.println("Balance: " + bank1.getBalance());

        bank1.deposit(1000);

        System.out.println("Balance: " + bank1.getBalance());
    }
}