package 종합.예제7.view;

import 종합.예제7.controller.BoardController;
import 종합.예제7.model.dao.BoardDao;
import 종합.예제7.model.dto.BoardDto;

import java.util.Scanner;

// (역할) 게시물 관련 입출력 클래스
public class BoardView {
    // (*) 싱글톤 만들기 1~3단계
    private BoardView() {
    } // 1단

    private static final BoardView view = new BoardView(); // 2단계

    public static BoardView getInstance() { // 3단계
        return view; //
    }

    // (*) 여러 메소드에서 사용할 입력 객체 를 멤버변수로 선언
    private Scanner sc = new Scanner(System.in);

    // - Controller 객체 가져오기 : 멤버변수
    private BoardController boardController = BoardController.getInstance();
    // 미리만들어둔 객체를 꺼내(getInstance(); 오는 것 (싱글톤)


    // (1) 메인view : 최초로 보이는 화면
    public void index() {
        for (; ; ) { // 무한
            System.out.println("============= My Conity ============");
            System.out.println(" 1.게시물쓰기 | 2. 게시물출력 ");
            System.out.println("====================================");
            System.out.print("선택 > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                boardWrite();
            } else if (choice == 2) {
                boardPrint();
            }

        }
    } // f n

    // (2) 등록 view
    public void boardWrite() {
        System.out.println("내용 : ");
        String content = sc.nextLine();
        System.out.println("작성자 : ");
        String writer = sc.nextLine();
        boolean result = boardController.boardWrite(content, writer);
        // - 입력받은 값들을 controller 전달 후 반환값 저장
        if (result) {
            System.out.println("[안내] 글쓰기 완료");
        } else {
            System.out.println("실패");
        }
    }

    // (3) 조회 view
    public void boardPrint() {
        System.out.println("== 목록 ==");
        BoardDto[] result = boardController.boardPrint(); // controller 에게 조회를 요청하고 결과를
        for (int i = 0; i < result.length; i++) {
            BoardDto boarddto = result[i];
            if (boarddto != null) {
                System.out.println("번호:"+(i+1)+ "작성자 :" + boarddto.getWriter()+ "내용 :" + boarddto.getContent() );
                System.out.println("-----------------");
            }


        }
    }
}
