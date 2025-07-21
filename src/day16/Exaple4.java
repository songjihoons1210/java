package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Exaple4 {
    public static void main(String[] args) {

        // 예제1 : 키보드로 부터 입력받은 텍스트 저장
        // (1) 키보드로부터 아무거나 입력받기
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print(" txt : ");
            String str = sc.next();
            // (2) 파일의 경로 지정
            String path = "./src/day16/test2.txt"; // 임의 파일명 과 경로 지정
            // (3) 파일 쓰기 객체
            FileOutputStream fout = new FileOutputStream(path);
            // (4) 입력받은 문자열을 바이트 변환
            byte[] outBytes = str.getBytes();
            // (5) 변환된 바이트를 내보내기
            fout.write(outBytes);

//            file.delete();        // 지정한 경로에 파일 삭제 함수
//            file.createNewFile(); // 지정한 경로에 파일 생성 함수

            // 예제2 : 파일로 부터 텍스트를 호출
            // (1) File 클래스 : 지정한 파일의 정보를 제공하는 객체 , new File( 파일경로 );
            File file = new File(path);
            System.out.println(file.isFile());     // .isFile() : 파일 존재 여부 반환 trye/false
            System.out.println(file.getName());   // .getName() : 파일 이름 반환
            System.out.println(file.length());    // .length() : 파일 용량(바이트) 반환
            System.out.println(file.exists());    // .exists() : 파일 존재 여부 반환 true/false
                                                  // .delete();  : 지정한 경로에 파일 삭제 함수
                                                  // .createNewFile(); : 지정한 경로에 파일 생성 함수
            if (file.exists()) { // (2) 파일이 존재할 경우
                FileInputStream fin = new FileInputStream(path); // (3) 파일 입력 객체 생성
                byte[] inBytes = new byte[(int) file.length()]; // (4) 읽어온 바이트들을 저장할 바이트 배열 선언
                // file.length() : 파일 용량(long) , new 타입[ 배열길이 ] : 배열길이는 int타입만 가능
                fin.read(inBytes); // (5) 파일내 바이트 읽어오기
                String inStr = new String( inBytes ); // (6) 읽어온 바이트배열을 문자열로 변환
                System.out.println(inStr);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
