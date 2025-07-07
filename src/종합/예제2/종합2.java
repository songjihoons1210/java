package 종합.예제2;

import java.util.Scanner;

public class 종합2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] contents = new String[100]; // 문자열 contents 안에 new String[100]개
        String[] writers = new String[100];

        for (; ; ) {
            System.out.println("============= My Community =============");
            System.out.println(" 1.게시물쓰기 | 2.게시물출력");
            System.out.println("========================================");
            System.out.println("선택  > ");
            int seea = scan.nextInt();
            if (seea == 1) {
                System.out.print("내용 : ");
                String content = scan.next();
                System.out.print("작성자 : ");
                String writer = scan.next();
                boolean check = false; // false 저장실패 , true 저장성공
                for (int i = 0; i <= contents.length - 1; i++) {
                    if (contents[i] == null) { // 첫 contents[i] 100반 돌리는데 그 100번안에 빈공간이 있을때
                        contents[i] = content; // 있으면 내용 content 내용 저장
                        writers[i] = writer;    // 있으면 내용 writer 내용 저장
                        check = true;       // 위 내용이 참이면 저장 성공
                        break; // 저장성공하면 반복문 종료
                    }
                }
                if (check) { System.out.println("[안내] 글쓰기 성공 "); //참이면 성공
                } else { // 참이 아니다 경고
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
            }else if (seea == 2) { // 2번 선택했을 경우
                    System.out.println("============= 게시물 목록 =============");
                    for (int i = 0; i <= contents.length - 1; i++) {
                        if (contents[i] != null) { // contents[i] 부정! null
                            System.out.println("작성자 : " + writers[i]);
                            System.out.println("작성자 : " + contents[i]);
                            System.out.println("```````````````````````````````````");
                        }
                    }
                }
            }
        }
    }