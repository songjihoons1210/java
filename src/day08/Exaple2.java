package day08;

class 학생설계도{  //학생을 만들기 위한 학생설계도 [객체] 아니다
    // 멤버변수 = 속성/상태/특징/데이터 분리하기 나름
        String name; // 이름
        String lunchBox; // 점심도시락

    // 메소드 = 이벤트/행위/동작/사용법
    void 밥먹기(){
        System.out.println(name+"\\은\t"+lunchBox+"\\먹어용.");
    }
        }

public class Exaple2 {
    public static void main(String[] args) {

        // -- 줄 기준 클래스 1개 객체 x
        학생설계도 s1 = new 학생설계도();
        s1.name = "유재석";
        s1.lunchBox = "신라면";
        // -- 클래스 1개 객체 1개
        학생설계도 s2 = new 학생설계도();
        s2.name = "강호동";
        s2.lunchBox = "김밥";
        // -- 클래스 1개 , 객체 2개

        s2.밥먹기(); // 이렇게 작성시 강호동(name) "은" 김밥(lunchBox) "먹어용."
        s1.밥먹기(); // 이렇게 작성시 유재석(name) "은" 신라면(lunchBox) "먹어용."
        s2.밥먹기(); // 이렇게 작성시 강호동(name) "은" 김밥(lunchBox) "먹어용."

        //
        학생설계도[] 학생명단 = new 학생설계도[100]; // 학생명단 100명
        학생명단[0] = s1; // s1 은 유재석

        //
        학생명단[0].밥먹기(); // 이렇게 작성시 유재석(name) "은" 신라면(lunchBox) "먹어용."

        //
        int a =3;
        int b = 3;
        System.out.println( b );
    } // m end
} // c end
