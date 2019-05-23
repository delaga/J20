
# sipanje na server
/*
c:\xampp\mysql\bin\mysql -uedunova -pedunova --default_character_set=utf8 < "F:\skriptapp19.sql"
*/


drop database if exists edunovapp19;
create database edunovapp19 default character set utf8;
use edunovapp19;

create table smjer(
sifra int not null primary key auto_increment,
naziv varchar(50) not null check(len(naziv)>3),
trajanje int not null,
cijena decimal(18,2),
upisnina decimal(18,2) default 500,
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

create table grupa(
sifra int not null primary key auto_increment,
naziv varchar(20) not null,
smjer int not null,
predavac int,
brojpolaznika int,
datumpocetka datetime
);

create table clan(
grupa int not null,
polaznik int not null
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
values (null,'PHP programer',
130,5489.85,null,true);

#malo bolji način
# šifra 2
insert into smjer 
(naziv,trajanje, certificiran)
values ('Java programiranje',130,false);

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

insert into grupa (naziv,smjer) values 
('PP19',1),('J20',2);

insert into osoba (ime,prezime,email) values
# šifra 1
('Mario','Ćelić','mariocelic@gmail.com'),
# šifra 2
('Lobel','Vetengl','vetengl.lobel@gmail.com'),
# šifra 3
('Ivan','Škorjanc','ivan.skorjanc@gmail.com'),
# šifra 4
('Damir','Čavajda','dcavajda@gmail.com'),
# šifra 5
('Zvonimir','Šuler','zvonimirsuler@gmail.com'),
# šifra 6
('Ivana','Kovačević','kovacevic.ivana044@gmail.com'),
# šifra 7
('Davorin','Bosanac','davorin.bosanac92@gmail.com'),
# šifra 8
('Mirza','Delagić','mirza.delagic@gmail.com'),
# šifra 9
('Andrija','Kruhoberec','akruhoberec1@outlook.com'),
# šifra 10
('Shaquille','O''Neal','shaki@gmail.com'),
# šifra 11
('Tomislav','Jakopec','tjakopec@gmail.com');

insert into polaznik(osoba) values
(1),(2),(3),(4),(5),(6),(7),(8),(9);


insert into predavac (osoba) values 
# sifra 1
(10),
# sifra 2
(11);

insert into clan (grupa,polaznik) values
(1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(1,7),(1,8),(1,9),
(2,7),(2,9);





#select * from smjer;

# OVO NIKADA NE RADITI
# update smjer set trajanje=120;

# Serviserima postavite trajanje na 120 sati
#select * from smjer where sifra=5;
update smjer set trajanje=120 where sifra=5;
#select * from smjer where sifra=5;

# svim smjerovima koji imaju šifru veću od 1
# postavite cijenu na 5000 kn te upisninu na 400 kn
#select * from smjer where sifra>1;
update smjer set cijena=5000, upisnina=400
where sifra>1;
#select * from smjer where sifra>1;


#select * from grupa;
# štiti nas vanjski ključ
# update grupa set smjer=22 where sifra=1;

# na grupi J20 postavite broj polaznika na 15
update grupa set brojpolaznika=15 where sifra=2;
# na grupi PP19 postavite datum početka 
# na 06. 05. 2019. '2019-05-06'
update grupa set datumpocetka='2019-05-06 19:00:00'
where sifra=1;

# postaviti da Shaki vodi J20
#select * from predavac;
#select * from osoba;
update grupa set predavac=1 where sifra=2;
# postaviti da Tomislav vodi PP19
update grupa set predavac=2 where sifra=1;


#select * from polaznik;
# Svim poznicima postavite brojeve ugovora
# vrijednosti odaberite sami
update polaznik set brojugovora=concat(
			cast(year(now())as char(4)), 
			'-', 
			cast(rand()*1000 as int)
        );


#select * from smjer;
# svim smjerovima smanjite cijenu za 10%
update smjer set cijena=cijena*0.9;

# sve upisnine uvećajte za 50 kn
update smjer set upisnina=upisnina+50;

# delete naredba briše retke iz tablice

#delete from smjer where sifra=1;
#select * from osoba;
# kod definiranja vanjskih ključeva postoji opcija
# cascade koja omogućuje brisanje djece kada se 
# briše roditelj

# u svaku tablicu unijeti po jedan red
insert into smjer (naziv,trajanje,certificiran)
values ('Za brisanje',100,true);
insert into osoba(ime,prezime,email) values ('a','a','a');
insert into osoba(ime,prezime,email) values ('a','a','a');
insert into polaznik (osoba) values (12);
insert into predavac (osoba) values (13);
insert into grupa (naziv,smjer,predavac) values ('a',1,3);
insert into clan (grupa,polaznik) values (3,1);


# obrisati sve uneseno

#select * from clan;
delete from clan where grupa=3;
#select * from polaznik;
delete from polaznik where sifra=10;
#select * from grupa;
delete from grupa where sifra=3;
#select * from smjer;
delete from smjer where sifra=7;
#select * from predavac;
delete from predavac where sifra =3;
#select * from osoba;
delete from osoba where sifra in (12,13);








