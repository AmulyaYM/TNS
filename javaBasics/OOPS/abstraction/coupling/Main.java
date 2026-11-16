package OOPS.abstraction.coupling;
class Vehicle{
    void run(){
        System.out.println("runs on petrol");
    }
}
class Car{
    void run(){
        Vehicle vehi = new Vehicle();
        //tight coupling-- completly dependent on one class 
        vehi.run();
    }
}
public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.run();
    }

}
