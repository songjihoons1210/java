package 종합.과제는아님;

public class BankController {

    Account[] accounts = new Account[100];

    boolean dodo(String bankaccount, int password, int deposit) {
        Account account = new Account();
        account.bankaccount = bankaccount;
        account.password = password;
        account.deposit = deposit;

        for (int i = 0; i < accounts.length; i++) { // 계좌 지정하려고
            if (accounts[i] == null) { // 계좌의 자리가 남을때
                accounts[i] = account; // 계좌 추가
                return true; // 저장 성공 반환
            }

        }
        return false; // 저장 실패 반환
    }
    Account[] doget() { return accounts;} //모든 계좌를 반환 메소드
}
