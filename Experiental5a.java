interface RemoteControl {
    void turnOn();
    void turnOff();
    void increaseVolume();
    void decreaseVolume();
}

class TV implements RemoteControl {

    int volume = 10;

    public void turnOn() {
        System.out.println("TV is turned ON");
    }

    public void turnOff() {
        System.out.println("TV is turned OFF");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("TV Volume Increased to: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("TV Volume Decreased to: " + volume);
    }
}

class AirConditioner implements RemoteControl {

    int temperature = 24;

    public void turnOn() {
        System.out.println("Air Conditioner is turned ON");
    }

    public void turnOff() {
        System.out.println("Air Conditioner is turned OFF");
    }

    public void increaseVolume() {
        temperature--;
        System.out.println("Temperature Decreased to: " + temperature);
    }

    public void decreaseVolume() {
        temperature++;
        System.out.println("Temperature Increased to: " + temperature);
    }
}

class Speaker implements RemoteControl {

    int volume = 5;

    public void turnOn() {
        System.out.println("Speaker is turned ON");
    }

    public void turnOff() {
        System.out.println("Speaker is turned OFF");
    }

    public void increaseVolume() {
        volume += 2;
        System.out.println("Speaker Volume Increased to: " + volume);
    }

    public void decreaseVolume() {
        volume -= 2;
        System.out.println("Speaker Volume Decreased to: " + volume);
    }
}

class Experiental5a {
    public static void main(String[] args) {

        TV tv = new TV();
        tv.turnOn();
        tv.increaseVolume();
        tv.turnOff();

        System.out.println("------------");

        AirConditioner ac = new AirConditioner();
        ac.turnOn();
        ac.increaseVolume();
        ac.turnOff();

        System.out.println("------------");

        Speaker sp = new Speaker();
        sp.turnOn();
        sp.increaseVolume();
        sp.turnOff();
    }
}
