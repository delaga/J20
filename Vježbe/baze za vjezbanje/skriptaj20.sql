
# izvođenje
# Ova datoteka se nalazi na d:\
/*

c:\xampp\mysql\bin\mysql -uedunova -pedunova --default_character_set=utf8 < "F:\skriptaj20.sql"

*/

drop database if exists edunovaj20;
create database edunovaj20 default character set utf8;
use edunovaj20;

create table smjer(
sifra int not null primary key auto_increment,
naziv varchar(50) not null check(len(naziv)>3),
trajanje int not null,
cijena decimal(18,2) ,
upisnina decimal(18,2),
certificiran boolean not null
);

create table osoba(
sifra int not null primary key auto_increment,
oib char(11),
ime varchar(50) not null,
prezime varchar(50) not null,
email varchar(100) not null
);


create table polaznik(
sifra int not null primary key auto_increment,
osoba int not null,
brojugovora varchar(20)
);

create table predavac(
sifra int not null primary key auto_increment,
osoba int not null,
iban varchar(32)
);

create table clan(
grupa int not null,
polaznik int not null
);

create table grupa(
sifra int not null primary key auto_increment,
naziv varchar(50) not null,
smjer int not null,
predavac int,
datumpocetka datetime default now()
);


alter table grupa add foreign key (smjer) references smjer(sifra);
alter table grupa add foreign key (predavac) references predavac(sifra);

alter table predavac add foreign key (osoba) references osoba(sifra);

alter table polaznik add foreign key (osoba) references osoba(sifra);

alter table clan add foreign key (grupa) references grupa(sifra);
alter table clan add foreign key (polaznik) references polaznik(sifra);



# komentar jedan red
/*
Komentar više redova
*/
# loš način
# šifra 1
insert into smjer
values (null,'Java programiranje',
130,5489.85,null,true);

#malo bolji način
# šifra 2
insert into smjer 
(naziv,trajanje, certificiran)
values ('PHP programer',130,false);

# najbolji (po teoriji) način unosa
# šifra 3
insert into smjer
(sifra,naziv,trajanje,cijena,upisnina,
certificiran) values
(null,'Operater',100,null,null,true);


insert into smjer 
(naziv,trajanje, certificiran)
values
# šifra 4
('čšćđž ČŠĆĐŠŽ',100,false),
# šifra 5
('Serviser',60,true),
# šifra 6
('EU fondovi',230,true);


insert into grupa (naziv,smjer) values ('J20',1);

insert into grupa (naziv,smjer,datumpocetka) values ('PP19',2,'2019-05-06');

insert into osoba (ime,prezime,email) values
# 1
('Marta','Cerovečki','martacerovecki664@gmail.com'),
# 2
('Marin','Čutura','w.cutura1990@gmail.com'),
# 3
('Karlo','Grbavac','karlo.grbavac@gmail.com'),
# 4
('Luka','Hlavati','lukahlavati@gmail.com'),
# 5
('Tomislav','Juroš','tomislavj84@gmail.com'),
# 6
('Jelena','Klenkar','jelena.klenkar@gmail.com'),
# 7
('Mirza','Delagić','mirza.delagic@gmail.com'),
# 8
('Marko','Herek','marko.herek55@gmail.com'),
# 9
('Niko','Jukić','niko.jukic200@gmail.com'),
# 10
('Tomislav','Glavašić','tomislavglavasic@gmail.com'),
# 11
('Ivan','Višić','ivan_visic@hotmail.com'),
# 12
('Tomislav','Jakopec','tjakopec@gmail.com'),
# 13
('Shaquille', 'O''Neal','saki@gmail.com');


insert into polaznik (osoba) values
(1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11);

insert into predavac (osoba) values (12),(13);

insert into clan(grupa,polaznik) values
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),(1,10),(1,11),
(2,7),(2,11);







#select * from smjer;

# OVO NIKADA NE RADITI
# imati update bez where
#update smjer set trajanje=120;
#select * from osoba;

# smjeru Java programiranje postavi 
# upisninu na 500 kn
#select * from smjer where sifra=1;
update smjer set upisnina=500 where sifra=1;
#select * from smjer where sifra=1;

# svim smjerovima kojima je šifra veća od 1
# postavi cijenu 4000 kn te upisninu 400
#select * from smjer where sifra>1;
update smjer set cijena=5000, upisnina=400
where sifra>1;
#select * from smjer where sifra>1;

# Svim smjerovima spustiti upisninu za 10%
#select * from smjer;
update smjer set upisnina=upisnina*0.9;
#select * from smjer;

# Svim smjerovima povećati cijenu za 100 kuna
#select * from smjer;
update smjer set cijena=cijena+100;
#select * from smjer;

# dodati kolonu porez
alter table smjer add column porez decimal(18,2);
update smjer set porez=rand()*100;

#select * from grupa;
# grupi J20 predaje Tomislav Jakopec

#select * from osoba; # 12

#select * from predavac; # 1

#select * from grupa;
update grupa set predavac=1 where sifra=1;

# grupi PP19 Predaje Shaki
update grupa set predavac=2 where sifra=2;

# novi email od Ivana Višić je visic.ivan1@gmail.com
#select * from osoba;
update osoba set email='visic.ivan1@gmail.com'
where sifra=11;

# svim polaznicima postaviti različite brojeve ugovora
# vrijednosti brojeva ugovora odaberite sami

#select * from polaznik;

update polaznik set 
brojugovora=concat(
			cast(year(now())as char(4)), 
			'-', 
			cast(rand()*1000 as int)
        );

#select * from predavac;
update predavac set iban='HR7523400096573698967' where sifra=1;
update predavac set iban='HR9423600003199989684' where sifra=2;



# delete briše red iz tablice
# u svaku tablicu dodajte po jedan red
insert into smjer (naziv,trajanje,certificiran)
values ('Za brisanje',100,true);
insert into osoba(ime,prezime,email) values ('a','a','a');
insert into osoba(ime,prezime,email) values ('a','a','a');
insert into polaznik (osoba) values (14);
insert into predavac (osoba) values (15);
insert into grupa (naziv,smjer,predavac) values ('a',1,3);
insert into clan (grupa,polaznik) values (3,1);


#select * from smjer;
# vanjski ključ ne dozvoljava brisanje
#delete from smjer where sifra=1;
# omogućavanje brisanja entiteta koji je 
# vanjski ključ u drugom entitetu je moguće
# s opcijom cascade

# sve što je unseno obrisati

#select * from clan;
delete from clan where grupa=3;
#select * from polaznik;
delete from polaznik where sifra=12;
#select * from grupa;
delete from grupa where sifra=3;
#select * from smjer;
delete from smjer where sifra=7;
#select * from predavac;
delete from predavac where sifra =3;
#select * from osoba;
delete from osoba where sifra in (14,15);



select 'GOTOV SAM, SVE OK';















