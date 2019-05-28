select * from smjer;

# filtriranje kolona
select naziv,cijena from smjer;

# jedna kolona mo�e vi�e puta nalaziti u upiti
select naziv,cijena,naziv from smjer;

# mo�e se kombinirati zvjezdica
select *, naziv from smjer;

# u select listi se mo�e nalaziti konstanta
select naziv, 100 from smjer;

# kolonama se mogu dati zamjenski nazivi
select naziv as smjer, 100 as upisnina from smjer;

# u select listi se mo�e na�i i izraz
select naziv, length(naziv) as brojznakova from smjer;

select ime, prezime, 
concat(ime,' ',prezime) as polaznik, 
'Osijek' as grad from osoba;


# filtriranje redova
select sifra, ime, prezime from osoba
where sifra!=5;

select ime, prezime from osoba
where sifra>2 and sifra<5;

select ime, prezime from osoba
where sifra=2 or sifra=5;

select ime, prezime from osoba
where not (sifra=2 or sifra=5);

select ime, prezime from osoba
where ime like 'M%';

select * from osoba
where ime like '%a';

select * from osoba
where ime like '%ar%';

# islistati sva imena i prezimena �ije prezime
# ne zavr�ava s a
select ime, prezime from osoba
where not (prezime like '%a');

select ime, prezime from osoba
where prezime  like '%a%a%';

# izlistaj sve osobe koje imaju �ifru 2 ili 7
select * from osoba
where sifra in (2,7);

select * from grupa
where datumpocetka between '2019-01-01' and '2019-06-30';

# islistati sve osobe koje nemaju definiran oib
select * from osoba where oib is null;



# slaganje rezultata (order)
select ime, prezime from osoba
order by prezime desc, ime;

select ime, prezime from osoba
order by 2 desc, 1;


# ograni�avanje rezultata
select ime, prezime from osoba limit 5;

select ime, prezime from osoba limit 10,10;

# jedinstveni rezultati
select distinct grupa from clan;

# podupiti
# isvu�i sve grupe koje nemaju �lanove
select * from grupa;

INSERT INTO edunovaj20.grupa
(naziv, smjer, predavac, datumpocetka)
VALUES('Novi', 1, null, '2019-06-05');


select naziv from grupa where 
sifra not in (select distinct grupa from clan);





