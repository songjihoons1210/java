package 종합;

import java.util.Scanner;

public class 종합과제1 { // class 시작
    public static void main(String[] args) { // main start
        Scanner scan = new Scanner(System.in); // 입력받기
        String phone1 = null;
        String phone2 = null;
        String phone3 = null;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (; ; ) { // 무한 시작
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("  1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int user = scan.nextInt();
            if (user == 1) {

                System.out.print("전화번호 : ");
                String phone = scan.next();
                System.out.print("인원수 : ");
                int count = scan.nextInt();
                if (phone1 == null) { // 없는지 확인
                    phone1 = phone; // 값을 넣음 phone1을 phone에
                    count1 = count; // 값을 넣음 count1을 count에
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else if (phone2 == null) {
                    phone2 = phone;
                    count2 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else if (phone3 == null) {
                    phone3 = phone;
                    count3 = count;
                    System.out.println("[안내] 대기 등록이 완료되었습니다.");
                } else {
                    System.out.println("[경고] 더 이상 대기 등록을 할 수 없습니다.");
                }

            } else if (user == 2) {
                System.out.println();
                System.out.println("대기 현황 리스트");
                System.out.println();
                if (phone1 != null) {

                    System.out.println("전화번호 : " + phone1); // 1번값
                    System.out.println("인원수 : " + count1);
                    System.out.println(); //띄움
                }
                if (phone2 != null) {
                    System.out.println("전화번호 : " + phone2); // 2번값
                    System.out.println("인원수 : " + count2);
                    System.out.println(); //띄움
                }
                if (phone3 != null) {
                    System.out.println("전화번호 : " + phone3); // 3번값
                    System.out.println("인원수 : " + count3);
                    System.out.println(); //띄움
                }


            }
        } // for end
    } // main end
} // class end
