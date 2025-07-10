package 종합.과제4;

public class Waiting {
    private String phone, count;
    ; // 휴대 / 인원

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

    public Waiting(String phone, String count) {
        this.phone = phone;
        this.count = count;

    }

    @Override // 오버로드
    public String toString() { // 마우스 우클릭 생성 toString()
        return "Waiting{" +
                "phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
