package day14;

//
class 상위클래스 {
    int value1 = 10;
    int value2 = 20; // 멤버변수

    상위클래스() {
        System.out.println("[상위클래스 인스턴스생성] ");
    } // 생성자

    void showValue() { // 메소드
        System.out.println(">>상위클래스의 메소드 실행<< ");
    }
}

//
class 하위클래스 extends 상위클래스 { // 클래스B extends 클래스A { }
    int value = 30;
    int value2 = 40; // 멤버변수

    하위클래스() {
        System.out.println("[하위클래스 인스턴스 생성]");
    }

    void showValue2() { // 메소드
        System.out.println(">> 하위클래스의 메소드 실행 <<");
    }
}

public class Exaple1 {
    public static void main(String[] args) {

        // (1) 상위클래스 객체 생성
        상위클래스 obj1 = new 상위클래스();
        obj1.showValue();
        // obj1.showValue2(); // 하위클래스 자식의 멤버 접근 불가

        // (2) 하위 클래스 객체 생성
        하위클래스 obj2 = new 하위클래스();
        obj2.showValue(); // 현재타입
        obj2.showValue2(); // 상위타입 접근 가능

        // (3) 멤버변수명이 동일할떄 구분
        System.out.println( obj2.value1 );
        // 상위클래스의 멤버변수

    }
}
