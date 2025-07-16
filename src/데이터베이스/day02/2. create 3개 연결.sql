
drop database if exists KWONEUNBI;
create database KWONEUNBI;
use KWONEUNBI;

create table user(
        uno int auto_increment,
        primary key(uno) ,
    uid varchar(30) not null unique,
    upwd varchar(30) not null,
    uname varchar(10) not null,
    uphone char(13) not null
	
);

create table Books(
	bno int auto_increment , 
    bname varchar(20) not null ,
    bwriter varchar(20) not null , 
    primary key(bno)
    );

create table waterbomb(
	ano int auto_increment ,
    bstart datetime default now() ,
    bend datetime default now() ,
    breturn datetime default now() ,
    uno int ,
    bno int ,
    primary key (ano) ,
    constraint foreign key ( uno ) references user ( uno ) ,
    constraint foreign key ( bno ) references Books ( bno ) 
    );
    
    
    select * from `waterbomb`;
    SHOW TABLES;