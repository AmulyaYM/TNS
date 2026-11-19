package exceptionhandling.creatingexception.bankingsystem;

public class SavingsAccount {
    int balance = 1000;

    void withdraw(int amount) throws BankException {
        if (amount > balance) {
            throw new BankException("Insufficient amount");
        }

        System.out.println(amount + " debited from your account");
        balance -= amount;
    }

    void deposits(int amount) {
        System.out.println(amount + " credited to your account");
        balance += amount;
    }

    void getBal() {
        System.out.println("Balance = " + balance);
    }
}