package 종합.과제4;

import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for ( ; ; ) { // 무한
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.println("선택 > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("== 대기 등록 ==");
                System.out.print("전화번호 :");
                String phone = sc.next();
                System.out.print("인원수 : ");
                String count = sc.next();
                boolean flag = WaitingController.dodo(phone, count);
                if (flag) {
                    System.out.println("[안내] 대기 등록 완료되었습니다. ");
                } else {
                    System.out.println("대기 등록 실패 하셨습니다.");
                }
            } else if (choice == 2) {
                System.out.println("==== 대기 현황 ====");
                Waiting[] waitings = WaitingController.getdo(); // WaitingController에 만들었던 getdo 호출하여 사용 set/저장 , 이건 get/호출 or 반환
                for ( int i = 0 ; i < waitings.length ; i++ ) {
                    if (waitings[i] != null){
                        System.out.println("순서: " + (i + 1) +"\t 연락처 :"+waitings[i].getPhone()+"\t인원: "+waitings[i].getCount());
                        // 순서 i로 할경우 인덱스0부터 시작하니 i+1 해줘서 1부터 시작 ,
                    }
                }

            }
        }
    }

}
