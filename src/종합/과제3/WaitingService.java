package 종합.과제3;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {

        WaitingController wc = new WaitingController();

        for (; ; ) {
            System.out.println("============= My Community =============");
            System.out.println("1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            Scanner sc = new Scanner(System.in);
            System.out.println("선택 > ");
            int check = sc.nextInt();
            if (check == 1) {
                System.out.println(" 전화번호 : ");
                String phone = sc.next();
                System.out.println(" 인원수 :");
                int count = sc.nextInt();
                Waiting wa = new Waiting();
                wa.phone = phone;
                wa.count = count;
                boolean asd = wc.doPost(phone, count);
                if (asd == true) {
                    System.out.println("대기 완");
                } else {
                    System.out.println("대기 패");
                }
            } else if (check == 2) {
                System.out.println("-------------------");
                Waiting[] waitings = wc.doGet();
                for (int index = 0; index <= waitings.length - 1; index++) {
                    Waiting waiting = waitings[index];
                    if (waiting != null) {
                        System.out.println("전화번호 " + waiting.phone);
                        System.out.println("인원수 " + waiting.count);
                        System.out.println("------------------------------------");
                    }
                }


            }

        }
    }
}