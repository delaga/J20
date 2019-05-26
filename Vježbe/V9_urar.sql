drop database if exists urar;
create database urar default character set utf8;
use urar;

create table klijent(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
kontakt varchar(22)
);

create table popravak(
id int not null primary key auto_increment,
vrsta varchar(33) not null,
cijena decimal(19,2)
);

create table sat(
id int not null primary key auto_increment,
opis varchar(55) not null,
opis_kvara text,
klijent_id int not null
);

create table dogadjaj(
id int not null primary key auto_increment,
vrijeme_zaprimanja datetime not null default current_timestamp,
kolicina int not null,
sat_id int not null,
popravak_id int not null
);

alter table sat add foreign key (klijent_id) references klijent(id);
alter table dogadjaj add foreign key (sat_id) references sat(id);
alter table dogadjaj add foreign key (popravak_id) references popravak(id);

alter table klijent add column kreiran datetime not null default current_timestamp;

insert into klijent(ime,prezime,kontakt) values('Pero','Perić',null),('Jozo','Jozić','jjjj@jjj.com');
insert into popravak(vrsta,cijena) values('mjenjanje baterije',null),('mjenjanje stakla',199.99);
insert into sat(opis,opis_kvara,klijent_id) values('Casio',null),1),('neki',null,2);
insert into dogadjaj(vrijeme_zaprimanja,kolicina,sat_id,popravak_id) values('2019-11-11',1,1,1);
