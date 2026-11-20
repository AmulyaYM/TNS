
class A {

    void display() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main {

    void show() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        //it is excecution instance which has its own cpu time and memory
        //threads extends runnable interface
        //runnable interface is functional interface
        //functional interface is a interface which has one abstract method
        //we can achieve thread by extending thread class &implemnting runnable interface
        //each and every method has  thread
        //inside main method we will be having main thread ,ehich is root for all thread 
        // thread has three property - id, name-name of the thread it can be change 
        //priority -0min to 10(max),5(normal)

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getId());

        A a = new A();
        a.display();

        Main main = new Main();
        main.show();

    }

}
