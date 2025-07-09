package day07.실습8;

public class Visualizer {
    String getStars( int x ) {
        String 문자열 = ""; // 매개변수 x는 숫자
        for (int i = 1 ; i<=x ; i++ ){
            문자열 += "★";// 한번씩 1부터 x까지 반복
        } // f end
        return 문자열; // 반환 문자열
    }
}
