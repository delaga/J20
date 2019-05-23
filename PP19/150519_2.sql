drop database if exists pp150519_2;
create database pp150519_2;
use pp150519_2;

create table sponzor(
id int not null primary key auto_increment,
ime_ili_naziv varchar(55) not null
);

create table kustos(
id int not null primary key auto_increment,
ime varchar(55) not null,
prezime varchar(55) not null
);

create table izlozba(
id int not null primary key auto_increment,
naziv varchar(55) not null,
start_datetime datetime,
kustos_id int not null,
sponzor_id int not null,
djelo_id int not null
);

create table djelo(
id int not null primary key auto_increment,
vrsta varchar(55) not null,
naziv varchar(55) not null,
);

alter table izlozba add foreign key (kustos_id) references kustos(id);
alter table izlozba add foreign key (sponzor_id) references sponzor(id);
alter table izlozba add foreign key (djelo_id) references djelo(id);