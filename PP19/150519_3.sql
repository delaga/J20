drop database if exists pp150519_3;
create database pp150519_3;
use pp150519_3;

create table status(
id int not null primary key auto_increment,
korisnik_id int not null,
tekst text not null,
datum datetime not null
);

create table komentar(
id int not null primary key auto_increment,
status_id int not null,
korisnik_id int not null,
datum datetime not null,
komentar text
);

create table korisnik(
id int not null primary key auto_increment,
ime varchar(55) not null,
prezime varchar(55) not null,
email varchar(55) not null
);


alter table status add foreign key (korisnik_id) references korisnik(id);
alter table komentar add foreign key (status_id) references status(id);
alter table komentar add foreign key (korisnik_id) references korisnik(id);