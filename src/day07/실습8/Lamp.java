package day07.실습8;

public class Lamp {
    boolean isOn = false;
    void turnOn(String S) {
        if ("on".equalsIgnoreCase(S)) { // qualsIgnoreCase()  gpt 참고 대소문자 사용해도 상관없음
            System.out.println("Lamp is on");
            isOn = true;
        }else if ("off".equalsIgnoreCase(S)) {
            System.out.println("Lamp is off");
            isOn = false;
        }
    }
}
