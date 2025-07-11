package day08;

import java.util.Scanner;

public class 실습9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1
        Book bk = new Book("자바","용권이", 30000);
        Book bk2 = new Book("자바2","용권이2", 320000);
        System.out.printf("%s-%s-%s" , bk.title, bk.author, bk.price );
        System.out.println(); // 한칸
        System.out.printf("%s-%s-%s" , bk2.title, bk2.author, bk2.price );
        System.out.println();
        //2
        Pet pt = new Pet("초코코" , "들들푸" , 5);
        Pet pt2 = new Pet("코코" , "들푸" , 555);
        System.out.println("이름 :"+pt.name+"\n종 :"+pt.species+"\n살"+pt.age);
        System.out.println();
        System.out.println("이름 :"+pt2.name+"\t종 :"+pt2.species+"\t살"+pt2.age);

        //3
        Rectangle r = new Rectangle(10,5 , 0);
        System.out.println("합은 넓 높 : "+ r.length);
        //4
        BankAccount ba = new BankAccount("1-2-3", "재석", 0);
        for( ;; ) {
            System.out.print("입금액 : ");
            int amount = sc.nextInt();
            ba.deposit(amount);
            System.out.println();
            System.out.print("출금액 : ");
            int amount2 = sc.nextInt();
            ba.withdraw(amount2);
            System.out.println();
            System.out.println("계속 할거임? y/n");
            String yn = sc.next();
            if (yn.equals("n")) {
                break;
            }

        }
        //5

        Goods gs = new Goods("코올라" ,2000);
        System.out.println(gs.name +"\n"+ gs.price);
        Goods gs2 = new Goods("코오올라" , 20003);
        System.out.println("이름 :"+gs2.name +"\n가격 :"+gs2.price);

        //6

        for (; ; ) { // 무한
            System.out.print("dd 입력 : ");
            String dd = sc.next();
            boolean isLogin = "guest".equals(dd);
            Member mb = new Member(dd, isLogin);
            if (mb.isLogin) {
                System.out.println("종료한다 ");
                break;
            } else {
                System.out.println("계쏙함");
            }

        }
        System.out.print("id(guest) : ");
        String idd = sc.nextLine();
        Member mb = new  Member(idd,true);
        // [gpt]참고 클래스 위치 바꾸면
        // String에 사용 가능한것을 알게 되어 사용 했습니다.
        System.out.println("id 입력 "+mb.id);
        System.out.println("여부 "+mb.isLogin); // t / f 여부
        System.out.println("----------");
         */
        Member mb = new Member();
        System.out.println("id :"+mb.id);
        System.out.println("id :"+mb.isLogin);

          // 관례적/주문
                // -> 서로다른 타입 혹은 서로 다른 의므를 같는 자료 또는 존재하지 않는 타입은 클래스
                    // 예]


        //7

        Television tv = new Television(7 , 20);
        System.out.println("채널 :"+tv.channel);
        System.out.println("볼륨 :"+tv.volume);
        System.out.println("----------");

        //8

        Player player1 = new Player("손흥민",90,85);
        Player player2 = new Player("이강인",85,92);
        System.out.println("이름 :"+player1.name+"\tpower :"+player1.power+"\t speed :"+player1.speed); // 이름 '손흥민' 파워 '90' 스피드 '85'
        System.out.println("이름 :"+player2.name+"\tpower :"+player2.power+"\t speed :"+player2.speed);
        System.out.println("----------");

        //9

        System.out.print("메뉴 입력 : ");
        String na =  sc.nextLine();
        boolean asd = "김치찌개".equals(na);
        MenuItem mi = new MenuItem("김치찌개", 8000 , asd);
        if (asd){
            System.out.printf("[대표메뉴] %s , 가격 : %d",mi.name ,mi.price);
        }else {
            System.out.println("잘못입력하셨습니다.");
        }
        System.out.println("-----------");

        //10
        System.out.print("이름 : ");
        String name =  sc.next();// 이름 문자열
        System.out.print("나이 : ");
        int age =  sc.nextInt(); // 나이 정수
        System.out.print("MBTI : ");
        String mbti =  sc.next(); // 문자열 mbti
        UserProfile up = new UserProfile(name,age,mbti); // 받은값을 호출
        System.out.printf("이름 : %s ,\t 나이 : %d , \t MBTI : %s", up.name, up.age, up.mbti);
    }

}

        /*
[문제 1] Book 클래스를 만드세요. (title, author, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Book 클래스에 title, author, price를 매개변수로 받아 멤버 변수를 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("이것이 자바다", "신용권", 30000) 정보와 ("자바의 정석", "남궁성", 28000) 정보를 가진 Book 객체 2개를 생성하고, 각 객체의 정보를 출력하세요.

[문제 2] Pet 클래스를 만드세요. (name, species, age 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Pet 클래스에 name, species, age를 매개변수로 받아 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("초코", "푸들", 3) 정보와 ("나비", "코리안숏헤어", 5) 정보를 가진 Pet 객체 2개를 생성하고, 각 객체의 프로필을 출력하세요.

[문제 3] Rectangle 클래스를 만드세요. (width, height 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. width와 height를 매개변수로 받아 초기화하는 생성자를 만드세요.
2. 사각형의 넓이(width * height)를 계산하여 반환하는 getArea() 메소드를 만드세요.
3. main 함수에서 (10, 5) 값을 가진 Rectangle 객체를 생성하고, getArea() 메소드를 호출하여 "사각형의 넓이: [넓이]"를 출력하세요.

[문제 4] BankAccount 클래스를 만드세요. (accountNumber, ownerName, balance 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. 입금(deposit)과 출금(withdraw) 기능을 하는 메소드를 각각 만드세요.
3. main 함수에서 ("111-222-3333", "유재석", 10000) 정보로 객체를 생성한 뒤, 5000원을 입금하고 3000원을 출금한 후의 최종 잔액을 출력하세요.

[문제 5] Goods 클래스를 만드세요. (name, price 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Goods 클래스에 생성자를 두 개 만드세요(오버로딩).
2. 기본 생성자: name은 "미정", price는 0으로 초기화
3. 매개변수가 있는 생성자: name과 price를 매개변수로 받아 초기화
4. main 함수에서 기본 생성자로 객체 하나, 매개변수가 있는 생성자로 ("콜라", 2000) 정보를 가진 객체 하나를 각각 생성하고, 두 객체의 정보를 모두 출력하세요.

[문제 6] Member 클래스를 만드세요. (id, isLogin 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. Member 클래스에 기본 생성자를 만들고, 이 생성자 안에서 id는 "guest", isLogin은 false로 초기화되도록 하세요.
2. main 함수에서 new Member()로 객체를 생성하고, 초기화된 id와 isLogin 값을 출력하여 확인하세요.

[문제 7] Television 클래스를 만드세요. (channel, volume 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. channel과 volume을 매개변수로 받아 초기화하는 생성자를 만드세요.
2. main 함수에서 (채널 7, 볼륨 20) 상태를 가진 Television 객체를 생성하고, 해당 객체의 정보를 출력하세요.

[문제 8] Player 클래스를 만드세요. (name, power, speed 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여, ("손흥민", 90, 95) 정보를 가진 객체와 ("이강인", 85, 92) 정보를 가진 객체를 생성하세요.
3. 두 객체의 정보를 각각 출력하여 확인하세요.

[문제 9] MenuItem 클래스를 만드세요. (name, price, isSignature 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. main 함수에서 이 생성자를 사용하여 "김치찌개", 8000, true 정보를 가진 객체를 생성하고, isSignature가 true인지 확인한 후 "[대표메뉴] 김치찌개 : 8000원" 형식으로 출력하세요.

[문제 10] UserProfile 클래스를 만드세요. (name, age, mbti 멤버 변수) *멤버변수의 타입은 적절하게 선택하시오.
1. 세 멤버 변수를 모두 초기화하는 생성자를 만드세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 입력받으세요.
3. 입력받은 값들을 사용하여 UserProfile 객체를 생성하고, 저장된 모든 정보를 출력하세요.

     */
