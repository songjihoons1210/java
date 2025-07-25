package 종합.과제9.usedController;


import 종합.과제9.model.dao.UsedDao;
import 종합.과제9.model.dto.UsedDto;

import java.util.ArrayList;

public class UsedController {
    // 싱글톤
    private UsedController() { }
    private static final UsedController instance = new UsedController();
    public static UsedController getInstance() {
        return instance;
    }

    // 싱글톤 가져오기 Dao
    UsedDao usedDao = UsedDao.getInstance();
    // 등록
    public boolean usedAdd(String sname , String sproduct , String scontent, String spass ,  int sprice , String sday) {
        UsedDto dto = new UsedDto( 0, sname, sproduct, scontent, spass, sprice , sday);
        boolean result = usedDao.usedAdd(dto);
        return result;
    }
    // 조회
    public ArrayList<UsedDto> usedPrint(){
        ArrayList<UsedDto> usedDtos = UsedDao.usedPrint();
        return usedDtos;
    }

    // 수정
    public boolean usedUpdate(int num, String spass , String scontent , String sproduct , int sprice){
        boolean result = usedDao.usedUpdate(num,spass,scontent,sproduct,sprice);
        return result;
    }


    // 삭제
    public boolean usedDelete(int num , String spass) {
        // 삭제할 번호 찾고
        boolean result = usedDao.usedDelete(num,spass);
        return result;
        // 값을 view 보내주기
    }

    // 익명 문의

    // 물품 조회 상세
    public ArrayList<UsedDto> usedredd(String sproduct){
        return usedDao.usedredd(sproduct);
    }

    // 순위
    public ArrayList<UsedDto> usedPrints(sname) {
        return usedDao.usedPrints();
    }

    public ArrayList<UsedDto> userdproduct(String sproduct) {
        return usedDao.userdproduct(sproduct);
    }

    }
