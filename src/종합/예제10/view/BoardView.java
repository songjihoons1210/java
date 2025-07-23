package 종합.예제10.view;

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.dto.BoardDto;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }

    // (*) 메인 화면
    private Scanner sc = new Scanner(System.in);

    // (1) 등록 화면 구현
    public void index() {
        try {
            System.out.println("=========== 비회원 게시판 ===========");
            System.out.println("1.등록 | 2.전체조회 | 3.삭제 | 4.수정 || 선택> ");
            int choice = sc.nextInt();
            if (choice == 1) {
                boardWrite();
            } else if (choice == 2) {boardPrint();
            } else if (choice == 3) { boardDelete();
            } else if (choice == 4) {boardUpdate();
            } else {
                System.out.println("[경고] 존재하지 않는 번호 입니다.");
            }
        } catch (InputMismatchException e) {
            System.out.println("[경고] 입력 타입이 일치 하지 않습니다. <다시입력> ");
            sc = new Scanner(System.in); // * 입력에 따른 입력객체 초기화 : 잘못된 데이터 지우기
        } catch (Exception e) {
            System.out.println("[오류] 관리자에게 문의 <010-1234-5678> ");
        }
    }// index end

    // (*) boardController 싱글톤 불러오기
    BoardController BC = BoardController.getInstance();

    // (1) 등록 화면 구현
    public void boardWrite() {
        // 1. 입력받기
        System.out.print(" 내용 : ");
        String bcontent = sc.next(); // nextLine() 띄어 쓰기  가능
        System.out.print("  작성자  : ");
        String bwriter = sc.next(); // next() 띄어 쓰기 불가
        // 2. controller 전달하기 // 3. 전달후 (결과)리턴값 저장하기
        boolean result = BC.boardWrite(bcontent, bwriter); // bcontent, bwriter 값을 BC(Controller)에 값 전달 후 DB 저장 시도 성공 여부 반환
        // 4. 리턴된 값에 따른 출력하기
        if (result) { // 게시물 저장 성공시 메세지 출력
            System.out.println("[안내] 게시물 작성 성공 ");
        } else { // 게시물 저장 실패시 메세지 출력
            System.out.println("[경고] 게시물 등록 실패");
        }
    }
    // (2) 전체조회 화면 구현
    public void boardPrint() {
        // 1. controller 에게 요청후 결과 받기
        ArrayList<BoardDto> result = BC.boardPrint();
        // 2. 결과에 따른 화면ㄱ ㅜ현,
        System.out.println("no. \t name  \t content "); // 표 상단(헤더)
        for (BoardDto dto : result) { // 향상된 for문 , for( 타입 변수명 : 리스트명  ) {  }
            System.out.printf("%d \t %s \t %s", dto.getBno(), dto.getBwriter(), dto.getBcontent());
        }
    }
    // (3) 삭제 화면 구현
    public void boardDelete() {
        // 1. 입력 받기
        System.out.print("삭제할 게시물번호 : ");
        int bno = sc.nextInt();
        // 2. controller 전달하기
        boolean result = BC.boardDelete(bno);
        // 4. 리턴된 값에 따른 출력하기
        if (result) {
            System.out.println("[안내] 삭제 성공 ");
        } else {
            System.out.println("[경고] 없는 번호 ");
        }
    }

    // (4) 수정 화면 구현
    public void boardUpdate() {
        System.out.print("수정할 게시물 번호 : ");
        int bno = sc.nextInt();
        System.out.print("게시물 내용 :");
        String bcontent = sc.next();
        // 2. 컨트로럴에 전달
        boolean result = BC.boardUpdate(bno , bcontent);
        // 4. 리턴된 값 출력
        if (result) {
            System.out.println("[안내] 수정 완료 ");
        }else {
            System.out.println("[경고] 수정 실패 ");
        }
    }

} // c end
