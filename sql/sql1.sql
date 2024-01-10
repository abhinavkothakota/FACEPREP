show databases;
use kiki;
show tables;
create table emp_datelist(
emp_no int(6),
emp_dep varchar(52),
emp_name varchar(94),
emp_salary varchar(6)
);
desc emp_datelist;
select * from emp_datelist;
insert into emp_datelist values(69420,"sdgvsdgv","adasasasa","741741");
desc emp_datelist;
select * from emp_datelist;
alter table emp_datelist add country varchar(28) default "india";
select * from emp_datelist;
alter table emp_datelist rename column country to COUNTRY ;

create table employee1(
empid INTEGER primary key,
name TEXT NOT NULL,
dept TEXT NOT NULL);
desc employee1;

create table employee2(
empid INTEGER ,
cust_name TEXT NOT NULL,
dept TEXT NOT NULL,
constraint empid foreign key (empid) references employee1(empid));
desc employee2;

insert into employee1 values(0003,'mg','CSE');
insert into employee2 values(0001,"GM","ECE");
select * from employee1;
create view ece_employees as select * from employee2 where dept = "ECE";
select * from ece_employees;