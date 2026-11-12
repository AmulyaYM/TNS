package methodExample;

class Cab {
    String driverName;
    String vehicleNumber;

    Cab() {
        System.out.println("Cab Constructor");
    }

    void bookCab(String pickup, String destination) {
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
    }

    void bookCab(String pickup, String destination, int passengers) {
        System.out.println("Pickup: " + pickup);
        System.out.println("Destination: " + destination);
        System.out.println("Passengers: " + passengers);
    }

    void calculateFare(int km) {
        System.out.println("Cab Fare: " + (km * 10));
    }
}

class MiniCab extends Cab {

    MiniCab(String driverName, String vehicleNumber) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    void calculateFare(int km) {
        System.out.println("Mini Cab Fare: " + (km * 10));
    }
}

class SedanCab extends Cab {

    SedanCab(String driverName, String vehicleNumber) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    void calculateFare(int km) {
        System.out.println("Sedan Cab Fare: " + (km * 15));
    }
}

class SUV extends Cab {

    SUV(String driverName, String vehicleNumber) {
        this.driverName = driverName;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    void calculateFare(int km) {
        System.out.println("SUV Fare: " + (km * 20));
    }
}

public class CabRunner {
    public static void main(String[] args) {

        MiniCab mini = new MiniCab("Rahul", "KA01AB1234");

        System.out.println("Driver: " + mini.driverName);
        System.out.println("Vehicle: " + mini.vehicleNumber);

        mini.bookCab("Hassan", "Bangalore");
        mini.bookCab("Hassan", "Mysore", 3);
        mini.calculateFare(10);


        SedanCab sedan = new SedanCab("Keerthi", "KA02CD5678");
        System.out.println("Driver: " + sedan.driverName);
        sedan.calculateFare(1);



        SUV suv = new SUV("Arun", "KA03EF9876");
        System.out.println("Driver: " + suv.driverName);
        suv.calculateFare(10);
    }
}
