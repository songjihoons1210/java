package day08;

public class Goods {

    String name = "";
    int price = 0;

    Goods() {
        name = "미정";
        price = 0;
    }

    Goods(String name, int price) { // 오버로딩2?
        this.name = name;
        this.price = price;
    }

}
