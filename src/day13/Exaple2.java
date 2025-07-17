package day13;

// * 자바의 모든 클래스는 자동으로 extends Object 이므로 자바는 100% 객체지향 이다.
class A {                                         // 부모 : Object , 자식 : B/C , 자손 : D/E
    A() { System.out.println("A 객체 탄생 "); }
}

class B extends A { // B는 A로부터 상솓받는다.       // 부모 : A , 자식 : D
    B() { System.out.println("B 객체 탄생 "); }
}

class C extends A {                               // 부모 : A , 자식 : E
    C() { System.out.println("C 객체 탄생 "); }
}

class D extends B { // D는 B로부터 상속받는다        // 부모 : B
    D() { System.out.println("D 객체 탄생"); }
}

class E extends C { // E는 C로부터 상속받는다.       // 부모 : C
    E() { System.out.println("E 객체 탄생"); }
}

public class Exaple2 {
    public static void main(String[] args) {


        // (1) A클래스로 객체 생성시 총 객채수 : 2개
        System.out.println("[1]-----");
        A a = new A(); // A . Object

        // (2) B클래스로 객체 생성시 총 객체수 : 3개
        System.out.println("[2]------");
        B b = new B(); // B ,A ,  Object

        // (3) C클래스로 객체 생성시 총 객채수 : 3개
        System.out.println("[3]------");
        C c = new C(); // C , A , Object

        // (4) D클래스로 객체 생성시 총 객채수 : 4개
        System.out.println("[4]-----");
        D d = new D(); // D , B , A , Object

        // (5) E클래스로 객체 생성시 총 객채수 : 4개
        System.out.println("[5]------");
        E e = new E();  // E , C , A , Object

        // (6) 자동타입 변환
        A a1 = b; // b객체(값)는 B타입
        Object o1 = b; // b객체(값)는 Object타입 변환 가능
        // B b2 = c;   // c 객체는 처음만들어 질때 부모가 A이다. 그러므로 오류발생

        // (7) 강제타입변환
        B b2 = (B)a1;   // ㅇㅇ a1태생 확인

        A a2 = e;       // 자동
        C c1 = (C)a2;  // 강제       |         C c1 = a2; 이건 불가능 올라가는건 가능한데 내려오는건 불가능

        // B b3 = (B)a2;  // 강제  불가능
        // 문법오류가 아닌 실행 오류 발생

        // (8) 인스턴스(객체/값) 타입 확인 방법
        // instance of 내느낌  아래 기준으로 치면 a2는 C에 있어?
        // 객체 instance of 타입/클래스명 : 객체가 지정한 클래스 타입 확인
        // instance of 키워드 사용
        System.out.println( a instanceof Object ); // true
        System.out.println( b instanceof A );  // true
        // System.out.println( e instanceof B); // false 오류발생 왜 e는 B가 아니라 C 이기 때문에 false 이다
        System.out.println( e instanceof C); // true // 위랑 다르게 e 는 C가 부모이기 때문에 true 이다
        System.out.println( a2 instanceof C ); // true
        System.out.println( a2 instanceof B ); // false

        // (9) 상속 활용처
        // 1. 웹/앱 라이브러리
        // 2. 클래스 설계
        //      코드치다가 명령어(코드)가 중복되면 메소드화
        //      클래스정의하다가 다른클래스와 멤버변수 중복되면 상속화

    }
}
