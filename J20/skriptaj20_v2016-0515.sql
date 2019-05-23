drop database if exists edunovaj20v20150515A;
create database edunovaj20v20150515A;
use edunovaj20v20150515A;

create table kontakt(
id int not null primary key auto_increment,
ime varchar(50) not null,
prezime varchar(50) not null,
broj varchar(50) not null,
vrsta_id int not null
);

create table vrsta(
id int not null primary key auto_increment,
naziv varchar(50) not null
);

alter table kontakt add foreign key (vrsta_id) references vrsta(id);
