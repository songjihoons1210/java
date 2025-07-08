package day07.실습8;

public class Checker {
    boolean isEven = false;

    int dda(int aa, int bb) {
        int dda2 = aa + bb;
        if (dda2 % 2 ==0) {
            isEven = true;
            System.out.println("짝수임 "+isEven);
            return dda2;
        } else {
            isEven = false;
            System.out.println("홀수임 "+isEven);
            return 0 ;
        }
    }
}
