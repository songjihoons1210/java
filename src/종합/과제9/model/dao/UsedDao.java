package 종합.과제9.model.dao;

import 종합.과제9.model.dto.UsedDto;

import java.sql.*;
import java.util.ArrayList;

public class UsedDao {

    //싱글톤
    private UsedDao() {
        con(); // 불러오기
    }

    private static final UsedDao instance = new UsedDao();

    public static UsedDao getInstance() {
        return instance;
    }

    // db 연동
    private String db_url = "jdbc:mysql://localhost:3306/db02250724";
    private String db_user = "root";
    private String db_password = "1234";
    private static Connection conn; // 인터페이스

    private void con() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // mysql driver 연동
            conn = DriverManager.getConnection(db_url, db_user, db_password); // 계정 주소 , 계정명 , 계정 비밀번호
        } catch (Exception e) { // 예외 처리
            System.out.println(e);
        }
    }

    // 등록
    public boolean usedAdd(UsedDto usedDto) {
        try {
            String sql = "insert into used( sname, sproduct, scontent, spass, sprice) values(? , ?, ? , ? , ? )";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usedDto.getSname());
            ps.setString(2, usedDto.getSproduct());
            ps.setString(3, usedDto.getScontent());
            ps.setString(4, usedDto.getSpass());
            ps.setInt(5, usedDto.getSprice());
            // sql 실행
            int i = ps.executeUpdate();
            // 리턴/로직/확인
            if (i > 0) {
                return true;
            } // 1이면 저장
            return false;
            // 아니면 실패
        } catch (Exception e) {
            System.out.println(e); // 예외처리
            return false;
        }
    }

    // 조회
    public static ArrayList<UsedDto> usedPrint() {
        ArrayList<UsedDto> usedDtos = new ArrayList<>();
        try {
            String sql = "select * from used";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) { // rs 인터페이스가 가지는 결과테이블에서 다음레코드 로 이동
                int num = rs.getInt("num"); // 가져올 번호
                String sname = rs.getString("sname");
                String sproduct = rs.getString("sproduct");
                String scontent = rs.getString("scontent");
                String spass = rs.getString("spass");
                int sprice = rs.getInt("sprice");
                String sday = rs.getString("sday");
                UsedDto usedDto = new UsedDto(num, sname, sproduct, scontent, spass, sprice , sday );
                usedDtos.add(usedDto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return usedDtos;
    }

    // 수정
    public boolean usedUpdate(int num, String spass, String sproduct, String scontent, int sprice) {
        try {
            String sql = "update used set sproduct = ? , scontent = ? , sprice = ? where num = ? and spass = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sproduct);
            ps.setString(2, scontent);
            ps.setInt(3, sprice);
            ps.setInt(4, num);
            ps.setString(5, spass);
            int i = ps.executeUpdate();
            if (i > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e); // 예외 처리
            return false;
        }
    }

    // 삭제
    public boolean usedDelete(int num, String spass) {
        try {
            String sql = "delete from used where num = ? and spass = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, num);
            ps.setString(2, spass);
            int i = ps.executeUpdate();
            if (i > 0) {
                return true;
            } else
                return false;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // 익명 문의
    // 일단 패스

    // 물품 조회
    public ArrayList<UsedDto> usedredd(String sproduct) {
        ArrayList<UsedDto> usedDtos = new ArrayList<>();
        try {
            String sql = "select * from used where sproduct = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sproduct);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int num = rs.getInt("num"); // 가져올 번호
                String sname = rs.getString("sname");
                String sproduct2 = rs.getString("sproduct");
                String scontent = rs.getString("scontent");
                String spass = rs.getString("spass");
                int sprice = rs.getInt("sprice");
                String sday = rs.getString("sday");
                UsedDto usedDto = new UsedDto(num, sname, sproduct2, scontent, spass, sprice ,sday);
                usedDtos.add(usedDto);
            }
        } catch (Exception e) {
            System.out.println(e);
            return usedDtos;
        }
        return usedDtos;
    }

    // 순위

    public ArrayList<UsedDto> usedPrints(String sproduct) {
        ArrayList<UsedDto> usedDtos = new ArrayList<>();
        try {
            String sql = "select sname , count(*) as dd from used group by sname ORDER BY dd desc limit 10 ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sproduct);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String sname2 = rs.getString("sname");
                int count2 = rs.getInt("dd");
                UsedDto usedDto = new UsedDto(0, sname2, null, null, null, count2  ,null);
                usedDtos.add(usedDto);
            }
        } catch (Exception e) {
            System.out.println(e);
            return usedDtos;
        }
        return usedDtos;
    }

    // 등록 최신순
    public ArrayList<UsedDto> userdproduct(String sproduct) {
        ArrayList<UsedDto> usedDtos = new ArrayList<>();
        try {
            String sql = "select * from used where sproduct ORDER BY sday asc ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sproduct);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int num = rs.getInt("num"); // 가져올 번호
                String sname = rs.getString("sname");
                String sproduct2 = rs.getString("sproduct");
                String scontent = rs.getString("scontent");
                String spass = rs.getString("spass");
                int sprice = rs.getInt("sprice");
                String sday = rs.getString("sday");
                UsedDto usedDto = new UsedDto(num, sname, sproduct2, scontent, spass, sprice ,sday);
                usedDtos.add(usedDto);
            }
        } catch (Exception e) {
            System.out.println(e);
            return usedDtos;
        }
        return usedDtos;
    }
}

