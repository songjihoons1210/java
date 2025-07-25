drop database if exists db02250724;
create database db02250724;
use db02250724;

create table used(
	num int auto_increment , -- 번호
    sname varchar(30) not null , --  판매자
    sproduct varchar(30) not null ,  -- 물품명
    scontent longtext not null , -- 물품 설명
    spass varchar(20) not null ,  -- 판매자 비밀번호
    sprice int not null ,  -- 물품 가격
    sday datetime default now(), -- 등록일
    stata varchar(10) default '판매중', -- 판매중/판매완료
    constraint primary key(num) 
    );
    
insert into used (sname, sproduct, scontent, spass, sprice) values
('유재석', '컴퓨터', '멋있는 컴퓨터입니다.', '1234', 1000000),
('강호동', '노트북', '가볍고 빠른 노트북입니다.', '2345', 1500000),
('신동엽', '태블릿', '고화질 태블릿입니다.', '3456', 800000),
('박명수', '에어컨', '시원한 바람 나오는 에어컨입니다.', '4567', 300000);
    
    
create table anonymity(
	numbers int auto_increment,  -- 검색할 번호 
    num int not null,			-- 위 번호 
    owriter varchar(30) not null, -- 익명 
    ocontent varchar(100) not null, -- 익명 내용/설명
    opass varchar(20) not null,  -- 익명자 비밀번호
    otata datetime default now(), -- 등록일
	constraint primary key(numbers),
    constraint fk_anonymity_used foreign key(num) references used(num)
    on update cascade
    on delete cascade
    );
    
insert into anonymity (num, owriter, ocontent, opass) values
(1, '홍길동', '이 컴퓨터 아직 판매 중인가요?', '1111'),
(2, '이순신', '노트북 가격 좀 깎아주세요~', '2222'),
(3, '장보고', '태블릿 배터리 상태 어떤가요?', '3333');
    
    
select * from used;
select * from anonymity;

delete from used where num = 5;

	
    
