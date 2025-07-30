package day23;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        /*
            [ 컬렉션 프레임워크2]
                List 인터페이스 : 배열/링크 구조 , 인덱스 있다. 중복허용한다(인덱스가식별자)
                Set 인터페이스 : 집합구조, 인덱스 없다 . 중복허용하지않는다(자료가식별자) + 중복없는 집합체
         */
        // [1] HashSet 객체 생성
        Set< String > set1 = new HashSet<>();
        // [2] 주요 메소드
            // 1) .add( 자료 ) : 집합 내 지정한 자료를 추가한다. 인덱스(순서) 없음
        set1.add("유재석");    set1.add("강호동");
        set1.add("신동엽");    set1.add("유재석"); // 이미 존재하는 자료이므로 불가능
        System.out.println( set1 ); // [유재석, 강호동, 신동엽]
            // 2) .size() : 집합 내 자료/요소 개수 반환
        System.out.println(set1.size() );
            // 3) .contains( 자료 ) : 집합 내 자료가 존재하면 true , 없으면 false 반환
        System.out.println(set1.contains("강호동"));
            // 4) .remove( 자료 ) : 집합 내 자료가 존재하면 삭제 없으면 삭제 안함.
        set1.remove("강호동");
        System.out.println(set1);
            // 5) .isEmpty() : 집합 내 자료/요소 가 하나도 없으면 true , 1개이상이면 false 반환
        System.out.println(set1.isEmpty() );
            // 6) .clear() : 집합 내 모든 자료/요소 삭제
        // set1.clear();

        // [3] 집합 과 반복문 관계
        // 1)  일반for문 표현X : 인덱스가 없어서.....
        // 2) 향상된 for문 : for( 타입 반복면수명 : 리스트/집합명 ) { 실행문 }
        for ( String str : set1 ){ System.out.println( str ); }
        // 3) forEach 문 : 리스트/집합명.forEach( ( 반복변수) -> { 실행문 } );
        set1.forEach( (str) -> {
            System.out.println(str);
        });

        // [4] 구현체
        // Set 인터페이스 : 순서(인덱스) 보장 없이 요소들을 저장하는 구조
        // 1) HashSet : 중복없는 여러개 요소 저장 + 빠르다.
        HashSet<Integer> hashSet = new HashSet<>();
        // 2) TreeSet : 중복없는 여러개 요소 저장 + 저장한 자료들을 자동으로 정렬(오름차순)
        TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(10); treeSet.add(20);
        System.out.println(treeSet);
        // 3) LinkedHashSet : 중복없는 여러개 요소 저장 + 링크구조 + 순서(인덱스없는) 보장 + 느리다.
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        Set<Integer> set2 ;
        set2 = hashSet;
        set2 = treeSet;
        set2 = linkedHashSet;

        // [활용] JDBC ; ResultSet

    }
}
