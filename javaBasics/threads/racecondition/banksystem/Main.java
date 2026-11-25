package racecondition.banksystem;

public class Main {

    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        PhonePay pay = new PhonePay(bank, "withdraw", 500);

        ATM atm = new ATM(bank, "withdraw", 1000);
        PhonePay pay1 = new PhonePay(bank, "deposite", 487);
        atm.start();
        pay.start();
        pay1.start();

    }

}
