package 종합.과제8.model.dto;

public class WaitingDto {
    private int num; // 대기번호
    private String phone; // 연락처
    private String count; // 인원수

    public WaitingDto() { }
    public WaitingDto(int num, String phone, String count) {
        this.num = num;
        this.phone = phone;
        this.count = count;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "WaitingDto{" +
                "num=" + num +
                ", phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
