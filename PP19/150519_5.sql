drop database if exists pp150519_5;
create database pp150519_5;
use pp150519_5;

create table slika(
id int not null primary key auto_increment,
putanja varchar(100) not null,
kategorija_id int not null
);

create table kategorija(
id int not null primary key auto_increment,
naziv varchar(55),
nadkategorija_id int
);

alter table slika add foreign key (kategorija_id) references kategorija(id);
alter table kategorija add foreign key (nadkategorija_id) references kategorija(id);