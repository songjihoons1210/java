package 종합.예제10.model.dao;

import 종합.예제10.model.dto.BoardDto;

import javax.swing.plaf.PanelUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

public class BoardDao {
    private BoardDao() {
        connect();
    }

    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance() {
        return instance;
    }

    // (*)
    private String db_url = "jdbc:mysql://localhost:3306/exam10";
    private String db_user = "root";
    private String db_password = "1234";
    private static Connection conn;

    private void connect() {
        // db 연동하니 이제는 ArrayList<> 사용 x
        try {
            Class.forName("com.mysql.jdbc.Driver"); // 연동
            conn = DriverManager.getConnection(db_url, db_user, db_password); // 계정주소 , 계정명 , 비밀번호


        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public boolean boardWrite(BoardDto boardDto) {
        // boolean              : 해당 메소드 실행 결과를 true(저장성공)false(저장실패) 반환 하기 위한 타입
        // BoardDto boardDto    : controller 로부터 저장할 값들을dto로 구성에서 받는 매개변수
        try {
            // 1. SQL 작성한다.
            String sql = "insert into board( bcontent , bwriter ) VALUES ( ? , ? )";
            // 2. SQL 기재한다.
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 , 현재 ? 2개
            ps.setString(1, boardDto.getBcontent()); // sql내 1번 ? 에 매개변수로 받는 boardDto의 bcontent 값 대입
            ps.setString(2, boardDto.getBwriter()); // sql내 2번 ? 에 매개변수로 받은 boardDto의 bwriter 값 대입
            // 4. SQL 실행
            int count = ps.executeUpdate();
            // 5. SQL 결과에 따른 로직/리턴/확인
            if (count >= 1) {
                return true;
            } // count가 1 insert 했으면 저장 성공
            return false; // count가 1 insert 하지 못했으면 저장 성공
        } catch (Exception e) {
            System.out.println(e);
            return false; // 예외시 발생 저장 실패
        } // c end
    } // bW end


    // (2) 전체조회 기능 구현
    public static ArrayList<BoardDto> boardPrint() {
        // public : 다른 패키지의 Controller 가 접근하기 위해 public 다른패키지 접근 vs private 현재클래스만
        // ArrayList<BoardDto> :  배열 대신에 다양한 편의성 기능을 제공하는 ArrayList 클래스
        ArrayList<BoardDto> list = new ArrayList<>(); // 조회된 레코드(DTO) 들을 저장할 리스트 선언
        try {
            // 1. SQL 구성
            String sql = "select * from board";
            // 2. SQL 기재
            PreparedStatement ps = conn.prepareStatement(sql); // SQL 실행전 컴파일 후 준비중인 객체
            // 3. SQL 매개변수 대입 , SQL문법에 ?(매개변수)가 없어서 생략
            // 4. SQL 실행    , select = executeQuery()
            ResultSet rs = ps.executeQuery();
            // 5. SQL 결과에 따른 로직/리턴/확인
            // 1) select 조회 결과 레코드 하나씩 조회
            while (rs.next()) { // rs.next() : ResulSet 인터페이스가 갖는 (조회)결과테이블에서 다음레코드 이동 뜻
                // 2) 현재 조회중인 레코드를 속성값 호출해서 dto 만들기
                int bno = rs.getInt("bno"); // rs.get타입("가져올속성명or번호")
                String bcontent = rs.getString("bcontent");
                String bwriter = rs.getString("bwriter");
                BoardDto boardDto = new BoardDto(bno, bcontent, bwriter); // 레코드1개 --> DTO (맴버변수) 3 개
                // 3) 생성된 dto를 리스트에 담아주기
                list.add(boardDto);
            } // while 문 종료
        } catch (Exception e) {
            System.out.println(e);
            return list;

        }
        return list;
    }

    // (3) 삭제 기능 구현
    public boolean boardDelete( int bno ){ // int bno : 매개변수이면서 삭제할 게시물의 식별(pk)번호
        try {
            // sql 구성
            String sql = "Delete from board  where bno = ?";
            // sql 기재
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, bno); // sql 문법내 첫번쨰 ? 의 INT타입으로 BNO 값 대입 // 3. SQL 에게 변수 대입
            // 4. SQL 실행
            int count = ps.executeUpdate(); // 삭제 해야하므로  기재한 sql인 ps  에서 executeUpdate(); / insert , update , delete 를 사용할때
            // 5. SQL 결과에 따른 로직/리턴/확인
            if (count == 1) { return true;
            }else { return false;
            }
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    // (4) 수정 기능 구현

    public boolean boardUpdate(int bno, String bcontent) {
        try{
            String sql = "update board set bcontent = ?  where bno = ?"; // update 할때 * 사용 불가
            // sql 기재
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개변수 대입 , SQL 문법내 ? 개수만큼 대입
            ps.setString(1, bcontent); // .setString() 사용한 이유 : bcontent가 문자열
            ps.setInt(2 , bno); // 2 작성한 이유 : SQL문법내 두번째 ? 자리에 bno 값 대입
            int count = ps.executeUpdate();
            if (count == 1) { return true; }
            return false;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
} // c end
