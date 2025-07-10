package day09.실습10;

public class TicketMachine {
    static int totalTickets = 0;


    public void issueTicket() {
        totalTickets ++; //티켓 ++ 1 해준다
        System.out.println("티켓 1장 발급");
    }
    public static void printTotalTickets() {
        System.out.println("총 티켓 수 : "+totalTickets+"장 입니다.");
    }
}
