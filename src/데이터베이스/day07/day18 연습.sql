drop database if exists mydb0723;
create database mydb0723;
use mydb0723;
create table user(
	uno int auto_increment , -- 회원번호 , int(정수) , auto_increatment(자동번호부여)
    uname varchar(30) not null ,  -- 회원명 , varchar(문자열) , not null ( 빈칸 불가능 )
    uage int default 10 , -- 회원나이 , int(정수) , default 10 ( insert생략시 초기값 ) 
    constraint primary key ( uno ) -- 위에서 선언된 회원번호 속성을 기본키(PK) 설정
    );
    
    
    # day18 -> userDao 에서 사용할 sql insert 문법
    # 1.
    insert into user( uname , uage ) values ( ? , ? );
	
    
    # 3.
    select * from user;
    