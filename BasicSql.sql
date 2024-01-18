--sql queries DDL,DML, Select and Non- Select Statement

show databses;
create database Udemy;
use Udemy;
show tables;
create table Customers(customer_id int unique,first_name varchar,last_name varchar,age int,country varchar);
DESC Customers;
insert into Customers values(9,'Rashid','Ali',27,'IN'),(7,'Afsal','khan',27,'IN'),(8,'Suraj','Tawde',27,'IN');
select * from Customers where customer_id=6;
select order_id,item,customer_id,max(amount) from Orders where amount<(select max(amount) from Orders); 
select * from Customers;
delete from Customers where customer_id=9;
update Customers set country='QA' where customer_id=7; 
alter table Customers add company varchar(20);
alter table Customers drop company;
drop table Seller;--not recommended to use
drop database Udemy;--not recommended to use
alter table Customers add primary key(customer_id);
alter table Customers drop primary key;
create table student(id int primary key auto_increment,student_name varchar(30),gender enum('M','F'));
update Customers set company='flipkart' where customer_id>0;
select * from Orders;
select * from Shippings;

--WHERE IN clause
select * from Customers where country in('USA','UK','PA','IN');

--Between clause
select * from Customers where customer_id between 1 and 10;
select * from Customers where first_name between 'A' and 'S';

--Not Negation 
select * from Customers where customer_id not in(3,6,8);
select * from Customers where customer_id not between 5 and 10;

--Logical operator
select * from Customers where customer_id >=5 and customer_id<=8;
select * from Customers where costomer='UAE' or country='IN';
select * from Customers where first_name='Ismail' and age <= 30;
select * from Customers where customer_id>=1 and customer_id<=10;

--Wildcard
select * from Customers where first_name like 'J%';
select * from Customers where first_name like 'J___';
select * from Customers where first_name like '______';
select * from Customers where country like '%USA';

--In Built Functions
select count(*) from Customers where country like 'U%';
select sum(age) from Customers where country like 'U%';
select avg(age) from Customers where country like 'U%';
select max(age) from Customers where country like 'U%';
select min(age) from Customers where country like 'U%';

--Order by
select * from Customers order by first_name desc;
select * from Customers order by customer_id asc;

--Group by
select count(*) as customer_id,order_id as age from Orders group by item order by customer_id desc;

--Having clause
select sum(age) as first_name, last_name as country from Customers group by last_name having age<100 order by age desc;