package OOPS.Polymorphism;
//method overriding
//Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already provided by its superclass.
//runtime polymorphism
//dynamic polymorphism
//late binding

class Whatsapp{
    public void status() {
        System.out.println("seeing status");
    }
    public void chat() {
        System.out.println("chatting");
    }
    public void call() {
        System.out.println("calling");
    }

}
class Whatsapp2 extends Whatsapp{
    
    public void status() {
        System.out.println("seeing status and reacting to status");
    }
    public void chat() {
        System.out.println("chatting");
    }
    public void call() {
        System.out.println("calling");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
        Whatsapp whatsapp= new Whatsapp();
        whatsapp.status();
        whatsapp.chat();
        whatsapp.call();
        Whatsapp whatsapp2 = new Whatsapp2();
        whatsapp2.status();
       
}
}
