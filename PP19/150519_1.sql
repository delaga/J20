drop database if exists pp150519_1;
create database pp150519_1;
use pp150519_1;

create table pjesma(
id int not null primary key auto_increment,
naziv varchar (50) not null,
trajanje time not null,
izvodjac int not null
);

create table izvodjac(
id int not null primary key auto_increment,
naziv varchar (50) not null,
zemlja varchar (50)
);

alter table pjesma add foreign key (izvodjac) references izvodjac(id);