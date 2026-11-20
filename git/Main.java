package runnableinterface;

class A implements Runnable {

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class B implements Runnable {

    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Main {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
