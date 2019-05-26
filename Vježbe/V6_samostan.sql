drop database if exists samostan;
create database samostan default character set utf8;
use samostan;

create table posao(
id int not null primary key auto_increment,
naziv_opis varchar(22) not null,
);

create table svecenik(
id int not null primary key auto_increment,
ime varchar(33) not null,
prezime varchar(33) not null,
svecenik_id int not null,
vrijeme_kreiranja datetime not null default current_timestamp
);

create table korektna_sljaka(
id int not null primary key auto_increment,
vrijeme datetime not null,
posao_id int not null,
svecenik_id int not null
);

alter table svecenik add foreign key (svecenik_id) references svecenik(id);
alter table korektna_sljaka add foreign key (posao_id) references posao(id);
alter table korektna_sljaka add foreign key (svecenik_id) references svecenik(id);
