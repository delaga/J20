drop database if exists edunovaj20v20150515B;
create database edunovaj20v20150515B;
use edunovaj20v20150515B;

create table racun(
id int not null primary key auto_increment,
datum datetime not null,
kupac varchar(55)
);

create table proizvod(
id int not null primary key auto_increment,
naziv varchar(50) not null,
cijena decimal(18,2)
);

create table stavka(
id int not null primary key auto_increment,
proizvod_id int not null,
racun_id int not null,
kolicina decimal(18,3)
);

alter table stavka add foreign key (proizvod_id) references proizvod(id);
alter table stavka add foreign key (racun_id) references racun(id);
