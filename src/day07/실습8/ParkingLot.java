package day07.실습8;

public class ParkingLot {
    int calculateFee( int time) {
        int money = 1000; // 정수 기본요금 천원
        if (time > 30) { // 시간이 30분 보다 크면
            int moneysy = time - 30;
            int moneys = ((moneysy + 9) / 10) * 500; // 30분 으로 잡은 기준 10분당 500원
            money += moneys; // 돈 더해주기
            if (money > 20000){ // money가 2만원보다 크면
                money = 20000; // 2만원 최대같은느낌
            }

        }
        return money;
    }
}
