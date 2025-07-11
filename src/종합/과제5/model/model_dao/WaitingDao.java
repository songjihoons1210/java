package 종합.과제5.model.model_dao;


import 종합.과제5.model.model_dto.WaitingDto;

public class WaitingDao {
    private WaitingDao() { }

    private static final WaitingDao instance = new WaitingDao();

    public static WaitingDao getInstance() {
        return instance; // instance 반환
    }

    private static final WaitingDto[] waitings = new WaitingDto[100]; // Dto 빈배열 100

    public boolean dtoCount(WaitingDto waitingDto) {
    // 누구나 접근 가능한 Public boolean DtoWrite(Dto dto)안에 이벤트 주려함
        for (int i = 0; i < waitings .length; i++) { // n번쨰 빈배열 찾는 준비?
            if (waitings [i] == null) {
        // 위에 만든 btoDB를 사용하여 dtoDB를 n번 반복하여 빈배열 찾기
                waitings [i] = waitingDto; // 빈배열 찾으면 값 넣기
                return true; // 성공 true 반환
            }
        }
        return false; // 실패시 false; 반환
    }
    public WaitingDto[] getWaitingList() {
        return waitings;
    }

}
