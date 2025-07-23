package 종합.예제10;

import 종합.예제10.controller.BoardController;
import 종합.예제10.model.dto.BoardDto;
import 종합.예제10.view.BoardView;
import 종합.예제6.Board;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {

        // *선택. view 없이 샘플 데이터로 기능 테스트
        boolean result = BoardController.getInstance().boardWrite("테스트 내용" , " 강사 ");
        System.out.println(result);

        // 2. 20250723 전체조회 테스트
        ArrayList<BoardDto> result2 = BoardController.getInstance().boardPrint();
        System.out.println(result2);

        // 3. 20250723 특정삭제 테스트
        boolean result3 = BoardController.getInstance().boardDelete(2);

        // 4. 20250723 수정 테스트
        boolean result4 = BoardController.getInstance().boardDelete(3);
        System.out.println(result4);


        // * 메인화면 호출
        BoardView.getInstance().index();




    }
}
