package day06;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class 실습6 { // c start
    public static void main(String[] args) { // m start
    //1
        int[] numbers1 = { 10 , 20 , 30 ,40 ,50 };
        System.out.println(numbers1[1]);
    //2
        String[] season = {"봄","여름","가을"};
        System.out.println(Arrays.toString(season));
    //3
        /*
        String[] fruits = {"사과", "바나나", "포도", "딸기"};
        for (int i = 0; i <= fruits.length -1; i++){
            System.out.println(fruits[i]);
        } // f end
        */
    //4
        int[] scores4 = {85, 92, 78, 65, 95};
        double sum = 0 ;
        for (int scro : scores4){
            sum += scro;
        }
        System.out.println("총 :" + sum);
        System.out.println("평 :" + sum / scores4.length);
    //5
        int[] scores5 = {77, 82, 100, 54, 96};
        for ( int score2 : scores5){
            if (score2 == 100 ){
                System.out.println(" 100점을 찾았습니다.");
                break;
            }
        }
    //6
        String[] bloodTypes = {"A", "B", "O", "AB", "A", "B", "A"};
        int countA = 0; // "a형 혈액형의 개수
        for (String blood : bloodTypes){ //bloodTypes를 blood 에 넣고 돌려서
            if (blood.equals("A") ) {countA +=1;} // blood문자열로 해서 A가 있어 그러면 카운트 1해주고 없으면 카운트x
        }
        System.out.println("a 혈액 : " + countA);
    //7
        int[] numbers7 = {23, 5, 67, 12, 88, 34};
        int number = 0 ;
        for (int numbers : numbers7) {
            if (numbers >= number ){ number = numbers; }
            }
        System.out.println("가장 큰값 :" + number);
    //8
        String[] products = {"볼펜", "노트", "지우개"};
        int[] stock = {10, 5, 20};
        Scanner scan = new Scanner(System.in);
        System.out.print("상품명 : ");
        String 상품 = scan.next();
        int check = 0 ; // 0 : 없는 제품 , 1 : 구매완료 , 2 : 재고부족
        System.out.print("재고 : ");
        int 재고 = scan.nextInt();
        for (int i = 0 ; i <= products.length-1 ; i++) { //반복
            String produt = products[i]; // i를 사용하기 위해
            if (produt.equals("상품")) { // 문자열 바꾸고 검색
                if (stock[i] <= 재고 ) { // 참이면 아래
                    stock[i] -= 재고; // 재고 빠지면 -
                    check = 1; break; //
                }else {
                    check = 2; break;
                }
            }
        }
        if (check == 0) {
            System.out.println(" 없음 ");
        } else if (check==1) {
            System.out.println("구매완료");
        } else if (check==2) {
            System.out.println("재고 부족");
        }

        //9
        String[] movieNames = {"히든페이스", "위키드", "글래디에이터2", "청설"};
        int[] movieRatings = {8, 4, 7, 6};
        for (int i = 0 ; i<= movieNames.length -1 ; i++) {
            String movie = movieNames[i];
            System.out.print(movie);
            for (int star = 1; star <= 10; star++) {
                if (star <= movieRatings[i]) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println();
        }
    //10
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"};
        int[] usageMinutes = {65, 30, 140, 420};
    } // m end
} // c end
