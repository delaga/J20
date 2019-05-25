drop database if exists vrtic;
create database vrtic default character set utf8;
use vrtic;

create table osoba(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
kontakt varchar(100) 
);

create table odgajatelj(
id int not null primary key auto_increment,
osoba_id int not null,
strucna_sprema varchar(10),
iban varchar(32)
);

create table dijete(
id int not null primary key auto_increment,
osoba_id int not null,
datum_rodjenja date
);

create table skupina(
id int not null primary key auto_increment,
naziv varchar(22) not null,
odgajatelj_id int not null,
dijete_id int not null,
vrijeme_kreiranja datetime not null default current_timestamp
);

alter table odgajatelj add foreign key (osoba_id) references osoba(id);
alter table dijete add foreign key (osoba_id) references osoba(id);
alter table skupina add foreign key (odgajatelj_id) references odgajatelj(id);
alter table skupina add foreign key (dijete_id) references dijete(id);

insert into osoba(ime,prezime) values('Bat','Man'),('Veliki','Blek'),('Pipin','Mali');
insert into odgajatelj(osoba_id,strucna_sprema) values(1,'VSS');
insert into dijete(osoba_id,datum_rodjenja) values(2,'2014-09-09'),(3,'2015-02-09');
insert into skupina(naziv,odgajatelj_id,dijete_id) values('Plava',1,1),('Plava',1,2);

select * from skupina;
alter table skupina drop column vrijeme_kreiranja;
select * from skupina;