package 종합.과제8;

import 종합.과제8.WaitingController.WaitingController;
import 종합.과제8.model.dto.WaitingDto;
import 종합.과제8.view.WaitingView;

import java.util.ArrayList;

public class AppStart {
    public static void main(String[] args) {
//        //
//        boolean result = WaitingController.getInstance().waitingAdd("213", "213");
//        System.out.println(result);
//        //
//        ArrayList<WaitingDto> result2 = WaitingController.getInstance().waitingPrint();
//        System.out.println(result2);
//        //
//        boolean result3 = WaitingController.getInstance().waitingDelete(2);
//        System.out.println(result3);
//        //
//        boolean result4 = WaitingController.getInstance().waitingDelete(3);
//        System.out.println(result4);

        // main
        WaitingView.getInstance().index();


    }
}
