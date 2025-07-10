package day09;

class D {
    // final int 최종변수; // final은 초기값이 필요하다.
    final int 최종변수 = 10;
    // static
    static int 비멤버공유변수; // 객체내 포함하지 않고 객체가(new) 하지 않아도 사용가능
    // 상수 만들기
    static final int 상수 = 10;
    //[5]
    void 멤버메소드1() {}
    static void 비멤버메소드() { }
    void 멤버메소드2() {
        멤버메소드1();   // 가능
        비멤버메소드();   // 가능
    }
}

public class Exaple2 {
    void 멤버메소드() {} //static 아닌 메소드
    static void 비멤버메소드() { }   // static 메소드

    public static void main(String[] args) {


        // [1] final 멤버변수 호출
        D d = new D();
        System.out.println(d.최종변수); // 호출가능
        // d.최종변수 = 20; //수정 불가능

        // [2] static 정적변수에 호출 , 클래스명.정적변수명;
        System.out.println(D.비멤버공유변수); // 객체 없이 static 가능
        D.비멤버공유변수 = 20;
        System.out.println(d.비멤버공유변수 ); // 객체도 static 가능.   // 20

        // [3] static final 상수 호출 , 클래스명.상수명;
        System.out.println(D.상수);
        // [4] static 메소드 내 static 유무 메소드 호출
        // 멤버메소드(); // 불가능 :
        Exaple2 exap = new Exaple2();
        exap.멤버메소드();   // 가능 : 객체 통한
        비멤버메소드(); // 가능 : 객체 없이 사용 가능
        // [5] static 메소드 가 아닌 static 유무 메소드 호출

        /*
        [ final ] * 최후의
            1. 고정 상태를 정의할때 사용되는 키워드
            2. 사용법 : final 타입 멤버변수
            3. 주의할점 : 초기값이 무조건 존재 해야한다.
        [ static ] * 정적인
            1. 프로그램이 실행될때 메모리가 할당되고 프로그램이 종료될때 메모리 삭제되는 키워드
            2. 사용법 : static 타입 멤버변수 -------> static(정적)변수
            3. 주의할점 : 멤버변수(객체내변수) 공유x new VS static(우선할당)
                1) 프로그램내 딱 1개만 존재하는 변수를 선언할때 사용. 서로 다른 객체들이 공유해서 사용한다.
        [ 상수 ] : 변하지 않는 변수
            1. 사용법 : static final 타임 상수명;
            2. 주의할점 : 1)수정불가능 2)프로그램내 딱 1개 존재 3) 상수명 대문자 사용

        [ static 유무 중요한 이유 ]
            !!!!!   =  static으로 선언된 메소드는 같은 클래스내 메소드를 호출 할 수 없다.
            // 방법1 : 객체를 생성하여 객체를 통해 static 아닌 메소드 호출한다.

            class Test {
                static void main3() { }
                void main2() { }
                static void main() {
                    main2()     // 불가능 : main함수는 우선할당이 되면서 main2가 모른다.
                    new Test().main();  // 가능 : static 없는 경우 객체통해 가능
                    main3( )    // 가능 : main정수는 우선할당이 되면서 우선할당된 main3가 알고있다.
                    }
                }
         */
    }
}
