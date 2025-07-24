package 종합.과제9.view;

import 종합.과제9.usedController.UsedController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsedView {

    // 싱글톤
    private UsedView() {
    }

    private static final UsedView instance = new UsedView();

    public static UsedView getInstance() {
        return instance;
    }

    // 입력 객체 받기
    private Scanner sc = new Scanner(System.in);

    // 메인
    public void index() {
        for (; ; ) {
            try {
                System.out.println("`============= 뚝딱마켓 =============");
                System.out.println("  1.중고 물품 등록 | 2.전체 물픔 목록 조회 | 3.물품 정보 수정 | 4.등록 물품 삭제 |  5. 익명 문의 남기기 | 6. 물품 상세 조회 | 7. 등록 랭킹 조회 | 8. 검색 조회");
                System.out.println("====================================");
                System.out.print("선택 > ");
                int choice = sc.nextInt();
                if (choice == 1) { usedAdd();
                } else if (choice == 2) {
                } else if (choice == 3) {
                } else if (choice == 4) {
                } else if (choice == 5) {
                } else if (choice == 6) {
                } else if (choice == 7) {
                } else if (choice == 8) {
                } else {
                    System.out.println("[경고] 번호 입력좀 ");
                }

            } catch (InputMismatchException e) {
                System.out.println("[경고] 초기화 ");
                sc = new Scanner(System.in); // 접근 실패이므로 값 초기

            } catch (Exception e) {// 예외처리
                System.out.println(e);
            }
        } // for( ;; ) end
    } // index end

    // CONtroller 싱글톤 가져오기
    UsedController UC =  UsedController.getInstance();

    // 등록
    public void usedAdd() {
        System.out.print("물품명 : ");
        String sproduct = sc.next();
        System.out.print("내용 : ");

        System.out.print("가격 : ");
        System.out.print("판매자 : ");
        System.out.print(" 비밀번호 ");

    }

} // class end
