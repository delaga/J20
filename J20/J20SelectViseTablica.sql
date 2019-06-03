select a.naziv, b.naziv as smjer
from grupa a inner join smjer b
on a.smjer=b.sifra;

select grupa.naziv, smjer.naziv as smjer
from grupa inner join smjer
on grupa.smjer=smjer.sifra;


select a.naziv, b.naziv as smjer
from grupa a left join smjer b
on a.smjer=b.sifra;

select a.naziv, b.naziv as smjer
from grupa a right join smjer b
on a.smjer=b.sifra;

select b.naziv, a.naziv as smjer
from smjer a left join grupa b
on b.smjer=a.sifra;


select a.naziv as grupa, b.naziv as smjer,
concat(d.ime,' ',  d.prezime) as predavac
from grupa a inner join smjer b
on a.smjer=b.sifra
left join predavac c
on a.predavac=c.sifra
left join osoba d
on c.osoba=d.sifra;


# ispisati sva imena i prezimena polaznika
# na grupi J20
select d.ime,d.prezime
from grupa a inner join clan b
on a.sifra=b.grupa
inner join polaznik c
on b.polaznik=c.sifra
inner join osoba d
on c.osoba=d.sifra
where a.naziv='J20';

# baza knjižnica
# izlistati sve knjige s ljubavnom tematikom
select  a.sifra, b.ime, b.prezime, a.naslov,
c.naziv as izdavac,d.naziv as mjesto
from katalog a inner join autor b 
on a.autor=b.sifra
inner join izdavac c on a.izdavac=c.sifra
inner join mjesto d on a.mjesto=d.sifra
where a.naslov like '%ljubav%'
and a.sifra in (2660,2664,2879,2938);


# Izlistajte sve proizvode u liniji prizvoda Vlakovi

select b.productName
from productlines a inner join products b
on a.productLine=b.productLine
where a.productLine='Trains';


select productName from products 
where productLine='Trains';

# Izlistati sva jedinstvena imena i prezimena kupaca
# koji su kupili proizvode u liniji poizvoda Trains

