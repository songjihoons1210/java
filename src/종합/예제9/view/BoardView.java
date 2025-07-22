package 종합.예제9.view;

import 종합.예제9.controller.BoardController;
import 종합.예제9.model.dao.BoardDao;
import 종합.예제9.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    private BoardView() {
    }

    private static final BoardView instance = new BoardView();

    public static BoardView getInstance() {
        return instance;
    }

    // (*) 입력객체 : 메소드 밖에서 선언한이유 , 여러개 메소드에서 사용하기 위해
    private Scanner sc = new Scanner(System.in);
    // (*) BoardController 싱글톤 호출 : 컨트롤러 메소드/기능 사용하기 위해
    private BoardController boardController = BoardController.getInstance();

    // (*) 메인 뷰
    public void index() {
        for (; ; ) {
            System.out.println("-------------");
            System.out.println("1.글 등록 | 2 . 전체 조회");
            System.out.println("=============");
            System.out.println("선택 ");
            int choice = sc.nextInt();
            if (choice == 1) { boardWrite();
            } else if (choice == 2) { boardPrint();
            }
        }
    }

    // (1) 등록 뷰
    public void boardWrite() {
        System.out.println("내용 : ");
        String content = sc.next();
        System.out.println("작성자 : ");
        String writer = sc.next();
        boolean result = boardController.boardWrite(content, writer); // 2 .controller 에게 입력받은 값 전달하고 결과 받기
        if (result) {
            System.out.println(" 글 등록 성공 "); // 3. 결과에 따른 출력한다.
        } else {
            System.out.println(" 글 등록 실패 ");
        }

    }

    // (2) 전체조회 뷰
    public void boardPrint() {
            // 1. controller 요청후 결과 받기
        ArrayList<BoardDto> reuslt = boardController.boardPrint();
        // 2. 결과를 반복하여 출력한다.
        for (BoardDto dto : reuslt) {
            System.out.println("작성자"+dto.getWriter() );
            System.out.println("내용 : "+dto.getContent() );
            System.out.println("----------------");

    }


}

}