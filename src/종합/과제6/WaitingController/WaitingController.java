package 종합.과제6.WaitingController;

import 종합.과제6.model.WaitingDao.WaitingDao;
import 종합.과제6.model.WaitingDto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController() { }
    private static final WaitingController  instance = new WaitingController();
    public static WaitingController getInstance() {
        return instance;
    }

    private WaitingDao waitingDao = WaitingDao.getInstance();

    public boolean addWaiting(String phone , int count) {
        boolean result = false;
        result = waitingDao.addWaiting(phone ,count);
        return result;

    }

    public ArrayList<WaitingDto> getWaitingDao() {
        return waitingDao.getWaiting();
    }
}
