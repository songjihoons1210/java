package 종합.과제는아님;

public class BankController {

    Account[] accounts = new Account[100];

    boolean dodo(String bankaccount, int password, int deposit) {
        Account account = new Account();
        account.bankaccount = bankaccount;
        account.password = password;
        account.deposit = deposit;

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                return true;
            }

        }
        return false;
    }
    Account[] doget() { return accounts; }
}
