package exceptionhandling.creatingexception.bankingsystem;

public class BankException extends Exception {

    BankException() {
    }

    BankException(String msg) {
        super(msg);
    }
}