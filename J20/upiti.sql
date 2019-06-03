select a.`orderNumber`as Broj, a.`orderDate` as Datum,sum(b.`priceEach`*b.`quantityOrdered`) as Ukupno,
count(b.`orderNumber`) as Stavaka, min (b.`priceEach`) as Najjeftinije, max (b.`priceEach`) as Najskuplje, avg(b.`priceEach`) as Prosjek
from orders a 
inner join orderdetails b on a.`orderNumber`=b.`orderNumber`
inner join products c on b.`productCode`=c.`productCode`
group by a.`orderNumber`, a.`orderDate`
having sum(b.`priceEach`*b.`quantityOrdered`)>50000
order by 3 desc;

select avg(c.`priceEach`*c.`quantityOrdered`),min(c.`priceEach`*c.`quantityOrdered`),max(c.`priceEach`*c.`quantityOrdered`)
from customers a
inner join orders b on a.`customerNumber`=b.`customerNumber`
inner join orderdetails c on b.`orderNumber`=c.`orderNumber`
where a.`contactFirstName`='Jean' and a.`contactLastName`='King';

select a.`contactFirstName`,a.`contactLastName`,sum(c.`priceEach`*c.`quantityOrdered`)
from customers a
inner join orders b on a.`customerNumber`=b.`customerNumber`
inner join orderdetails c on b.`orderNumber`=c.`orderNumber`
group by a.`contactFirstName`,a.`contactLastName`
having min(c.`priceEach`)>35;

select b.`contactFirstName`,b.`contactLastName`
from employees a inner join customers b on a.`employeeNumber`=b.`salesRepEmployeeNumber`
where a.`firstName`='George' and a.`lastName`='Vanauf';


select a.`contactFirstName`,a.`contactLastName`,sum(c.`priceEach`*c.`quantityOrdered`)
from customers a
inner join orders b on a.`customerNumber`=b.`customerNumber`
inner join orderdetails c on b.`orderNumber`=c.`orderNumber`
group by a.`contactFirstName`,a.`contactLastName`
having min(c.`priceEach`)>35
union
select b.`contactFirstName`,b.`contactLastName`, 0 as Ukupno
from employees a inner join customers b on a.`employeeNumber`=b.`salesRepEmployeeNumber`
where a.`firstName`='George' and a.`lastName`='Vanauf';

update products a
inner join orderdetails b on a.`productCode`=b.`productCode`
set b.quantityOrdered=b.quantityOrdered+1
where a.`productName`='1958 Setra Bus';

select count(b.`quantityOrdered`)
from products a inner join orderdetails b on a.`productCode`=b.`productCode`
where a.`productName`='1958 Setra Bus';

select count(*) from products;

select *
from customers where `salesRepEmployeeNumber` is null;

create table nemajuprodavaca
select *
from customers where `salesRepEmployeeNumber` is null;
 
select * from nemajuprodavaca;

select * from customers
where `addressLine1` is not null;

insert into nemajuprodavaca select * from customers
where `addressLine1` is not null;

select * from customers where `customerNumber`not in (select distinct `customerNumber` from nemajuprodavaca);

select distinct a.`contactFirstName`,a.`contactLastName`
from customers a inner join payments b on a.`customerNumber`=b.`customerNumber`
where b.amount>100000;





