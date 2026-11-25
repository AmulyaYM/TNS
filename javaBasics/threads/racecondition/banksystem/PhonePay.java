package racecondition.banksystem;

public class PhonePay extends Thread {

    Bank bank;
    String op;
    int amount;

    PhonePay(Bank bank, String op, int amount) {
        this.bank = bank;
        this.op = op;
        this.amount = amount;
    }

    public void disp() throws Exception {
        if (op == "withdraw") {
            bank.withdraw(amount);
            bank.getBal();
        } else if (op == "deposite") {
            bank.deposite(amount);
            bank.getBal();
        } else if (op == "balance") {
            bank.getBal();
        } else {
            System.out.println("wrong option");
        }
    }

    public void run() {
        disp();
    }

}
