package day10;

// 1. 싱글톤 만들기
class Controller{
    // 1. 기본생성자를 private 한다
    private Controller() {}
    // 2. private static final 이용한 인스턴스를 하나 만든다.<싱글톤>
    private static final Controller controller = new Controller();
    // 3. public static 이용한 인스턴스 getter 메소드 만든다. <싱글톤 반환>
    public static Controller getInstance( ) {
        return controller;
    }
}

public class Exaple1 {
    public static void main(String[] args) {
        // 4. 싱글톤 불러오기
        Controller.getInstance(); // vs  new Controller(); 가틈

    }
}
