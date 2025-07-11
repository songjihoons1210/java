package 종합.과제5.model.model_dto;



public class Dto {
    private Dto() { }

    private static final Dto instance = new Dto();

    public static Dto getInstance() {
        return instance; // instance 반환
    }

    Dto[] btoDB = new Dto[100]; // Dto 빈배열 100

    public boolean DtoWrite(Dto dto) {
    // 누구나 접근 가능한 Public boolean DtoWrite(Dto dto)안에 이벤트 주려함
        for (int i = 0; i < btoDB.length; i++) { // n번쨰 빈배열 찾는 준비?
            if (btoDB[i] == null) {
        // 위에 만든 btoDB를 사용하여 dtoDB를 n번 반복하여 빈배열 찾기
                btoDB[i] = dto; // 빈배열 찾으면 값 넣기
                return true; // 성공 true 반환
            }
        }
        return false;

    }





}
