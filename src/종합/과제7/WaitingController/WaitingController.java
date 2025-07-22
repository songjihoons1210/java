package 종합.과제7.WaitingController;

import 종합.과제7.model.Dao.WaitingDao;
import 종합.과제7.model.Dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController() { }
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance() {
        return instance;
    }

    private WaitingDao waitingDao = WaitingDao.getInstance();

    public boolean waitingCount(String phone , String count) {
        WaitingDto waitingDto = new WaitingDto( phone , count );
        boolean result = waitingDao.waitingCount(waitingDto);
        return result;
    }
    public ArrayList<WaitingDto> waitingPrint() {
        // dao 에게 dto 모든 정보 받기
        ArrayList<WaitingDto> result = waitingDao.waitingPrint();
        // result 리턴 반환한다.
        return result;
    }
}
