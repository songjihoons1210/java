package day08;

public class MenuItem {
    String name;
    int price;
    boolean isSignature;

    MenuItem(String name, int price, boolean isSignature) {
        this.name = name;  // this 초기화 값? 맞나
        this.price = price;
        //this.isSignature = isSignature; // ~에 따라 t / f
        this.isSignature = "김치찌개".equals(name);
        // name에서 "김치찌개" 라는 메뉴를 입력 하였을때 "김치찌개"가 나오면 true 아니면 false
    }
}
