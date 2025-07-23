drop database if exists 과제8;
create database 과제8;
use 과제8;

create table waiting(
	num int auto_increment ,
    phone longtext not null ,
    count varchar(30)  not null , 
    constraint primary key(num) 
    );
    
-- num 대기번호 / phone 연락처 / count 인원수
# 샘플
INSERT INTO waiting (phone, count) VALUES ('010-1234-0001', '2');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0002', '4');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0003', '1');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0004', '3');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0005', '2');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0006', '5');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0007', '1');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0008', '4');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0009', '3');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0010', '2');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0011', '1');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0012', '6');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0013', '2');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0014', '4');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0015', '3');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0016', '2');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0017', '5');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0018', '1');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0019', '4');
INSERT INTO waiting (phone, count) VALUES ('010-1234-0020', '3');

select * from waiting;
    
    
