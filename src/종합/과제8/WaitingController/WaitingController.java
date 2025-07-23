package 종합.과제8.WaitingController;

import 종합.과제8.model.dao.WaitingDao;
import 종합.과제8.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController() { }
    private static WaitingController instance =  new WaitingController();
    public static WaitingController getInstance() {
        return instance;
    }
    // 싱글톤 가져오기
    WaitingDao waitingDao = WaitingDao.getInstance();

    // (1) 등록 구현
    public boolean waitingAdd( String phone , String count){
        WaitingDto waitingDto = new WaitingDto( 0 , phone , count);
        boolean result = waitingDao.waitingAdd(waitingDto); // Dao에 Dto 값을 전달하여 Db 에 저장
        return result;  // 전달 후 DB 에 저장한 후 성공 여부 밚놘
    } // Add end



    // (2) 조회 구현
    public ArrayList<WaitingDto> waitingPrint() {
        ArrayList<WaitingDto> result  =  new ArrayList<>();
        // 결과 view 에게 리턴
        return result;
    } // Print end

    // (3) 삭제 구현
    public boolean waitingDelete(int num){
        boolean result = waitingDao.waitingDelete(num);
        return result;
    }

    // (4) 수정 구현


} // class end
