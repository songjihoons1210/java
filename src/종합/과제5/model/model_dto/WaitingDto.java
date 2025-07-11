package 종합.과제5.model.model_dto;

public class WaitingDto {
    // 1. 멤버변수 : 모두 private 한다.
    private String phone; // 폰
    private int count; //  인원
    // 2. 생성자 : 기본생성자.풀생성자는 기본! ,ㅊ ㅜ후 추가


    public WaitingDto() {
    }

    public WaitingDto(String phone, int count) {
        this.phone = phone;
        this.count = count;
    }

    public String getPhone() {  // 생성 > get/set ter
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() { // 생성 - > toString()
        return "WaitingDto{" +
                "phone='" + phone + '\'' +
                ", count=" + count +
                '}';
    }
}
