package 종합.과제2;

import java.util.Scanner;

public class WaitingService2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Waiting[] waitings = new Waiting[100];

        for (; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 >");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("==== 대기 등록 ====");
                System.out.print("전화번호 : ");
                String content = sc.next();
                System.out.print("인원수 : ");
                int writer = sc.nextInt();
                Waiting waiting = new Waiting();
                waiting.content = content;
                waiting.writer = writer;
                boolean ffl = false;
                for (int i = 0; i <= waitings.length - 1; i++) {
                    if (waitings[i] == null) {
                        waitings[i] = waiting;
                        ffl = true;
                        break;
                    }
                }
                if (ffl) {
                    System.out.println("[안내] 대기 등록이 완료 되었습니다.");

                }else { System.out.println("자리 없어요"); }

            } else if (choice == 2) {
                System.out.println("==대기 현황자==");
                for (int i = 0; i <= waitings.length - 1; i++) {
                    Waiting waiting1 = waitings[i];
                    if (waiting1 != null) {
                        System.out.printf("대기 현황자 : %d명 \n", i+ 1, waiting1.content,waiting1.writer); // << gpt 참고 했습니다!.
                        System.out.println("전화번호 :" + waiting1.content);
                        System.out.println("인원수 :" + waiting1.writer);
                        System.out.println("=============");
                    }
                }

            }
        }
    }
}
