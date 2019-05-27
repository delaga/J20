select * from smjer;
select naziv,cijena from smjer;
select naziv,cijena,naziv from smjer;
select naziv,* from smjer;
select naziv,100 from smjer;
select naziv as smjer, 100.00 as upis from smjer;
select naziv, length(naziv) as duzina from smjer;
select ime,prezime,concat(ime,' ',prezime),'Osijek' as Grad from osoba;
select naziv from smjer where sifra=1;
select sifra,naziv from smjer where sifra>3;
select * from smjer where sifra!=3;
select * from smjer where sifra<>3;
select * from smjer where sifra>3 and sifra<5;
select * from smjer where sifra=3 or sifra=5;
select * from smjer where not(sifra=3 or sifra=5);
select * from osoba where sifra=2 and ime='Lobel';
select * from osoba where sifra=8 or ime='Ivana';
select * from grupa where datumpocetka='2019-05-27';
insert into grupa(naziv,smjer,predavac,datumpocetka) values('PP22',1,1,'2019-05-27');
select * from grupa;
update grupa set datumpocetka='2019-06-27' where sifra=4;
UPDATE edunovapp19.grupa SET naziv='Novi' WHERE sifra=4;
select ime,prezime from osoba where ime like '%a';
select * from osoba where ime like '%';
select * from osoba where not (ime like '%a');
select * from osoba where ime not like '%a';
select * from osoba where sifra in(3,5);
select * from grupa where datumpocetka between '2019-01-01' and '2019-06-30';
select * from grupa where datumpocetka>='2019-01-01' and datumpocetka<='2019-06-30';
select * from grupa where datumpocetka is null;
select ime,prezime from osoba order by prezime desc;
select ime,prezime from osoba order by 2,1;
select ime,prezime from osoba limit 10,5;
select grupa from clan;
select distinct grupa from clan;
select * from grupa where sifra not in(select distinct grupa from clan);



kekspay