package OOPS.abstraction.abstractkeyword;

abstract class Employee{
    void disp(){
        System.out.println("show details");
    }
    abstract void show();
}
class A extends Employee{
    void show(){
        System.out.println("display details");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new A();//loose coupling -- low dependency on other class and changes in one class will not effect on other and we use inhetience in loose coupling
        emp.show();
        emp.disp();
    }


}
