package day05;

import java.util.Scanner;

public class 실습5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //3
        int num = 0;
        for (int i = 0; i <= 50; i++) {
            num = num + i;
            System.out.println(num);
        }
        //4
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //5
        for (int i = 0; i <= 30; i++) {
            if (i % 3 == 0) {
                continue;
            }
            {
                System.out.println(i);
            }
        }
        //6
        int c = 0;
        for (int a = 0; a <= 999; a++) {
            for (int b = 0; b <= 999; b++) {
                c = a + b;
                if (c == 100) {
                    System.out.println(c);
                } else {
                    break;
                }
            }
        }
        //7


        for (int a = 1; a <= 5; a++) {
            String star7 = "";
            for (int b = 1; b <= a; b++) {
                star7 += "*";
            }
            System.out.println(star7);
        }
        //8

        for (int a = 5; a >= 1; a--) {
            String star8 = "";
            for (int b = 1; b <= a; b++) {
                star8 += "*";
            }
            System.out.println(star8);
        }
        //9
        System.out.print("입력 바람 : ");
        int count = 0;
        for (; ; ) {
            //Scanner scan = new Scanner(System.in); // (1) 입력객체 생성하여 변수에 저장한다.
            String str = scan.next();   // (2) 문자열 입력받아 문자열 변수에 저장한다.
            System.out.println(str); // (3) 입력받은 값 출력
            if (str.equals("end")) { //(4) 자바에서 문자열 비교는 .equals() 함수 사용.
                System.out.printf("[안내] 프로그램 종료 입니다. [ 총 %d회 입력] \n", count); // (7)
                break; // (5) 가장 가까운 반복문 종료 :
            }
            // (6) 입력 함수 == 반복 횟수 저장하는 변수
            // int count = 0 ; // 반복문 안에서 변수 선언시 선언이 계속 반복된다.
            count++;    // count +=1    , count = count + 1
        }
        System.out.println();

        //10
        int july1 = 3532100;
        int july1만원 = july1 / 10000;    // int / int -> int(몫)
        int july2 = 9123700;
        int july2만원 = july2 / 10000;    // int / int -> int(몫)
        int july3 = 5183400;
        int july3만원 = july3 / 10000;    // int / int -> int(몫)
        int july4 = 11738700;
        int july4만원 = july4 / 10000;    // int / int -> int(몫)

        for (int i = 1; i <= july1만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july1만원 + "만원");

        for (int i = 1; i <= july2만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july2만원 + "만원");

        for (int i = 1; i <= july3만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july3만원 + "만원");

        for (int i = 1; i <= july4만원 / 100; i++) {
            System.out.print("■");
        }
        System.out.println(july4만원 + "만원");

        //11
        // stop1: 시작적인 요소
        // step3: 기능 구현에 필요한 메모리 설계
        // balance배열 : (for밖에-누적o) 초기잔금 0부터 해서 입금 했을때 + , 출금했을때 - 하여 현재 금액 저장하는 변수
        // monye 입금액/출금액 변수 : (for안에-누적x)

        // step4 : 각 기능별 코드 구현
        // 입금기능 : money 입력받아 balance 변수에 누적합계( + ) 한다.
        // 출금기능 : money 입력받아 balance 보다 이상이면 차감( - ) 한다.
        // 잔고기능 : balance 변수 출력한다.
        // 종료기능 : break;   무한루프 종료
        //  ---> js 로그인 기능
        // 1.
        int balance = 0; // (1) 메모리 : 잔고변수
        for (; ; ) { // (1) 무한루프 , 특정한 break를 만나기 전까지 계속 반복실행
            // (2) 출력
            System.out.print("---------------------------------");
            System.out.print("1:입금 | 2:출금 | 3:잔고 | 4:종료");
            System.out.print("---------------------------------");
            // (3) 입력
            System.out.print("선택> ");   // 3-1 : 입력 객체 생성하여 변수에 저장
            int choose = scan.nextInt(); // 3-2 : 입력받은 정수를 변수에 저장
            if (choose == 1) { // 만약 1번 선택시
                // (2) 각각의 출력/입력
                System.out.print("입금액 : ");
                int money = scan.nextInt();
                balance += money;
            } else if (choose == 2) { // 만약 2번 선택시
                // (2) 각각의 출력/입력
                System.out.print("출금액 : ");
                int money = scan.nextInt();
                if (balance >= money) {
                    balance -= money;
                } else {
                    System.out.println("잔고가 부족합니다. ");
                }
            } else if (choose == 3) { // 만약에 3번 선택시
                System.out.println("잔고액 :" + balance);
            } else if (choose == 4) { // 만약에 4번 선택시
                System.out.println("프로그램 종료");
                break; //강제 종료
            }
        } // for end

    }
}
