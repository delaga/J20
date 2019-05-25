drop database if exists frizerski_salon;
create database frizerski_salon default character set utf8;
use frizerski_salon;

create table osoba(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
email varchar(44)
);

create table usluga(
id int not null primary key auto_increment,
naziv varchar(22) not null,
opis text,
cijena decimal(18,2)
);

create table djelatnica(
id int not null primary key auto_increment,
osoba_id int not null,
iban varchar(32)
);

create table korisnik(
id int not null primary key auto_increment,
osoba_id int not null
);

create table dogadjaj(
id int not null primary key auto_increment,
vrijeme_dog datetime,
usluga_id int not null,
korisnik_id int not null,
djelatnica_id int not null
);

alter table dogadjaj add foreign key (usluga_id) references usluga(id);
alter table dogadjaj add foreign key (korisnik_id) references korisnik(id);
alter table dogadjaj add foreign key (djelatnica) references djelatnica(id);
alter table djelatnica add foreign key (osoba_id) references osoba(id);
alter table korisnik add foreign key (osoba_id) references osoba(id);
