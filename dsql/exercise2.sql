use edac;
select  Sname from  supplier order by City desc;
select * from Parts  order by City , Pname ;
select * from Supplier where Status between 10 and 20;
select Pname , Weight where Weight not between  10 and 15;
select Pname from Parts where Pname like 'S%';
select * from Supplier where City like 'L%';
select * from Projects where Jname like '__n%';
