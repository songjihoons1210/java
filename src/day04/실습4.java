package day04;

import java.util.Scanner;

public class 실습4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //
 /*
    //1.
        System.out.println("첫번째 점수 입력 : ");
        int 점수1 = scan.nextInt();
        System.out.println("두번째 점수 입력 : ");
        int 점수12 = scan.nextInt();
        String 총점1 = 점수1+점수12 >= 90 ? "성공" : "실패" ;
        System.out.printf("출력 : %s" , 총점1);

    //2.
        System.out.println("큰수 비교1 : ");
        int 정수2 = scan.nextInt();
        System.out.println("큰수 비교1 : ");
        int 정수22 = scan.nextInt();
        int 정수23 = 정수2 <= 정수22 ? 정수22 : 정수2 ;
        System.out.printf("결과 : %d", 정수23);

    //3.
        System.out.println("아이디 입력 : ");
        String id3 = scan.next();
        System.out.println("비밀번호 입력 : ");
        String pass3 = scan.next();
        String 결과3 = "admin".equals(id3) && "1234".equals(pass3) ? "로그인 성공" : "로그인 실패" ;
        System.out.printf("결과는 : %s", 결과3);

    //4. // mypassword123
        System.out.println("비밀번호 입력 :");
        String pass4 = scan.next();
        if (pass4.length() >= 12 ) {
            System.out.println("보안등급 : 강함");
        }else if (pass4.length() >= 8){
            System.out.println("보안 등급 : 보통");
        }else {
            System.out.println("보안 등급 : 약함");


    //5.
        System.out.println("주민번호 입력 - 포함 : ");
        char char4 = scan.next().charAt(7);
        if (char4 == '1' || char4 == '3'){
            System.out.println("남자");
        } else if (char4 == '2' || char4 == '4') {
            System.out.println("여자");
        }
    }


    //6.
        System.out.println("게임 점수 입력 : ");
        int 점수6 = scan.nextInt();
        if (점수6 >= 900) {
            System.out.println("A 상품");
        } else if (점수6 >= 700 ) {
            System.out.println("B 상품");
        } else if (점수6 >= 500) {
            System.out.println("C 상품");
        }else{
            System.out.println("참가상");
        }
    //7
        System.out.println("역할 입력 : ");
        String 역할7 = scan.next();
        if (역할7.equals("a")) {
            System.out.println("모든기능");
        }else if (역할7.equals("e")) {
            System.out.println("콘텐츠 수정");
        } else if (역할7.equals("v")) {
            System.out.println("콘텐츠 조회만");
        } else {
            System.out.println("없어");
        }

    //8
        System.out.println("나이 입력 : ");
        int 나이8 = scan.nextInt();
        if (나이8 >= 65) {
            System.out.println("3,000원");
        } else if (나이8 >= 20) {
            System.out.println("10,000원");
        } else if (나이8 >= 8) {
            System.out.println("5,000원");
        }else {
            System.out.println("무료");
        }


    //9
        System.out.println("성적 입력 : ");
        int 성적9 = scan.nextInt();
        if (성적9 >= 90 ){
            System.out.println("A등급");
        } else if (성적9 >= 80 ) {
            System.out.println("B등급");
        } else if (성적9 >= 70) {
            System.out.println("C등급");
        } else {
            System.out.println("재시험");
        }


    //10
        System.out.println("구매 할인 확인 : ");
        int 구매10 = scan.nextInt();
        if (구매10 >= 50000) {
            System.out.println("10퍼 할인");
        } else if (구매10 >= 30000) {
            System.out.println("5퍼 할인");
        } else if (구매10 >= 10000) {
            System.out.println("1퍼 할인");
        } else {
            System.out.println("나가기");
        }


    //11
        System.out.println("월 : ");
        int 월11 = scan.nextInt();
        if (월11 == 3 || 월11 == 4 || 월11 == 5) {
            System.out.println("봄");
        } else if (월11 == 6 || 월11 == 7 || 월11 == 8) {
            System.out.println("여름");
        } else if (월11 == 9 || 월11 == 10 || 월11 == 11) {
            System.out.println("가을");
        } else if (월11 == 12 || 월11 == 1 || 월11 == 2) {
            System.out.println("겨울");
        }


    //12
        System.out.println("정수1 입력 : ");
        int 정수1 = scan.nextInt();
        System.out.println("정수2 입력 : ");
        int 정수2 = scan.nextInt();
        System.out.println("정수3 입력 : ");
        int 정수3 = scan.nextInt();
        int max = 정수1;
        if ( max < 정수2 ) { max = 정수2; }
        if ( max < 정수3 ) { max = 정수3; }
        System.out.println(max);

    //13
        System.out.println("연도 입력 : ");
        int year = scan.nextInt();
        if ( ( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0  ) ) {
            System.out.println("윤년");
        }else{
            System.out.println("평년");
        }

    //14.
        System.out.println("정수1 입력 :");
        int 정수1 = scan.nextInt();
        System.out.println("정수2 입력 :");
        int 정수2 = scan.nextInt();
        System.out.println("정수3 입력 :");
        int 정수3 = scan.nextInt();
        if (정수1 > 정수2) {int temp = 정수1; 정수1 = 정수2; 정수2=temp; }
        if (정수1 > 정수3) {int temp = 정수1; 정수1 = 정수3; 정수3=temp; }
        if (정수2 > 정수3) {int temp = 정수2; 정수2 = 정수3; 정수3=temp; }
        System.out.printf(" %d -> %d -> %d \n" , 정수1 ,정수2 , 정수3 );
        }


    //15.
        System.out.println("가위바위보 ㄱㅇ0 ㅂㅇ1 ㅂ2 : ");
        int p1 = scan.nextInt();
        System.out.println("가위바위보 ㄱㅇ0 ㅂㅇ1 ㅂ2 : ");
        int p2 = scan.nextInt();
        if ( (p1==0 && p2==2) || ( p1==1&&p2==0) || ( p1==2&&p2==1) ) {
            System.out.println("p1 승리");
        }else if ( p1 == p2 ) {
            System.out.println("무승부");
        }else {
            System.out.println("p2 승리");
    }

  */
    }
}