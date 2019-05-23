drop database if exists edunovapp19A;
create database edunovapp19A;
use edunovapp19A;

create table djelatnik(
id int,
ime varchar(30),
prezime varchar(30),
oib char(11)
);

create table sticenik(
id int,
naziv varchar(30),
vrsta varchar(30),
opis text
);

create table dogadjaj(
id int,
djelatnik_id int,
sticenik_id int,
prostor_id int,
vrijeme datetime
);

create table prostor(
id int,
naziv varchar(30),
opis text
);
