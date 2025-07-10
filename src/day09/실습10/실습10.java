package day09.실습10;


public class 실습10 {
    public static void main(String[] args) {

        //1
        Member mb = new Member();
        mb.setId("admin"); // 수정
        System.out.println( mb.getId() );//  호출
        //2
        Score score = new Score();
        score.setScore(65);
        score.setScore(40);
        //3
        BankAccount bankAccount = new BankAccount("123-456");
        System.out.println(bankAccount.getAccountNumber());
        //4
        CircleCalculator calc = new CircleCalculator();
        double asd = calc.printCircleAre(5);
        System.out.println("원의 넓이 :"+asd);
        //5
        TicketMachine machine1 = new TicketMachine();
        TicketMachine machine2 = new TicketMachine();
        TicketMachine machine3 = new TicketMachine();
        machine1.issueTicket();
        machine1.issueTicket();
        machine2.issueTicket();
        TicketMachine.printTotalTickets();
        //6

        System.out.println(GameConfig.MaxLevel);
        System.out.println(GameConfig.MaxHp);
        System.out.println(GameConfig.GAME_TITLE);

    }
}
