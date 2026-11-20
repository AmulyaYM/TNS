package racecondition;

class Counter {

    int count;

    synchronized void increment() {
        count++;
    }
}

class Print extends Thread {

    Counter counter;

    Print(Counter counter) {
        this.counter = counter;

    }

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            counter.increment();
        }
    }
}

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Print p = new Print(counter);
        p.start();
        Print p2 = new Print(counter);
        p2.start();
        p.join();
        p2.join();
        System.out.println(counter.count);

    }

}
