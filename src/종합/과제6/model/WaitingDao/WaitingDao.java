package 종합.과제6.model.WaitingDao;

import 종합.과제6.model.WaitingDto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao() {
    }

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance;
    }

    private ArrayList<WaitingDto> WD = new ArrayList<>();


    public boolean addWaiting(String phone, int count) {
        boolean result = false;
        WaitingDto waitingDto = new WaitingDto(phone, count);
        WD.add(waitingDto);
        result = true;
        return true;
    }

    public ArrayList<WaitingDto> getWaiting() {
        return WD;
    }
}
