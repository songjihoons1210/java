package 종합.과제5.model.model_dao;

public class Dao {
    // 1. 멤버변수 : 모두 private 한다.
    private String content;
    private String writer;
    // 2. 생성자 : 기본생성자.풀생성자는 기본! ,ㅊ ㅜ후 추가
    public Dao(){ }
    public Dao(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
    public String getContent() { // 생성 > get/set ter 클릭
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {      // 생성 > toString(); 클릭
        return "model1{" +
                "content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
