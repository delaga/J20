select a.sifra, a.naziv, b.naziv as smjer
from grupa a inner join smjer b
on a.smjer=b.sifra;

select grupa.sifra, grupa.naziv, smjer.naziv as smjer
from grupa inner join smjer
on grupa.smjer=smjer.sifra;


select a.sifra, a.naziv, b.naziv as smjer
from grupa a left join smjer b
on a.smjer=b.sifra;


select a.sifra, a.naziv, b.naziv as smjer
from grupa a right join smjer b
on a.smjer=b.sifra;

select b.sifra, b.naziv, a.naziv as smjer
from smjer a left join grupa b
on b.smjer=a.sifra;


select a.sifra, a.naziv, b.naziv as smjer, 
d.ime,d.prezime
from grupa a inner join smjer b
on a.smjer=b.sifra
left join predavac c on a.predavac=c.sifra
left join osoba d on c.osoba = d.sifra;

# Islistajte sva imena i prezimena polaznika na
# grupi PP19
select d.ime, d.prezime
from grupa a
inner join clan b on a.sifra=b.grupa
inner join polaznik c on b.polaznik=c.sifra
inner join osoba d on c.osoba=d.sifra
where a.naziv='PP19';

# Islistajte sva imena i prezimena polaznika
# koji nemaju definiran email
select a.ime, a.prezime
from osoba a inner join polaznik b on a.sifra=b.osoba
where a.email is null;


# Baza knjižnica

# izlitajte sve knjige koje se bave ljubavnom tematikom
select  a.sifra, b.ime,b.prezime, 
a.naslov, c.naziv as izdavac,d.naziv as mjesto
from katalog a inner join autor b on a.autor=b.sifra
inner join izdavac c on a.izdavac=c.sifra
inner join mjesto d on a.mjesto=d.sifra
where a.naslov like '%ljubav%'
and a.sifra in (2660,2664,2879,2938);

# izlistajte sve naslove autora koji su roðeni 1980 godine

select a.naslov
from katalog a inner join autor b on a.autor=b.sifra
where b.datumrodenja between '1980-01-01' and '1980-12-31';


# classic models
# Izlistajte sve proizvode u liniji proizvoda Vlakovi

select b.productName
from productlines a inner join products b
on a.productLine=b.productLine
where a.productLine='Trains';

select productName from products 
where productLine='Trains';


# Izlistati sva jedinstvena imena i prezimena kupaca
# koji su kupili proizvode u liniji poizvoda Trains

select distinct e.contactFirstName, e.contactLastName
from productlines a inner join products b
on a.productLine=b.productLine
inner join orderdetails c
on b.productCode=c.productCode
inner join orders d
on c.orderNumber=d.orderNumber
inner join customers e
on d.customerNumber=e.customerNumber
where a.productLine='Trains';