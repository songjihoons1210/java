package 종합.예제7.model.dao;

// (역할) 실제 데이터가 존재하는 데이터에 접근하는 기능(CRUD)

import 종합.예제7.model.dto.BoardDto;

public class BoardDao {
    // * (싱글톤)
    private BoardDao() {
    }

    private static final BoardDao dao = new BoardDao();

    public static BoardDao getInstance() {
        return dao;
    }

    // * 데이터베이스 : 추후에 데이터베이스로 변경할 예정
    BoardDto[] boardDB = new BoardDto[100]; // 배열 100개

    // 1. 등록 처리 메소드 : controller 로 부터 db(배열)에 저장할 객체를 받아서 저장한ㄷ.
    // 매개변수 : BoardDto , 반환값 : boolean
    public boolean boardWrite(BoardDto boardDto) { // 이벤트 boolean 사용
        for (int i = 0; i < boardDB.length; i++) { // 빈배열을 찾기위해 사용
            if (boardDB[i] == null) { // boardDb i번째가 빈배열을 찾으면
                boardDB[i] = boardDto; // i번쨰 저장할 객체 /값? 대입
                return true; // 성공 true 반환
            }
        }
        return false; //실패 시 false 반환

    }

    // 2. 조회 처리 메소드 : controller 로 부터 모든 db(배열)을 반환 한다.
    // 매개변수 : x        , 반환값 : BoardDto[]
    public BoardDto[] boardPrint() {
        return boardDB; // boardDB 반환

    }
}