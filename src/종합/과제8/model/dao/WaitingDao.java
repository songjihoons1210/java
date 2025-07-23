package 종합.과제8.model.dao;

import 종합.과제8.model.dto.WaitingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class WaitingDao {
    // 싱글톤
    private WaitingDao() {
        connect(); // 불러오기
    }

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    // DB 주소
    private String db_url = "jdbc:mysql://localhost:3306/mydd0723";
    private String db_user = "root";
    private String db_password = "1234";
    private static Connection conn;

    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 연동
            conn = DriverManager.getConnection(db_url, db_user, db_password); // 계정 주소 , 계정명 , 계정 비밀번호
        } catch (Exception e) {
            System.out.println(e); // 예외 처리
        }
    } // connect end

    // 등록
    public boolean waitingAdd(WaitingDto waitingDto) {
        try{
            // 1. SQL 작성한다
            String  sql = "insert into waiting( phone , count ) VALUES(?,?)";
            // 2. SQL 기재
            // PreparedStatement : sql 컴파일 하여 미리 준비하는 객체
            PreparedStatement ps = conn.prepareStatement(sql);
            // 3. SQL 매개 변수 대입 ,
            ps.setString(1, waitingDto.getPhone()); // sql 내 두번째 매개변수 phone 출력 연락처
            ps.setString(2, waitingDto.getCount()); // sql 내 세번째 매개변수 count 출력 인원수
            // 4. sql 실행
            int che = ps.executeUpdate();
            // 5. sql 로직 리턴 확인
            if (che >= 1) {return true;} // che 가 1이 맞으면 대기 등록/저장 return true 성공 반환
            return false; // che 가 1이 아니면 대기 등록/저장 실패
        }catch (Exception e){
            System.out.println(e);
            return false; // 예외 처리 발생 저장 실패
        }
    } // waitingAdd and

    // 조회 등록
    public static ArrayList<WaitingDto> waitingPrint() {
        // controller 에게 요청 후 결과 받기
        ArrayList<WaitingDto> list = new ArrayList<>();
        // ArrayList를 생성하여 Dto의 여러 정보를 받아 view쪽으로 넘겨주기 위함
        try{
            // 1. sql 구성
            String sql = "select * from waiting";
            // waiting select 검색한다 * 전체를 누구 전체? from Waiting 테이블 Waiting을
            PreparedStatement ps = conn.prepareStatement(sql);  // 위랑 내용 같음 sql 컴파일 후 준비
            ResultSet rs = ps.executeQuery(); // 여러 코드/묶음으로 와도 한줄씩 차례대로 보여주는 객체

            while (rs.next() ) { // rs.next() 조회 결과테이블에서 next 다음 레코드 가있으면 true 이동 없으면 false
                int num = rs.getInt("num"); // num 컬럼 값을 정수로 가져와 정수 저장
                String phone = rs.getString("phone"); // phone 컬럼 값을 문자열로 가져와 문자열 저장
                String count = rs.getString("count"); // count 컬럼 값을 문자열로 가져와 문자열 저장
                WaitingDto waitingDto = new WaitingDto(num,phone,count); // 저장한 값을 waitingDto에
                // list에 waitingDto(num,phone,count)) 추가
                list.add(waitingDto);
        } // while end
    }catch (Exception e){ // 예외 처리
            System.out.println(e);}
        return list; // list 반환
    }

    // 삭제 기능
    public boolean waitingDelete(int num ) { // 대기번호 조회 하여 삭제
        try {
            // sql 기재
            String sql = "delete from waiting where num = ?";
            // 삭제한다 delete from waiting 테이블 waiting 에서 where num = ?" 번호를 조회하여 삭제
            // sql 기재
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt( 1 , num);
            // sql 내 첫 번째 int num(대기번호) 값 대입
            int che = ps.executeUpdate();
            // 삭제 해야하므로 executeUpdate [ insert , update , delete
            if ( che == 1 ) { return true; }
            else {return false;}
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    } // waitingDelete end

} // class end
