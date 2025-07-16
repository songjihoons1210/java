 [ 데이터베이스 ] : 데이터/자료들의 집합/모임
 [ 관계형데이터베이스 ] : 자료들 간의 종속되는 관계 표현 가능한 데이터베이스
 [ 테이블 ] : 행 과 열로 이루어진 데이터의 형식 = 표
 [ SQL ] 
	1. 주의할점
		1) SQL 대소문자를 구분하지 않는다.
        2) SQL 명령어 문장 끝에(;)세미콜론 단위로 실행한다.
	[0] 메타데이터 관리어
		1. show
			1) show databases;						: DB서버내 전체 데이터베이스 목록 조회
            2) show variables like 'datedir';		: DB서버내 LOCAL PATH 조회
		2. use
			1) use 데이터베이스명;						: DB서버내 지정한 데이터베이스 활성화(사용)
	[1] 데이터베이스 정의 : DDL
		1. create
			1) create database 데이터베이스명;			: 지정한 데이터베이스 생성
		2. drop
			1) drop database 데이터베이스명;			: 지정한 데이터베이스 삭제
            2) drop database if exists 데이터베이스명;	: 만약에 지정한 데이터베이스 존재하면 삭제