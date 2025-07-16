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
    }
}
