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
create table employee(
empid INTEGER primary key,
name TEXT NOT NULL,
dept TEXT NOT NULL);
insert into employee values(0001,'mg','CSE');
insert into employee values(0069,"GM","ECE");
select * from employee where dept = "CSE";