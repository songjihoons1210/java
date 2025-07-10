package day09;

public class Exaple3 {
    public static void main(String[] args) {

        int[] intArray = { 10 , 20 ,30 };
        // 자료1개(배열) 안에 자료3개(int) [ 10 ,20 ,30 ]
        // intArray = 자료1개(배열)
        int int1 = 10; // 배열내 \n번째 값을 새로운 변수에 대입
        System.out.println(int1 ); // 10
        //
        int1 = 100; // int1 =10 --> int1 =100
        System.out.println(intArray[0] ); //10
        intArray[0] = 100;
        System.out.println(intArray[0] ); //100
    }
}
