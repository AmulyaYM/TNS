
package OOPS.Polymorphism;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike starts with a button");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starts with a key");
    }
}

public class Main {
    public static void main(String[] args) {


       Vehicle v = new Vehicle();
        v.start();

       Vehicle v1 = new Car();
        v1.start();

       Vehicle v2= new Bike();
        v2.start();

        Vehicle v3 = new Truck();
        v3.start();
    }
}
