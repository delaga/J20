drop database if exists edunovaj20v20150515c;
create database edunovaj20v20150515c;
use edunovaj20v20150515c;

create table vozac(
id int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null
);

create table vozilo(
id int not null primary key auto_increment,
tip varchar(50) not null,
opis text,
vozac_id int
);

create table voznja(
id int not null primary key auto_increment,
vozilo_id int not null,
trajanje int not null,
vrijeme_polaska datetime not null
);

create table putnik(
id int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null
);

create table voznja_putnik(
putnik_id int not null;
voznja_id int not null;
);

alter table vozilo add foreign key (vozac_id) references vozac(id);
alter table voznja add foreign key (vozac_id) references vozac(id);

