package threadexample1;

class A extends Thread {

    public void run() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // for (int i = 100; i <= 200; i++) {

        //System.out.println(Thread.currentThread().getName());
        // }
    }
}

// nor
class B extends Thread {

    public void run() {
        for (int i = 200; i <= 300; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

// eme
class C extends Thread {

    public void run() {

        for (int i = 300; i <= 400; i++) {

            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        System.out.println(a.getState());
        a.start();
        System.out.println(a.getState());
        a.sleep(500);
        System.out.println(a.getState());
        a.join();
        System.out.println(a.getState());
        // a.setPriority(Thread.MIN_PRIORITY);

        B b = new B();
        //b.setPriority(Thread.MIN_PRIORITY);
        C c = new C();
        //c.setPriority(Thread.MAX_PRIORITY);
        //c.start();
        // c.join();
        // a.start();
        //b.start();
    }
}
