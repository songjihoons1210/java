package 종합.과제4;

public class WaitingController {
    private static final Waiting[] waitings = new Waiting[100];
    // private 내부 클래스
    // static 자유로운? 객체가 어도 클래스로 사용가능
    // final 고정값


    public static boolean dodo(String phone, String count) {
        Waiting w = new Waiting(phone, count);
        for (int i = 0; i <= waitings.length - 1; i++) {
            if (waitings[i] == null) { // \n번째 null 일떄
                waitings[i] = w; // w 넣기
                return true; // t
            }
        }
        return false; // f
    }
    public static Waiting[] getdo() {   // js push같은 느낌? main으로 가져오는
        return waitings;
    }
}