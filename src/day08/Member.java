package day08;

public class Member {
    String id;
    boolean isLogin;

    Member(){
        id = "guest";
        isLogin = false; // guest 일때 fa
    }
    Member(String id , boolean isLogin) {
        this.id = id;
        this.isLogin = isLogin; // 황에 따라 t / f
        /*
    Member(String id , boolean isLogin){            // 내용 추가했습니다 guset 입력 할시
        this.id = id;
        this.isLogin = "guest".equals(id); // guest 일때 t/ 아님 f

         */
    }
}
