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

#filanje baze
insert into vozac(ime,prezime) values('Sara','Bertić'),('Moša','Pijade'),('Svetozar','Pribičević');
insert into putnik(ime,prezime) values('Željko','Kerum'),('Ivo','Sanader'),('Onaj čudni','Batarelo');
insert into vozilo(tip,opis,vozac_id) values('kombi','neki mali usrani',3),('limuzina','bembara',2),('smart','ženski roza',1);
insert into voznja(trajanje,datum,vozilo_id) values('02:00:00','2019-03-30',1),('00:30:00','2019-04-04',2),('01:15:00','2019-05-15',3);
insert into voznja_putnik(voznja_id,putnik_id) values(3,3),(1,1),(2,2);

#malo ceprkanje po bazi
select * from vozac;
select * from putnik;
select * from vozilo;
select * from voznja;
select * from voznja where datum>'2019-04-01' and datum<'2019-05-01';

alter table vozac add column kontakt varchar(100);
update vozac set kontakt='blabla@bla.com' where id>1;