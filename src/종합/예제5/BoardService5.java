package 종합.예제5;

import java.util.Scanner;

public class BoardService5 {
    public static void main(String[] args) {

        BoardController bs = new BoardController();
        Scanner sc = new Scanner(System.in);

        for (; ; ) {// (1) 무한루프 : 프로그램 계속적으로 실행하기 위해서
            System.out.println("============= My Community =============");// (2) 출력
            System.out.println("  1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.print("선택 > ");
            Scanner scan = new Scanner(System.in); // (3) 입력
            int choose = scan.nextInt();
            if (choose == 1) { // (4) 입력 에 따른 화면 출력
                System.out.print("내용 : ");
                String content = scan.next();
                System.out.print("작성자 : ");
                String writer = scan.next();
                // (6) * doPost 메소드를 호출해서 등록 처리후 결과를 받는다.
                // dodo메소드가 실행후 결과를 result 에 저장.
                boolean result = bs.dodo(content, writer); // 입력받은 두 값을 인수로 전달
                if (result) { // dodo에서 true 반환이면
                    System.out.println("[안내] 글쓰기 성공");
                } else { // dodo에서 false 반환이면
                    System.out.println("[경고] 글쓰기 실패");
                }
            } else if (choose == 2) {
                System.out.println("============= 게시물 목록 =============");
                Board[] boards = bs.doGet();
                for (int i = 0; i < boards.length; i++) {
                    Board board = boards[i];
                    if (board != null) {
                        System.out.println("작성자 : " +board.writer);
                        System.out.println("내용 : " + board.content);
                        System.out.println("------------------------------------");
                    }
                }

            }
        }
    } // m end
} // c end


