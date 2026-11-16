package OOPS.encapsulation;

public class Bank1 {
    private int balance = 5000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }
}