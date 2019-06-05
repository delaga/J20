INSERT INTO pausalni_obrt.klijent_kupac
(naziv)
VALUES('Fizièka osoba'),('Edunova'),('Coca-cola');

INSERT INTO pausalni_obrt.korisnik
(ime, prezime, email, lozinka)
VALUES('Mirza', 'Delagic', 'mirza@email.com', '123');

INSERT INTO pausalni_obrt.usluga_proizvod(naziv, opis, jedinica_mjere, cijena) VALUES
('Instalacija', 'postavljanje sustava', 'sat', 250),('Savjetovanje', 'savjetovanje', 'sat', 250);

INSERT INTO pausalni_obrt.racun
(broj_racuna, klijent_kupac_id, vrijeme_idavanja,izdao_korisnik_id)
VALUES('01-2018', 1, '2018-05-11 00:00:00',1);

INSERT INTO pausalni_obrt.racun
(broj_racuna, klijent_kupac_id, vrijeme_idavanja,izdao_korisnik_id)
VALUES('02-2018', 3, '2018-08-11 15:00:00',1),('03-2018', 2, '2018-12-11 15:33:00',1),('01-2019', 1, '2019-01-11 15:33:00',1);

INSERT INTO pausalni_obrt.stavka
(usluga_proizvod_id, racun_id, rabat, kolicina)
VALUES(1, 1, 0.00, 5),(2, 1, 0.00, 2),(3, 2, 10, 1),(3, 3, 0.00, 1),(2, 4, 0.00, 10);

select 
from klijent_kupac a inner join racun b on a.id=b.klijent_kupac_id
inner join stavka c on b.id=c.racun_id
inner join usluga_proizvod d on d.id=c.usluga_proizvod_id
where b.vrijeme_idavanja BETWEEN '2018-01-01' and '2018-12-31';


_____________________
select distinct left(`contactFirstName`,1) from customers order by 1;

select now();
select current_timestamp;

select * from orders where year(`orderDate`)='2003'and month(`orderDate`)='5';

select adddate(now(),57);

select datediff(day,'2019-12-25',now());

select datediff(now(),'1975-09-18')*1440*80;

select sum(b.`quantityOrdered`*b.`priceEach`),dayname(a.`orderDate`)
from orders a inner join orderdetails b on a.`orderNumber`=b.`orderNumber`
group by dayname(a.`orderDate`) order by 1 desc;

update products a 
inner join orderdetails b on a.`productCode`=b.`productCode`
inner join orders c on b.`orderNumber`=c.`orderNumber`
set a.`buyPrice`=a.`buyPrice`*1.1
where dayname(c.`orderDate`)='Friday';

select `contactFirstName`,`contactLastName`,lower(concat(left(`contactFirstName`,1),`contactLastName`,'@edunova.hr'))
from customers;

create function email(ime varchar(100),prezime varchar(100)) returns varchar(220)
begin
	return lower(concat(left(ime,1),prezime,'@edunova.hr'));
end;
$$

select email(`contactFirstName`,`contactLastName`) from customers;
select email('Jozo','Jozic');

create procedure obrisiKupca(ime varchar(100),prezime varchar(100))
begin
	delete a 
	from orderdetails a inner join orders b on a.`orderNumber`=b.`orderNumber` inner join customers c on b.`customerNumber`=c.`customerNumber`
	where c.`contactFirstName`=ime and c.`contactLastName`=prezime';

	delete b 
	from orders b inner join customers c on b.`customerNumber`=c.`customerNumber`
	where c.`contactFirstName`=ime and c.`contactLastName`=prezime;
	
	delete d 
	from payments d inner join customers c on c.`customerNumber`=d.`customerNumber`
	where c.`contactFirstName`=ime and c.`contactLastName`=prezime;

	delete c from customers c where c.`contactFirstName`=ime and c.`contactLastName`=prezime;

end;
$$



