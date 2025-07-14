package day11;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class 실습11 {
    public static void main(String[] args) {


        //1
        ArrayList<String> AL = new ArrayList<>(); //
        AL.add("유재석");
        AL.add("강호동");
        AL.add("신동엽");
        System.out.println(AL);

        //2
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("딸기");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("인덱스 :" + i + " : " + fruits.get(i));
        }

        //3
        for (String str : fruits) {
            System.out.println(str);
        }

        //4
        ArrayList<String> ALT = new ArrayList<>();
        ALT.add("A");
        ALT.add("B");
        ALT.add("C");
        ALT.add("D");
        ALT.add("E");
        System.out.println(ALT);
        ALT.remove(2); // "C" 사용해도 가능
        System.out.println(ALT);

        //5
        ArrayList<String> PyTion = new ArrayList<>();
        PyTion.add("자바");
        PyTion.add("파이썬");
        PyTion.add("C++");
        System.out.println(PyTion);
        PyTion.add(1, "자바스크립트");
        System.out.println(PyTion);

        //6
        Book B1 = new Book("첫번쨰", "동책1");
        Book B2 = new Book("두번쨰", "동책2");
        Book B3 = new Book("세번쨰", "동책3");

        ArrayList<Book> BookList = new ArrayList<>();
        BookList.add(B1);
        BookList.add(B2);
        BookList.add(B3);
        for (Book books : BookList) {
            System.out.println("순서 : " + books.title);
            System.out.println("모든책 : " + books.author);
            System.out.println("----------");
        }

        //7
        Scanner sc = new Scanner(System.in);

        ArrayList<String> AT = new ArrayList<>();
        for (; ; ) {
            System.out.print("입력: ");
            String name = sc.nextLine();
                if (name.equals("종료")) {
                    System.out.println("입력값 ;" + AT);
                    System.out.println("종료");
                    break;
                }
            System.out.println(name);
            AT.add(name);
            }


        //8

        ArrayList< String > als = new ArrayList<>();
        als.add("국어");
        als.add("수학");
        als.add("사회");
        als.add("과학");
        System.out.println(als);
        als.set(1,"영어");
        System.out.println(als);
        }

    }

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}