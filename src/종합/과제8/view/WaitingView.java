package 종합.과제8.view;

import 종합.과제8.WaitingController.WaitingController;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WaitingView {
    private WaitingView() { }
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance() {
        return instance;
    }

    // 입력 객체
    private Scanner sc = new Scanner(System.in);

    // 등록 화면
    public void index() {
        try{
            System.out.println("===== 맛집 =====");
            System.out.println(" 1.등록 | 2.대기인원조회 | 3.대기취소/삭제 | 4.대기인원수정 ");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            if(choice == 1) { waitingAdd(); }
            else if (choice == 2) { waitingPrint(); }
            else if (choice == 3) {waitingDelete(); }
            else if (choice == 4) { }
            else {
                System.out.println("[경고] 잘못된 접근 입니다. ");
            }
            // InputMismatchException 입력 타입 불일치시 자동 예외 발생
        }catch (InputMismatchException e){
            System.out.println("입력 타입 일치 x  다시입력해주세요");
            sc = new Scanner(System.in); // 불일치하여 예외 발생 하였으니 입력 객체 재생성
        }catch (Exception e) { // 위 내용이 불일치하여 예외 처리
            System.out.println(" [ 오류 발생 ] 문의 바람 010-1234-56789 ");
        }
    } // index end

    // Controller 싱글톤 불러오기
    WaitingController WC = WaitingController.getInstance();

    // 등록 화면 구현
    public void waitingAdd() {
        System.out.print("연락처 : ");
        String phone =  sc.next();
        System.out.print("인원수 : ");
        String count = sc.next();
        // controller 값 전달하기
        boolean result = WC.waitingAdd( phone , count);
        // phone , count 받은 값을 BC에 전달 후 DB 저장 시도
        if (result) { // 성공시
            System.out.println("맛집 대기 등록 성공");
        }else { // 실패시
            System.out.println("맛집 대기 등록 실패");
        }
    } // waitingAdd end

    // 전체 조회
    public void waitingPrint() {
        // controller 에게 요청후 결과 받기
        ArrayList<WaitingDto> result  = WC.waitingPrint();
        // 결과 화면 구현
        System.out.println("대기순서 \t phone \t count ");
        for (WaitingDto w : result) {
            System.out.printf("%d \t %s \t %s", w.getNum(), w.getPhone() , w.getCount() );
        }
    } // Print end
    public void waitingDelete() {

    }
}
