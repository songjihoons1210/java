package day08;

public class BankAccount {
    String accountNumber;
    String ownerName;
    int balance;

    BankAccount(String accountNumber, String ownerName, int balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    int deposit(int amount) {
        this.balance = balance + amount;
        System.out.printf("계좌 %s , 이름 %s , 입금액 %d", accountNumber, ownerName, balance);
        return balance;
    }
    int withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount; // -= 써도됨 balance -= amount
            System.out.printf("계좌 %s , 이름 %s , 입금액 %d", accountNumber, ownerName, balance);
        }else {
            System.out.println("잔액 없음");
            return balance;
        }
        return balance;
    }
}
