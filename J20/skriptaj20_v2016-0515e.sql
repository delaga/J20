drop database if exists edunovaj20v20150515e;
create database edunovaj20v20150515e;
use edunovaj20v20150515e;

create table utakmica(
id int not null primary key auto_increment,
datum datetime not null,
stadion varchar(55),
domacin int not null,
gost int not null,
rezultat varchar(10)
);

create table momcad(
id int not null primary key auto_increment,
naziv varchar(55) not null,
mjesto varchar(55) not null
);

alter table utakmica add foreign key (domacin) references momcad(id);
alter table utakmica add foreign key (gost) references momcad(id);
