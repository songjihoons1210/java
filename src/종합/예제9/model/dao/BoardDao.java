package 종합.예제9.model.dao;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import 종합.예제9.model.dto.BoardDto;

import java.awt.font.FontRenderContext;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    // (*)싱글톤 : 지정한 클래스내 하나의 객체를 미리 만들고 프로그램내 하나의 객체만 존재
    private BoardDao() { // 싱글톤 생성시 csv
        openCSV(); // csv 불러오기
    }

    private static final BoardDao instance = new BoardDao();

    public static BoardDao getInstance() {
        return instance;
    }

    // (*) DB 대신할 리스트 선언 < 추후에 사용하지 않음 >
    ArrayList<BoardDto> boardDB = new ArrayList<>();

    // (1) 등록
    public boolean boardWrite(BoardDto boardDto) {
        // boolean : 반환 타입 으로 성공시 true 실패시 false
        // boardWrite : 임의 함수명
        // BoardDto boarddto : 메개변수
        boardDB.add(boardDto); // 1. 리스트(db)에 DTO를 저장한다.

        saveCSV(); // * CSV 저장

        return true; // 2. 성공시 true 반환 . true 의 타입은 boolean 타입이다.
    }

    // (2) 전체 조회
    public ArrayList<BoardDto> boardPrint() {
        // ArrayList<BoardDto> : 반환타입 으로 모든 dto를 반환한다.
        return boardDB; // boardDB 변수의 타입은 ArrayList<BoardDto> 이다
    }

    // (*) CSV 파일 경로 지정 한다,
    private String path = "src/종합/예제9/data.csv";

    // ------------------------------- 1. CSV 파일 연동 함수
    public void openCSV() {
        File file = new File(path); // (1) 파일 객체 생성한다. .exists() 지정한 경로에 파일 존재여부 반환함수
        if (file.exists()) { // (2) 파일 존재 하면 정보 불러오기
            loadCSV();

        } else { // (2) 아니면 파일 생성 .createNewFile(); 지정한 경로에 파일 생성 함수
            try {
                file.createNewFile();
            } // 파일 객체 생성 ,예외처리 한다.
            catch (IOException e) {
                System.out.println(e);
            }
        }
        // ------------------------------- 2. CSV 입력(호출) 함수
    }

    public void loadCSV() {
        try {
            FileReader fileReader = new FileReader(path); // (1) FileReader 이동한 읽기모드 객체 생성
            CSVReader csvReader = new CSVReader(fileReader); // (2) CSVReader 에 fileReader 대입하여 CSV객체 생성
            List<String[]> inDate = csvReader.readAll(); // (3) .readAll() 함수로 모든 CSV 정보를 읽어온다.
            for (String[] row : inDate) { // 향상된 for 문
                String content = row[0]; // 첫번째 열
                String writer = row[1]; // 두번째 열
                BoardDto boardDto = new BoardDto(content, writer); // (5) 각 열들을 하나의 dto로 생성
                boardDB.add(boardDto);// (6) 생성된 dto를 리스트에 저장
            }
            csvReader.close(); // (7) csvReader 안전하게 달기( 메모리 누수 방지 ) : 파일(용량크다)객체는 자동 초기화 ,
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // ------------------------------- 3. CSV 출력(지침) 함수
    public void saveCSV() {
        try {
            // (1) FileWriter 파일 쓰기로드 객체 생성
            FileWriter fileWriter = new FileWriter(path);
            // (2) CSVWriter 에 filewriter 객체를 대입할때 생성
            CSVWriter csvWriter = new CSVWriter(fileWriter);
            // (3) 빈 리스트 생성
            List<String[]> outData = new ArrayList<>();
            // ArrayList(구현체) , List(인터페이스)
            // (4) 현재 모든 정보(boardDB) 를 outDate에 담아준다.
            for (BoardDto boardDto : boardDB) {
                // (9) dto 하나씩 내용과학상자를 행으로 구성
                String[] row = {boardDto.getContent(),
                        boardDto.getWriter()};
                // (6) outData에 적장한다..
                outData.add(row);
            }
            // (7) 최종적으로 outDate를 csv에 내보낸다.
            csvWriter.writeAll(outData);
            csvWriter.close(); // (8) 안전하게 객체 닫기
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}