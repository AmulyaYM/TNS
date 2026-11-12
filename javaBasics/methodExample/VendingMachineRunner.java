package methodExample;

class VendingMachine {
String itemName;
int price;

VendingMachine() {
System.out.println("Vending Machine Constructor");
}

void purchase(int quantity) {
System.out.println("Total Amount: " + (price * quantity));
}

void purchase(double payment) {
System.out.println("Payment Received: " + payment);

if (payment >= price) {
System.out.println("Purchase Successful");
System.out.println("Balance: " + (payment - price));
} else {
System.out.println("Insufficient Amount");
}
}

void displayItem() {
System.out.println(itemName + " Price: " + price);
}
}

class SnackMachine extends VendingMachine {

SnackMachine(String itemName, int price) {
this.itemName = itemName;
this.price = price;
}

@Override
void displayItem() {
System.out.println("Snack Name: " + itemName);
System.out.println("Snack Price: " + price);
}
}

class DrinkMachine extends VendingMachine {

DrinkMachine(String itemName, int price) {
this.itemName = itemName;
this.price = price;
}

@Override
void displayItem() {
System.out.println("Drink Name: " + itemName);
System.out.println("Drink Price: " + price);
}
}

public class VendingMachineRunner {
public static void main(String[] args) {

SnackMachine snack = new SnackMachine("Chips", 20);

snack.displayItem();
snack.purchase(3);
snack.purchase(50.0);

System.out.println();

DrinkMachine drink = new DrinkMachine("Juice", 30);

drink.displayItem();
drink.purchase(2);
drink.purchase(50.0);
}
}

