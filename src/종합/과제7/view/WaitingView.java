package 종합.과제7.view;

import 종합.과제7.WaitingController.WaitingController;
import 종합.과제7.model.Dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {

    // 싱글톤
    private WaitingView(){ }
    public static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance() {
        return instance;
    }
    // 입력 객체
    private Scanner sc = new Scanner(System.in);

    private WaitingController waitingCon = WaitingController.getInstance();

    public void index(){
        for ( ; ; ){
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("========================================");
            System.out.print("선택 > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                waitingCount();
            }else  if (choice == 2){
                waitingPrint();
            }
        }
    }
    public void waitingCount(){
        System.out.print("휴대전화 : ");
        String phone = sc.next();
        System.out.print("인원수 : ");
        String count = sc.next();
        boolean flag = waitingCon.waitingCount(phone, count);
        if (flag){
            System.out.println("대기 등록 성공");
        }else {
            System.out.println("대기 등록 실패 ");
        }
    }
        // 전체 조회
    public void waitingPrint(){
        System.out.println("대기 등록 현황");
        ArrayList<WaitingDto> result = waitingCon.waitingPrint();
        //for (WaitingDto w : result)
        for (int i = 0; i<result.size();i++) {
            WaitingDto dto = result.get(i);
            System.out.println("대기 순서 "+(i+1)+"\t | 휴대전화 : "+dto.getPhone() + "\t | 인원수 : "+dto.getCount() );
            //System.out.println("휴대전화 : "+w.getPhone() + "\t | 인원수 : "+w.getCount() );
            System.out.println("--------------");
        }

    }
}
