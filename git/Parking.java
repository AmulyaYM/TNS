package methodExample;

public class Parking {
    String VehicleNUmber;
    Parking(){
        System.out.println("Parking constructor");
    }

    Parking(String VehicleNUmber){
        this.VehicleNUmber = VehicleNUmber;
        System.out.println("Parking constructor with vehicle number");
    }

        void calculateCharges(int hours){
            System.out.println("Charges for " + hours + " hours is: " + (hours * 10));

        }
        void calculateCharges(int hours, int rate){
            System.out.println("Charges for " + hours + " hours is: " + (hours * rate));
        }
}
class CarParking extends Parking{
    CarParking(String VehicleNUmber){
        this.VehicleNUmber = VehicleNUmber;
    }
    @Override 
    void calculateCharges(int hours){
        System.out.println("Charges for " + hours + " hours is: " + (hours * 20));
    }
}
class BikeParking extends Parking{
    BikeParking(String VehicleNUmber){
        this.VehicleNUmber = VehicleNUmber;
    }
    @Override 
    void calculateCharges(int hours){
        System.out.println("Charges for " + hours + " hours is: " + (hours * 5));
    }
}
class TruckParking extends Parking{
    TruckParking(String VehicleNUmber){
        this.VehicleNUmber = VehicleNUmber;
    }
    @Override
    void calculateCharges(int hours){
        System.out.println("Charges for " + hours + " hours is: " + (hours * 15));
    }
}
class ParkingRunner{
    
    public static void main(String[] args) {
        Parking parking = new Parking("KA-01-AB-1234");
        parking.calculateCharges(2);
        parking.calculateCharges(3, 15);

        CarParking carParking = new CarParking("KA-01-AB-5678");
        carParking.calculateCharges(2);

        BikeParking bikeParking = new BikeParking("KA-01-AB-9012");
        bikeParking.calculateCharges(2);

        TruckParking truckParking = new TruckParking("KA-01-AB-3456");
        truckParking.calculateCharges(2);
    }
}



