package day03;

import java.util.Scanner;

public class 실습2 {
    public static void main(String[] args) {
/*
//1
    byte a = 10;
    int b = 200;
    long c = a + b;
        System.out.printf("문제 1번 값은 %d ", c );

        System.out.println();

//2
    double z = 3.141592;
    int x = (int) z;
        System.out.printf("문제 2번 출력 값  %d " , x);

        System.out.println();

//3

        Scanner asd = new Scanner( System.in );
        System.out.println("이름 나이 입력 ");
        String gg = asd.nextLine();
        int ggg = asd.nextInt();
        System.out.println( gg +"님의 나이는 : "+ ggg + "세 입니다.");

        System.out.println();

//4
    
        Scanner ddd = new Scanner( System.in );
        int 게시물 = ddd.nextInt();
        ddd.nextLine();
        String 제목 = ddd.nextLine();
        String 내용 = ddd.nextLine();
        //System.out.printf(" [ %d번 게시물 ]" + "\n제목 : "+ 제목 + "\n내용 : "+ 내용  , 게시물 ); <- 이거도 작동 됩니다!.
        System.out.printf(" [ %d번 게시물 ]" + "\n제목 : %s " + "\n내용 : %s "  , 게시물 , 제목 , 내용 );

        System.out.println();
//5
        Scanner ccc = new Scanner( System.in );
        System.out.print("성별을 입력 하세요(남/여) ");
        char ccc2 = ccc.next().charAt(0);
        System.out.println( ccc2 == '남' ? "남자" : "여자");

        System.out.println();

//6
        Scanner bbb = new Scanner( System.in );
        double 사용자 = bbb.nextDouble();
        int 사용자2 = (int) 사용자;
        System.out.printf("당신의 키는 약 %s 이군요." , 사용자2);

*/
//7
        /* 출력 가능
        Scanner bnc = new Scanner( System.in );
        System.out.println("이름 : ");
        String name = bnc.next();
        System.out.println("나이 : ");
        int age3 = bnc.nextInt();
        System.out.println("키 : ");
        double 키 = bnc.nextDouble();
        System.out.println("프로입니까 (네/아니오) : ");
        char pro = bnc.next().charAt(0);
        System.out.println( pro == '네' ? "true" : "false");
        System.out.println("이름 :"+name+"\n나이 :"+age3+"\n키 :"+키+"\n프로여부 :"+pro);


        Scanner bnc = new Scanner( System.in );
        System.out.println("이름 : ");
        String name = bnc.next();
        System.out.println("나이 : ");
        int age3 = bnc.nextInt();
        System.out.println("키 : ");
        double 키 = bnc.nextDouble();
        System.out.println("프로입니까 (네/아니오) : ");
        String proInput = bnc.next();
        boolean pro = proInput.equals("네");
        System.out.println(pro ? "true" : "false");
        System.out.println("이름 :"+name+"\n나이 :"+age3+"살"+"\n키 :"+키+"cm"+"\n프로여부 :"+pro);
*/
    /*





       [실습2] *제출용
                [ 문제] 아래 타입변환, 입력함수 관련 7문제
                [ 제출방법 ] 코드가 작성된 파일이 위치한 깃허브 상세 주소를 제출하시오.

        문제 1: a 와 b 두 변수의 합을 long 타입의 변수에 저장하여 그 결과를 출력하시오.
                선언 코드 :
        byte a = 10;
        int b = 200;
        출력 예시:
        결과: 210

        문제 2: 실수 3.141592를 double 타입 변수에 저장한 뒤, 이 변수를 int 타입으로 강제 변환하여 정수 부분만 출력하시오.
                선언 코드 :
        double z = 3.141592;
        출력 예시:
        원본 double 값: 3.141592
        변환된 int 값: 3

        문제 3: Scanner를 이용하여 사용자의 이름(String)과 나이(int)를 입력받아, "OOO님의 나이는 OO세 입니다." 형식으로 출력하는 코드를 작성하시오.
        입력 예시:
        이름을 입력하세요: 유재석
        나이를 입력하세요: 51
        출력 예시:
        유재석님의 나이는 51세 입니다.

        문제 4: Scanner를 이용해 게시물 번호(int), 제목(String), 내용(String)을 순서대로 입력받아 출력하시오.
        요구 조건: 제목과 내용은 띄어쓰기가 포함될 수 있으므로 nextLine()을 사용하시오.
        입력 예시:
        게시물 번호: 1
        제목: 자바는 재미있어요
        내용: 정말입니다. 다들 동의하시죠?
        출력 예시:
[ 1번 게시물 ]
        제목: 자바는 재미있어요
        내용: 정말입니다. 다들 동의하시죠?

        문제 5: Scanner를 이용해 성별을 한 글자('남' 또는 '여')로 입력받아 char 타입 변수에 저장하고, 입력된 성별을 출력하시오.
        요구 조건: Scanner에는 nextChar() 함수가 없으므로 next().charAt(0)을 활용하시오.
        입력 예시:
        성별을 입력하세요(남/여): 남
        출력 예시:
        입력하신 성별은 '남' 입니다.

                문제 6: Scanner를 이용해 사용자의 키를 double 타입(예: 178.5)으로 입력받은 후, 이 값을 int 타입으로 강제 변환하여 "당신의 키는 약 OOOcm 이군요." 라고 정수 부분만 출력하시오.
        입력 예시:
        키를 입력하세요: 178.5
        출력 예시:
        당신의 키는 약 178cm 이군요.

        문제 7: Scanner를 사용하여 아래 4가지 정보를 순서대로 입력받아 출력하는 코드를 작성하시오.
                이름 (String), 나이 (int), 키 (double), 프로그래머 여부 (boolean)
                입력 예시:
        이름: 김자바
        나이: 25
        키: 165.8
        프로그래머입니까? (true/false): true
        출력 예시:
        --- 자기소개 ---
                이름: 김자바
        나이: 25
        키: 165.8cm
        프로그래머 여부: true

     */
    }
}
