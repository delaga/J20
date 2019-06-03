select `orderNumber`,sum(`priceEach`*`quantityOrdered`) from orderdetails where `orderNumber`<10110 group by `orderNumber`;
select `orderNumber`,sum(`priceEach`*`quantityOrdered`) from orderdetails group by `orderNumber` having sum(`priceEach`*`quantityOrdered`)>50000 ;

select b.`orderDate`,a.`contactFirstName`,a.`contactLastName`,b.`orderNumber`,sum(`priceEach`*`quantityOrdered`),count(b.`orderNumber`)
from customers a inner join orders b on a.`customerNumber`=b.`customerNumber`
inner join orderdetails c on b.`orderNumber`=c.`orderNumber` where b.`orderNumber`<10110 group by b.`orderNumber` having sum(c.`priceEach`*c.`quantityOrdered`)>50000;

select min(buyPrice) from products;

select * from products order by `buyPrice` limit 1;

select a.`contactFirstName`,a.`contactLastName`
from customers a inner join employees b on a.`salesRepEmployeeNumber`=b.`employeeNumber`
where b.`firstName`='George' and b.`lastName`='Vanauf';

select b.`orderDate`,a.`contactFirstName`,a.`contactLastName`,b.`orderNumber`,sum(`priceEach`*`quantityOrdered`),count(b.`orderNumber`)
from customers a inner join orders b on a.`customerNumber`=b.`customerNumber`
inner join orderdetails c on b.`orderNumber`=c.`orderNumber` where b.`orderNumber`<10110 group by b.`orderNumber` having sum(c.`priceEach`*c.`quantityOrdered`)>50000
union
select 0,a.`contactFirstName`,a.`contactLastName`,0,0,0
from customers a inner join employees b on a.`salesRepEmployeeNumber`=b.`employeeNumber`
where b.`firstName`='George' and b.`lastName`='Vanauf';

update orderdetails a inner join products b on a.`productCode`=b.`productCode`
set a.`quantityOrdered`=a.`quantityOrdered`+1 where b.`productName`='1958 Setra Bus';

delete a 
from orderdetails a inner join orders b on a.`orderNumber`=b.`orderNumber`
inner join customers c on b.`customerNumber`=c.`customerNumber`
where c.`contactFirstName`='Jean' and c.`contactLastName`='King';

select * from customers where `salesRepEmployeeNumber` is null;

create table nemaPredstavnika select * from customers where `salesRepEmployeeNumber` is null;

select * from nemapredstavnika;

select * from customers where state is not null;

insert into nemapredstavnika select * from customers where state is not null;

select `customerNumber`,count(`customerNumber`) from nemapredstavnika group by `customerNumber`
having count(`customerNumber`)>1;



