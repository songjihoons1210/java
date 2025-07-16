package 과제5연습.ProductView;

import 과제5연습.ProductController.ProductController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    private ProductView() { }
    public static final  ProductView productView = new ProductView();
    public static ProductView getProductView() {
        return productView;
    }
    // 싱글톤 가져오기
    private ProductController PC = ProductController.getInstance();

    private Scanner sc = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            System.out.println("\"== 제품 ==\"");
            System.out.println("\"== 제품등록[1] == | == 제품등록확인[2] == \"");
            System.out.println("-------------");
            System.out.println("선택(1/2) > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                addProduct();
            }else if (choice == 2) {
                getProductDtos();

            }
        }
    }
    public void addProduct() {
        System.out.print("title : ");
        String title = sc.next();
        System.out.println("제품명 : ");
        String ProductName = sc.next();
        System.out.print("가격 :");
        int price = sc.nextInt();
        boolean result = PC.addProduct(title, ProductName , price);
        if (true) {
            System.out.println("[제품] 등록이 완료 되었습니다.");
        }else {
            System.out.println("[제품] 등록이 실패 하였습니다.");
        }
    }
    public void getProductDtos() {

    }
}
