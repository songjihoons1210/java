package 종합.과제9.model.dto;

public class UsedDto {
    private int num;    // 번호
    private String sname;   // 이름
    private String sproduct;    // 물품명
    private String scontent;    // 내용
    private String spass;   // 비밀번호
    private int sprice; // 물품 가격
    private String stata; // 판매 중/완
    private String sday;

    public UsedDto() { }
    public UsedDto(int num, String sname, String sproduct, String scontent, String spass, int sprice , String sday) {
        this.num = num;
        this.sname = sname;
        this.sproduct = sproduct;
        this.scontent = scontent;
        this.spass = spass;
        this.sprice = sprice;
        this.stata = "판매중";
        this.sday = sday;
    }

    public String getSday() {
        return sday;
    }

    public void setSday(String sday) {
        this.sday = sday;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSproduct() {
        return sproduct;
    }

    public void setSproduct(String sproduct) {
        this.sproduct = sproduct;
    }

    public String getScontent() {
        return scontent;
    }

    public void setScontent(String scontent) {
        this.scontent = scontent;
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }

    public int getSprice() {
        return sprice;
    }

    public void setSprice(int sprice) {
        this.sprice = sprice;
    }

    public String getStata() {
        return stata;
    }

    public void setStata(String stata) {
        this.stata = stata;
    }

    @Override
    public String toString() {
        return "UsedDto{" +
                "num=" + num +
                ", sname='" + sname + '\'' +
                ", sproduct='" + sproduct + '\'' +
                ", scontent='" + scontent + '\'' +
                ", spass='" + spass + '\'' +
                ", sprice=" + sprice +
                ", stata='" + stata + '\'' +
                ", sday='" + sday + '\'' +
                '}';
    }
}
