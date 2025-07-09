package day08;

public class Member {
    String id;
    boolean isLogin;

    Member(){
        id = "guest";
        isLogin = false;
    }
/*
    Member(String id , boolean isLogin) {
        this.id = id;
        this.isLogin = isLogin; // 황에 따라 t / f
 */
    Member(String id , boolean isLogin){
        this.id = id;
        this.isLogin = "guest".equals(id); // guest 일때 t/ 아님 f
    }
}
