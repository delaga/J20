select concat(b.`firstName`,' ',b.`lastName`) as kupac,a.city as 'iz grada', f.`productName` as kupio
from offices a 
inner join employees b on a.`officeCode`=b.`officeCode`
inner join customers c on b.`employeeNumber`=c.`salesRepEmployeeNumber`
inner join orders d on c.`customerNumber`=d.`customerNumber`
inner join orderdetails e on d.`orderNumber`=e.`orderNumber`
inner join products f on e.`productCode`=f.`productCode`
inner join productlines g on f.`productLine`=g.`productLine`
where a.city='Boston' and g.`productLine` like '%tra%';


select a.`firstName`
from employees a 
inner join customers b on a.`employeeNumber`=b.`salesRepEmployeeNumber`
inner join orders c on b.`customerNumber`=c.`customerNumber`
inner join orderdetails d on c.`orderNumber`=d.`orderNumber`
inner join products e on d.`productCode`=e.`productCode`
where e.`productLine`='Trains';

select distinct a.`firstName`,a.`lastName`
from employees a 
inner join customers b on a.`employeeNumber`=b.`salesRepEmployeeNumber`
inner join orders c on b.`customerNumber`=c.`customerNumber`
inner join orderdetails d on c.`orderNumber`=d.`orderNumber`
inner join products e on d.`productCode`=e.`productCode`
where e.`productLine`='Trains' order by a.`firstName`;


