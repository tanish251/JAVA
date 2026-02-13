class SmartDevice {
    int deviceId;
    String brand;

    SmartDevice(int id, String b) {
        deviceId = id;
        brand = b;
    }

    void turnOn() {
        System.out.println(brand + " Device " + deviceId + " is turned ON.");
    }

    void turnOff() {
        System.out.println(brand + " Device " + deviceId + " is turned OFF.");
    }
}

class SmartLight extends SmartDevice {
    int brightnessLevel;

    SmartLight(int id, String b, int brightness) {
        super(id, b);
        brightnessLevel = brightness;
    }

    void adjustBrightness(int level) {
        brightnessLevel = level;
        System.out.println("Brightness adjusted to: " + brightnessLevel);
    }
}

class SmartThermostat extends SmartDevice {
    int temperature;

    SmartThermostat(int id, String b, int temp) {
        super(id, b);
        temperature = temp;
    }

    void setTemperature(int temp) {
        temperature = temp;
        System.out.println("Temperature set to: "+ temperature +"C");
    }
}

class SmartCamera extends SmartDevice {
    String resolution;

    SmartCamera(int id, String b, String res) {
        super(id, b);
        resolution = res;
    }

    void recordVideo() {
        System.out.println("Recording video in " + resolution + " resolution.");
    }
}

class Experiental3b {
    public static void main(String[] args) {

        SmartLight light = new SmartLight(101, "Philips", 70);
        light.turnOn();
        light.adjustBrightness(90);
        light.turnOff();

        System.out.println("------------");

        SmartThermostat thermostat = new SmartThermostat(102, "Samsung", 24);
        thermostat.turnOn();
        thermostat.setTemperature(26);
        thermostat.turnOff();

        System.out.println("------------");

        SmartCamera camera = new SmartCamera(103, "Sony", "1080p");
        camera.turnOn();
        camera.recordVideo();
        camera.turnOff();
    }
}
