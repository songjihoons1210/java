package 종합.과제9.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UsedDao {

    //싱글톤
    private UsedDao() {
        con(); // 불러오기
    }
    private static final  UsedDao instance = new UsedDao();
    public static UsedDao getInstance() {
        return instance;
    }

    // db 연동
    private String db_url = "jdbc:mysql://localhost:3306/db02250724";
    private String db_user = "root";
    private String db_password = "1234";
    private Connection conn; // 인터페이스
    private void con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql driver 연동
            conn = DriverManager.getConnection(db_url , db_user , db_password); // 계정 주소 , 계정명 , 계정 비밀번호
        }catch (Exception e) { // 예외 처리
            System.out.println(e);
        }
    }
}
