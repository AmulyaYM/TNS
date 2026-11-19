package exceptionhandling.creatingexception.bankingsystem;

public class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.getBal();

        try {
            s.withdraw(500);
        }
        catch (BankException e) {
            System.out.println(e.getMessage());
            s.getBal();
        }
    }
}