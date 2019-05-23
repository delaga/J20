/*
baza
*/
drop database if exists edunovapp19;
create database edunovapp19;
use edunovapp19;

/*
tablice
*/
create table smjer(
id int not null primary key auto_increment,
naziv varchar(50) not null check(len(naziv)>3),
trajanje int not null,
cijena decimal(18,2),
upisnina decimal(18,2) default 500,
certificiran boolean not null
);

create table osoba(
id int not null primary key auto_increment,
oib char(11),
ime varchar(50) not null,
prezime varchar(50) not null,
email varchar(100) not null
);

create table polaznik(
id int not null primary key auto_increment,
osoba int not null,
brojugovora varchar(20)
);

create table predavac(
id int not null primary key auto_increment,
osoba int not null,
iban varchar(32)
);

create table grupa(
id int not null primary key auto_increment,
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

/*
FK
*/
alter table grupa add foreign key (smjer) references smjer(id);
alter table grupa add foreign key (predavac) references predavac(id);

alter table predavac add foreign key (osoba) references osoba(id);

alter table polaznik add foreign key (osoba) references osoba(id);

alter table clan add foreign key (grupa) references grupa(id);
alter table clan add foreign key (polaznik) references polaznik(id);

/* primjer sa 2 PK i koji nisu int
create table posao(
osoba varchar(50) not null,
radno_mjesto varchar(50) not null,
opis text,
primary key (osoba,radno_mjesto)
);
*/







