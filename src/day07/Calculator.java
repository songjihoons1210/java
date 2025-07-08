package day07;

// - 클래스 목적
// (1) 실행 클래스 : main함수 갖는 클래스
// (2) 객체 설계 클래스 : 객체 만들기 위한 객체정의클래스
public class Calculator {

    // 클래스 멤버(객체내포함)
    // 1. 멤버변수
    boolean isPowerOn = false; // 전원 상태
    // 3. 생성자

    // 2. 메소드
    // (1) 메개변수x 반환값0
    double getPi( ) {
    // double : return[반환]할 값의 타입이 실수
    // getPI : 메소드명 , 카멜표기법 권장 숫자x
    // ( )   : 메개변수 , 없다.
        return 3.14159;
    // return 값 : 메소드를 호출 했던곳으로 반환 하는 값;
    }

    //(2) 메개변수x 반환값 x(void)
    void powerOn() {
        // void : return(반환)할 값이 없다는 키워드
        // { } : 메소드 실행 될때 처리할 코드들
        System.out.println("계산기 ");
        isPowerOn = true;
        // isPowerOn : 해당 메소드르 호출한 객체의 *****멥버변수*********
    } // f end
    // (3) 메개변수0, 반환값 x
    void printSum( int x , int y){
        // ( int x , int y ) : 메소드 실행시 인숙밧 정수 2개를 저장하는 변수
        if (isPowerOn ) {
            int sum = x * y ;
            System.out.println(sum);
            return; // 생략 가능
        }else {
            System.out.println("전원 꺼져있음");
            return;
        }
    } // void nd
    // (4) 메개변수0 , 변환값 0
    int add( int x , int y ) {
        if (isPowerOn) {
            int result = x + y;
            return result;
            // return 값 : 메소드를 호출했던곳으로 반환되는 값
        }else {
            System.out.println("전원 겨져있음");
            return 0;
        }
    }


}
