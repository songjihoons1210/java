package 종합.과제9.usedController;


public class UsedController {
    // 싱글톤
    private UsedController() { }
    private static final UsedController instance = new UsedController();
    public static UsedController getInstance() {
        return instance;
    }

}
