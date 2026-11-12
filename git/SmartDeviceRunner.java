package methodExample;

class SmartDevice {
    String deviceName;

    SmartDevice() {
        System.out.println("Smart Device Constructor");
    }

    void turnOn() {
        System.out.println("Device is ON");
    }

    void control(int level) {
        System.out.println("Control Level: " + level);
    }

    void control(String mode) {
        System.out.println("Control Mode: " + mode);
    }
}

class SmartLight extends SmartDevice {

    SmartLight(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " Light is ON");
    }
}

class SmartFan extends SmartDevice {

    SmartFan(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " Fan is ON");
    }
}

class SmartAC extends SmartDevice {

    SmartAC(String deviceName) {
        this.deviceName = deviceName;
    }

    @Override
    void turnOn() {
        System.out.println(deviceName + " AC is ON");
    }
}

public class SmartDeviceRunner {
    public static void main(String[] args) {

        SmartLight light = new SmartLight("Bedroom");
        light.turnOn();
        light.control(80);
        light.control("Bright Mode");

        System.out.println();

        SmartFan fan = new SmartFan("Ceiling");
        fan.turnOn();
        fan.control(3);

        System.out.println();

        SmartAC ac = new SmartAC("Voltas");
        ac.turnOn();
        ac.control(24);
    }
}
