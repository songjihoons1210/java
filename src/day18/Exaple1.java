package day18;

import 도서대출패키징.model.dto.UserDto;

public class Exaple1 {
    public static void main(String[] args) {

        // (1) DB연동 확인
        UserDao userDao = UserDao.getInstance();

        // (2) 연동된 db에 메소드 실행
        userDao.userInsert();

        // (3) 연동한 db에 매개볏누 메소드 실행
        userDao.userInsert2("강호동" , 30 );
        userDao.userInsert2("유재석" , 40);

        // (4) 연동된 DB에 select 메소드 실행
        userDao.userSelect();


    }
}
