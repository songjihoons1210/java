package 종합.과제9.view;

import 종합.과제9.model.dto.UsedDto;
import 종합.과제9.usedController.UsedController;

import java.util.ArrayList;
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
                } else if (choice == 2) { usedPrint();
                } else if (choice == 3) { usedUpdate();
                } else if (choice == 4) { usedDelete();
                } else if (choice == 5) {
                } else if (choice == 6) { usedredd();
                } else if (choice == 7) { usedPrints();
                } else if (choice == 8) { userdproduct();
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
        System.out.print("판매자 : ");
        String sname = sc.next();
        System.out.print("물품명 : ");
        String sproduct = sc.next();
        System.out.print("내용 : ");
        String scontent = sc.next();
        System.out.print(" 비밀번호 ");
        String spass =  sc.next();
        System.out.print("가격 : ");
        int sprice = sc.nextInt();
        // controller 에게 전달하기 // 전달 후 (결과) 리턴
        boolean result = UC.usedAdd( sname, sproduct, scontent, spass, sprice , null);
        if (result) {
            System.out.println("[안내] 제품 등록이 완료 됨");
        }else {
            System.out.println("[경고] 제품 등록 실패 ");
        }
    }
    // 조회
    public void usedPrint() {
        // 요청 후 결과
        ArrayList<UsedDto> result = UC.usedPrint();
        // 결과 화면
        System.out.println("no. \t 물품명 \t 가격 \t 판매자 \t 판매여부 \t 등록일");
        for (UsedDto u : result) {
            System.out.printf("%d \t %s \t %d \t %s \t %s \n", u.getNum(), u.getSproduct(), u.getSprice(), u.getSname(), u.getStata());
        }
    }
    // 수정

    public void usedUpdate() {
        System.out.print("수정할 번호 : ");
        int num = sc.nextInt();
        System.out.print("비밀번호 입력 : ");
        String spass = sc.next();
        System.out.print("물품명 : ");
        String sproduct = sc.next();
        System.out.print("내용 : ");
        String scontent = sc.next();
        System.out.print("가격 : ");
        int sprice = sc.nextInt();
        boolean result = UC.usedUpdate(num, spass, sproduct, scontent, sprice);
        if (result) {
            System.out.println("수정 완료");
        }else {
            System.out.println("수정 실패");
        }
    }


    // 삭제
    public void usedDelete() {
        System.out.print("삭제할 번호 : ");
        int num = sc.nextInt();
        System.out.print("비밀번호 입력 : ");
        String spass =  sc.next();
        boolean result = UC.usedDelete(num,spass);
        if (result) {
            System.out.println("삭제 완료");
        }else {
            System.out.println("삭제 실패");
        }
    }

    // 익명 사용자

    // 상세 품목 조회
    public void usedredd() {
        System.out.print("검색할 품명 : ");
        String sproduct = sc.next();
        ArrayList<UsedDto> u = UC.usedredd(sproduct);
            System.out.println("no. \t 물품명 \t 가격 \t 판매자 \t 판매여부 \t 등록일");
            for (UsedDto u1 : u) {
                System.out.printf("%d \t %s \t %d \t %s \n",
                        u1.getNum(), u1.getSproduct(), u1.getSprice(), u1.getSname());
            }
        }

        // 순위
    public void usedPrints() {
        ArrayList<UsedDto> result = UC.usedPrints();
        System.out.println("판매자 \t 등록 수 ");
        for (UsedDto u : result) {
            System.out.printf("%s \t %d \n", u.getSname() , u.getSprice() );

        }
    }
    // 최신순
    public void userdproduct() {
        System.out.print("검색 물품 : ");
        String sproduct = sc.next();
        ArrayList<UsedDto> result = UC.usedPrints(sproduct);
        System.out.println("물품명 \t 가격 \t 판매자 \t 등록일 \t 판매여부");
        for (UsedDto u : result) {
            System.out.printf("%s \t %d \t %s \t ", u.getSproduct() ,  u.getSprice(), u.getSname());
        }
    }


} // class end
