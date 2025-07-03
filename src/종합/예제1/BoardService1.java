// step :1
// step :2
// step :3
// step :4


package 종합.예제1; // 패키지명

import java.util.Scanner;

public class BoardService1 { // class 시작
    public static void main(String[] args) { // main 시작
        Scanner scan = new Scanner(System.in); // 입력받기
        // (5) for밖에 선언 : 메모리 설계
        String content1 = null;
        String content2 = null;
        String content3 = null;
        String writer1 = null;
        String writer2 = null;
        String writer3 = null;
        for (; ; ) { // 무한루프 시작
            System.out.println("========== ㅎㅇㅎㅇ ==========");
            System.out.println(" 1. 게시물쓰기 | 2. 게시물출력");
            System.out.println("========== ㅎㅇㅎㅇ ==========");
            System.out.print("선택 : ");
            int check = scan.nextInt();
            if (check == 1) { // check가 1일때 맞는 출력 만들기

                System.out.print("내용 : ");
                String content = scan.next();
                System.out.print("작성자 : ");
                String writer = scan.next();
                if (content1 == null) { // 1이라는 게시물이 비어있는지 확인
                    content1 = content;
                    writer1 = writer; // 입력값 대입}
                    System.out.println("[글쓰기] 성공 ");
                } else if (content2 == null) { // 게시물2 이 비어있는지 확인
                    content2 = content;
                    writer2 = writer;
                    System.out.println("글쓰기 성공");
                } else if (content3 == null) { // 게시물3 이 비어있는지 확인
                    content3 = content;
                    writer3 = writer;
                    System.out.println("글쓰기 성공");
                } else { // 그외 ,비어있는 게시물 못찾음..
                    System.out.println("[경고] 게시물 등록 공간 부족");
                }

            } else if (check == 2) { // check가 1이 아니라 2일때 참 출력
                System.out.println("========== 게시물 목록 ==========");
                if (content1 != null) {
                    System.out.println("작성자 : " + writer1);
                    System.out.println(" 내용 : " + content1);
                    System.out.println("================================");
                }
                if (content2 != null) {
                    System.out.println("작성자 : " + writer2);
                    System.out.println(" 내용 : " + content2);
                    System.out.println("================================");
                }
                if (content3 != null) {
                    System.out.println("작성자 : " + writer3);
                    System.out.println(" 내용 : " + content3);
                    System.out.println("================================");
                }

            } // e if 종료
        } // for 문 종료
    } // m 종료
} // c 종료
