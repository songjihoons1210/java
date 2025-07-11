package 종합.과제5.WaitingView;

import 종합.과제5.WaitingController.WaitingController;
import 종합.과제5.model.model_dto.WaitingDto;

import java.util.Scanner;


public class WaitingView {
    private WaitingView() {
    }


    private static final WaitingView view = new WaitingView();

    public static WaitingView getInstance() {
        return view;
    }

    private Scanner sc = new Scanner(System.in);

    private WaitingController controller = WaitingController.getInstance();


    public void index() {
        for (; ; ) {
            System.out.println("=========== 맛집 대기 시스템 ===========");
            System.out.println(" 1.대기 등록 | 2.대기 현황");
            System.out.println("====================================");
            System.out.print("선택 > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                dtoCount(); // 아래 public void
            } else if (choice == 2) {
                getWaitingList(); //
            }
        }
    }

    public void dtoCount() {
        System.out.print("폰 : ");
        String phone = sc.next();
        System.out.print("인원 : ");
        int count = sc.nextInt();
        boolean result = controller.dtoCount(phone, count);
        // 이벤트 t/r 사용 하여 WaitingController -> dtoCount -> phone(문자열), count(정수) 를 사용 하려 가져온
        if (result) {
            System.out.println("대기 등록 완료");
        }else {
            System.out.println("대기 등록 실패");
        }
    }
    // 조회
    public void getWaitingList() {
        System.out.println("== 대기 목록 ==");
        WaitingDto[] result = controller.getWaitingList();
        for (int i = 0; i < result.length; i++) {
            WaitingDto dto = result[i];
            if (dto != null) {
                System.out.println("번호 :"+(i+1)+ "\t폰 :"+dto.getPhone()+"\t 인원 :"+dto.getCount());
                System.out.println("----------------------------------------------------");
            }
        }
    }
}
