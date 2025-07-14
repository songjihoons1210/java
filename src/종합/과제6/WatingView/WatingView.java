package 종합.과제6.WatingView;

import 종합.과제6.WaitingController.WaitingController;
import 종합.과제6.model.WaitingDao.WaitingDao;
import 종합.과제6.model.WaitingDto.WaitingDto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class WatingView {
    private WatingView() {
    }

    private static final WatingView instance = new WatingView();

    public static WatingView getInstance() {
        return instance;
    }

    private WaitingController WC = WaitingController.getInstance();
    Scanner sc = new Scanner(System.in);

    public void index() {
        for (; ; ) {
            System.out.println("== 맛집 ==");
            System.out.println("1. 대기등록 | 2. 대기현황 ");
            System.out.println("==========");
            System.out.println("선택 > ");
            int choice = sc.nextInt();
            if (choice == 1) {
                addWaiting();
            } else {
                getWaitingDao();

            }
        }

    }

    public void addWaiting() {
        System.out.println("폰 : ");
        String phone = sc.next();
        System.out.println("인원 : ");
        int count = sc.nextInt();
        boolean result = WC.addWaiting(phone, count);
        if (result == true) {
            System.out.println("대기 등록 완료");
        } else {
            System.out.println("대기 등록 실패");

        }
    }
    public void getWaitingDao() {
        ArrayList<WaitingDto> result = WC.getWaitingDao();
        for (int j = 0; j < result.size(); j++) {
            WaitingDto dto = result.get(j);
            System.out.println("폰 :"+dto.getPhone());
            System.out.println("인원 :"+dto.getCount());
        }
    }
}
