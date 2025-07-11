package 종합.과제5.WaitingController;


import 종합.과제5.model.model_dao.WaitingDao;
import 종합.과제5.model.model_dto.WaitingDto;

public class WaitingController {
    private WaitingController() { }

    private static final WaitingController control = new WaitingController();

    public static WaitingController getInstance() {
        return control;
    }

    // 싱글톤
    private WaitingDao waitingDao = WaitingDao.getInstance();

    public  boolean dtoCount(String phone, int count) {
        WaitingDto waitingDto = new WaitingDto(phone, count); // 받은 매개변수 객체화
        boolean result = waitingDao.dtoCount(waitingDto); // Dto를 Dao에 객체 전달후 boolean 이벤트 활성화?
        return result; // result 반환
    }

    // 조회 메서드
    /* public [자유로운]클래스 */
    public  WaitingDto[] getWaitingList() {
        return waitingDao.getWaitingList();
    }

}