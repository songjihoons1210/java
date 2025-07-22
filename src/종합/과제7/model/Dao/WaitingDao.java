package 종합.과제7.model.Dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.과제7.model.Dto.WaitingDto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WaitingDao {
    private WaitingDao () {
        식당csv(); // 불러오기
    }
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance() {
        return instance;
    }
    private ArrayList<WaitingDto> waitingDB = new ArrayList<>();

    public boolean waitingCount(WaitingDto waitingDto) {
        waitingDB.add(waitingDto); // db에 dto 저장

        saveCSV(); // csv 저장하기

        return true; // 성공시 반환
    }
    // 조회하기
    public ArrayList<WaitingDto> waitingPrint() {
        return waitingDB; // waitingdb 를 리턴 반환
    }
    // csv 경로로 파일 지정/생성 함
    private String path = "src/종합/과제7/식당.csv";

    public void 식당csv() {
        File file = new File(path);
        if (file.exists()) { // 존재 여부 확인 있으면 불러오기
        }else { // 없을 경우/아니면
            try{
                file.createNewFile(); // 지정된 곳에 새로운 파일 생성 함수
            }catch (IOException e) { // 아직 IOE , Excap 잘 모르겠습니다.
                System.out.println(e);
            }
        }
    }

    public void loadCSV() {
        try {
            FileReader fileReader = new FileReader(path); // FileReader를 이용하여 읽기 모드 객체 생성
            CSVReader csvReader = new CSVReader(fileReader); // csvReader 사용하여 fileReader 읽어오기
            List<String[]> csvDate = csvReader.readAll();
            // csvReader에 있는 정보를 .readAll(); 모두 가져와 String 문자열 배열로 List에 저장
            for (String[] row : csvDate) { // 문자열 배열 : csvDate 정보
                String phone = row[0]; // 0번째 열
                String count = row[1];  // 1번째 열
                WaitingDto waitingDto = new WaitingDto(phone, count); // Dto에 phone , count 열 생성
                waitingDB.add(waitingDto); // DB에 Dto 저장
            }
            csvReader.close(); // 종료 / 닫기 (메모리 방지)
        }catch (IOException e) {
            // loadCSV 만 예외처리 해야 하기 때문에 IOException e
            // 그외 예외 처리 해야할 경우에는 Exception e
            System.out.println(e);
        }
    }

    public void saveCSV() {
        try {
            // 파일쓰기 객체 생성
            FileWriter fileWriter = new FileWriter(path);
            //  fileW 객체 대입하기 위해 생성
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            // 새로운 빈(csvDate)라는 문자열 배열 리스트 생성
            List<String[]> csvDate = new ArrayList<>();
            for (WaitingDto waitingDto : waitingDB) {
                // 문자열 배열 row에 Dto 행에 Phone , Count 데이터 구성/만든다?
                String[] row = {waitingDto.getPhone(),
                                waitingDto.getCount() };
                csvDate.add(row); // csvDate에 row에 담긴 행/데이터를 추가
                }
                // csvWriter(csvDate) 를 writeAll(모두) 내보내기.
                csvWriter.writeAll(csvDate);
                csvWriter.close(); // 안전하기 닫기 ( 누수 방지 )
        }catch (IOException e) { // 예외 처리
            System.out.println(e);
        }
    }
}

