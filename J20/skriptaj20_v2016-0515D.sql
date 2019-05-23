drop database if exists edunovaj20v20150515d;
create database edunovaj20v20150515d;
use edunovaj20v20150515d;

create table zaposlenik(
id int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
odjel int not null,
nadredjeni int not null
);

create table odjel(
id int not null primary key auto_increment,
naziv varchar(50) not null,
voditelj int not null
);

alter table zaposlenik add foreign key (nadredjeni) references zaposlenik(id);

alter table zaposlenik add foreign key (odjel) references odjel(id);

alter table odjel add foreign key (voditelj) references zaposlenik(id);