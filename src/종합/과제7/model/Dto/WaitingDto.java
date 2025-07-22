package 종합.과제7.model.Dto;

public class WaitingDto {
    private String phone;
    private String count;

    public WaitingDto(String phone, String count) {
        this.phone = phone;
        this.count = count;
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
                "phone='" + phone + '\'' +
                ", count='" + count + '\'' +
                '}';
    }
}
