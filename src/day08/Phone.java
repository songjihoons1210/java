package day08;

public class Phone {
    // 클래스내 멤버
    // 1. 멤버변수
    String model; // 핸드폰 모델명
    String color; // 핸드폰 색상
    int price; // 핸드폰 가격   [private] 잠금 건들수 없음
    // 2. 생성자
        // 1) 기본생성자 :
            // -> 클래스내 생성자가 없으면 자동으로 [컴파일될떄] 생성된다.
            // -> 클래스내 하나 이상의 생성자가 있을때는 직접 기본생성자 정의
    Phone() {
        System.out.println("--> Phone 기본 생성자 실행");
    }
    // 2) 매개변수가 있는 생성자
        // -> 생성자와 매개변수는 있지만 반환값이 없다.
    Phone( String pModel, String pColor ) {
        // --> 외부로 부터 전달받은 인자값이 저장된 매개변수 값을 멤버변수에 반환
        model = pModel ; // 내부변수 = 외부변수;
        color = pColor ;
        price = 120000; // 초기값을 임의로 고정한다. 12만원
    }
    // 3) 생성자의 오버로드
        // -> 기존 생성자와 메개변수의 타입/순서/개수 다르면 오버로드
    Phone( String pModel, String pColor, int pPrice ) {
        // ---> 멤버변수 : 객체 변수
        // ---> 매개변수 : 메소드/생성자가 사용되는 인수값 저장변수
        // 문제점 : 이름이 같다..
        // model = model; // 누가 멤버 고 누가 메개 인지 모른다.
        // 해결책 : this키워드 : 현재 메소드/생성자를 호출하는 객체 가리킨다.
        this.model = model;
        this.color = color;
        this.price = price;
        // this 사용 x 이름 바꾸기 :
        // [관례적] 초기하 값은 멤버변수와 매개변수명을 통일하게 된다

    }

    // 3. 메소드
} // class end
