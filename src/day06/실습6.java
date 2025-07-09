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
        String[] carNumbers = {"210어7125", "142가7415", "888호8888", "931나8234"}; // String 타입 끼리
        int[] usageMinutes = {65, 30, 140, 420 };    // int 타입 끼리
        // (2) 배열의 순회
        int money = 0; // 원 기본값 0 ;
        for( int index = 0 ; index <= carNumbers.length - 1 ; index++ ){
            System.out.print( carNumbers[index] + "\t");         // 모든 차량 번호 출력 [ /t 띄어쓰기
            // System.out.println( usageMinutes[index] );      // 모든 차량의 사용 시간
            if( usageMinutes[index] <= 30 ){ money = 1000; }   // 만약에 usageMinutes 가 30보다 작을때 돈은 천원;
                    //else 아니면 돈은 useageMinutes를 돌려서 정해둔 30분이 초과할때마다 10분당 500원씩 증가 10*500 이후 기본요금 1000원을 증가
            else{   // 사용요금에 30분 빼고 (10분당) 나누기 10 (나머지 없음 : int/int -> int(몫) ) * 500원 +1000원
                money = ( ( usageMinutes[index] -30 ) / 10 * 500 ) + 1000 ;
            }   // money 돈은 : 돈이 크거나 같으면 ? 2만원 :
            money = money >= 20000 ? 20000 : money; // 만약에 금액이 2만원 초과이면 2만원 , 아니면 금액
            System.out.println( money + "원" );
        } // for end



    } // m end
} // c end
