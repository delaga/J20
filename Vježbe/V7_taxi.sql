drop database if exists taxi;
create database taxi default character set utf8;
use taxi;

create table vozac(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null
);

create table vozilo(
id int not null primary key auto_increment,
tip varchar(22) not null,
opis text,
vozac_id int not null
);

create table putnik(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null
);

create table voznja(
id int not null primary key auto_increment,
trajanje time not null,
datum date not null,
vozilo_id int not null
);

create table voznja_putnik(
voznja_id int not null,
putnik_id int not null
);

alter table vozilo add foreign key (vozac_id) references vozac(id);
alter table voznja add foreign key (vozilo_id) references vozilo(id);
alter table voznja_putnik add foreign key (voznja_id) references voznja(id);
alter table voznja_putnik add foreign key (putnik_id) references putnik(id);

