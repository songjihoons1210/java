package 종합.심화과제1;

import java.util.Scanner;

public class BankService {
    public static void main(String[] args) {
    /*
        // 객체 만
        Scanner sc = new Scanner(System.in);
        //
        BankController BS = new BankController();

        for (; ; ) { //무한
            // 출
            System.out.println("============== KB Bank  ==============");
            System.out.println("1.계좌등록 | 2.입금 | 3.출금 | 4.잔고");
            System.out.println("======================================");
            System.out.println(" 선택 > ");
            // 정수를 받아 선택
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println(" --- 계좌 등록 --- ");
                System.out.print("계좌번호 : ");
                String bankaccount = sc.next();
                System.out.print("비밀번호 : ");
                int password = sc.nextInt();
                Account Ao = new Account();
                Ao.bankaccount = bankaccount;
                Ao.password = password;
                boolean asd = BS.dodo(bankaccount, password, 0); // 저장해야하는데 계좌 , 비밀번호 , 0<< 계좌만 개설하는데 0만쓰면 된다고 하여 씀 gpt
                if (asd) { // 참일 경우
                    System.out.println("계좌등록이 완료되었습니다.");
                }
            } else if (choice == 2) {
                System.out.println(" --- 입금 --- ");
                System.out.print("계좌번호 : ");
                String bankaccount = sc.next();
                System.out.print("비밀번호 : ");
                int password = sc.nextInt();
                System.out.print("입금액 : ");
                int deposit = sc.nextInt();
                Account Ao = new Account();
                Ao.bankaccount = bankaccount;
                Ao.password = password;
                Ao.deposit += deposit;
                boolean asd = BS.dodo(bankaccount, password, deposit);
                if (asd) {
                    System.out.println("[안내] 입금이 완료되었습니다.. ");

                }
            } else if (choice == 4) {
                System.out.println("--- 잔고 확인 ---");
                Account[] accounts = BS.doget();  // 이따 아래 반복문 돌려야 저장 되어 출력 가능하니까 잘하자
                for (int index = 0; index <= accounts.length - 1; index++) {
                    System.out.print("계좌번호 : ");
                    String bankaccount = sc.next();
                    System.out.print("비밀번호 : ");
                    int password = sc.nextInt();
                    System.out.println("[잔고]");
                }
            }
            } // f end
    */
       } // m end


    } // c end

