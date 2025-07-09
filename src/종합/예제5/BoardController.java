package 종합.예제5;

public class BoardController {

    Board[] boards = new Board[100]; // board 객체 100개

    // 1. 등록 이벤트 : 입력받은 자료를 받아서 객체를 생성하여 배열에 저장
    // 메소드 이름: dodo
    // 매개변수 : 저장할 내용 고 ㅏ작성자
    // 반환값 : 성공/실패 == boolean

    boolean dodo(String content , String writer) { // 이벤트 사용시 사용해야 하는 boolean 타입 사용
        Board board = new Board(content, writer); //생성자 객체 만들기
        for (int i = 0; i < boards.length; i++) { // 반복문 boards[100]에 빈공간 찾기 위함
            if (boards[i] == null) { // boards[ i ] 번째가 null 이면
                boards[i] = board;  // i 번째 생서ㅇ한 객체 대입
                return true; // 트루시 종료
            }
        } return false; // null이 존재 하지 않을시 false 반환
        }
        // 2. (출력) 조히 이벤트 : 현재 저장된 모든 객체들을 가지고 있는 배열 호출
        // 메소드 이름 :
        // 매개변수 : x         , x
        // 반환값 : boards     , Board[]
        Board[] doGet( ) {
            return boards; }
    }
