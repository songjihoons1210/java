
drop database if exists member;
create database member;
use member;
create table members(
	member_id varchar(20) not null primary key,
    member_name varchar(50) not null , 
    email varchar(100) not null unique,
    join_date datetime default now(),
	points int default 0
    
);
select * from members;
# 2
insert into members(member_id , member_name , email , points ) values ("user01", "김철수", "chulsoo@example.com", 1000 );

# 3
select member_id , email from members;

# 4
update members set points = 1500 where member_id = "user01";

# 5
delete from members where member_id = "user01";

# 6
drop database product;
create database product;
use product;
create table products(
	product_code int auto_increment,
    product_name varchar(100) not null,
    price int unsigned not null,
    stock_quantity int default 0  not null,
    category varchar(50),
    primary key ( product_code)
);
select * from products;
# 7
insert into products (product_name, price , stock_quantity , category) values ("프리미엄 키보드" , 12000 ,  50 , "컴퓨터 주변기기");
select * from products;

# 8 

select  product_name , price from products where category = "컴퓨터 주변기기";

# 9 
update products set stock_quantity =45 where product_name ="프리미엄 키보드";

# 10
delete from products where product_name = "프리미엄 키보드";