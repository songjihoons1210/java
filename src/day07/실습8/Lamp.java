package day07.실습8;

public class Lamp {
    boolean isOn = false;
    void turnOn() {
        if ("lamp".equals("On")) {
            System.out.println("Lamp is on");
            isOn = true;
        }else if ("lamp".equals("off")) {
            System.out.println("Lamp is off");
            isOn = false;
        }
    }
}
