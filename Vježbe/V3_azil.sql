drop database if exists azil;
create database azil default character set utf8;
use azil;

create table djelatnik(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
oib varchar(11)
);

create table sticenik(
id int not null primary key auto_increment,
naziv varchar(22) not null,
vrsta varchar(22) not null,
opis text
);

create table prostor(
id int not null primary key auto_increment,
naziv varchar(22) not null,
opis text
);

create table dogadjaj(
id int not null primary key auto_increment,
vrijeme datetime not null,
sticenik_id int not null,
djelatnik_id int not null,
prostor_id int not null
);

alter table dogadjaj add foreign key (sticenik_id) references sticenik(id);
alter table dogadjaj add foreign key (djelatnik_id) references djelatnik(id);
alter table dogadjaj add foreign key (prostor_id) references prostor(id);

insert into djelatnik(ime,prezime) values('Dog','Lover'),('Cat','Fornicator');
insert into sticenik(naziv,vrsta,opis) values('Lucky','ćuko','mješanac hoklice i štakora'),('Mamika','micija','stara siva mačka');
insert into prostor(naziv,opis) values('Box1','box za male ćuke'),('Box2','box za micije');
insert into dogadjaj(vrijeme,sticenik_id,djelatnik_id,prostor_id) values('2019-05-15',1,1,1),('2019-05-25',2,2,2);

select * from djelatnik;
select * from sticenik;
select * from prostor;
select * from dogadjaj;

alter table sticenik add column zadnja_promjena datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP;
select * from sticenik;
update sticenik set vrsta='pas' where id=1;
select * from sticenik;