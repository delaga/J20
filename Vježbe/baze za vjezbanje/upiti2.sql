select * from grupa;
select * from smjer;

#inner join
select a.naziv, b.naziv as smjer
	from grupa a inner join smjer b
		on a.smjer = b.sifra;
#left join
select a.naziv, b.naziv as smjer
	from grupa a left join smjer b
		on a.smjer = b.sifra;
#right join
select a.naziv, b.naziv as smjer
	from grupa a right join smjer b
		on a.smjer = b.sifra;
	
#

select a.naziv as grupa, b.naziv as smjer, concat(d.ime,' ',d.prezime) as predavac 
from grupa a inner join smjer b 
on a.smjer=b.sifra
left join  predavac c 
on a.predavac=c.sifra
left join osoba d
on c.osoba=d.sifra;


select d.ime, d.prezime 
from grupa a inner join clan b 
on a.sifra=b.grupa
left join polaznik c 
on b.polaznik=c.sifra
left join osoba d 
on c.osoba=d.sifra
where a.naziv='J20';

select d.ime, d.prezime 
from grupa a inner join clan b 
on a.sifra=b.grupa
inner join polaznik c 
on b.polaznik=c.sifra
inner join osoba d 
on c.osoba=d.sifra
where a.naziv='PP19';

insert into clan(grupa,polaznik) values(2,3);
em
select * from katalog where naslov like '%ljubav%' and naslov not like '%kuž%';

select a.sifra,a.naslov,b.ime,b.prezime,c.naziv as izdavac,d.naziv as mjesto
from katalog a inner join autor b on a.autor=b.sifra
inner join izdavac c on a.izdavac=c.sifra
inner join mjesto d on a.mjesto=d.sifra
where a.naslov like '%ljubav%' and a.sifra in(2660,2664,2879,2938);

select *
from products a inner join productlines b on a.`productLine`=b.`productLine`
where b.`textDescription` like '%train%';

select `productName`from products where `productLine`='Trains';

select * from employees where `reportsTo`is null;
select * from employees where `reportsTo`=1002;







