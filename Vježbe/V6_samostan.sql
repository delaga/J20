drop database if exists samostan;
create database samostan default character set utf8;
use samostan;

create table posao(
id int not null primary key auto_increment,
naziv_opis varchar(22) not null
);

create table svecenik(
id int not null primary key auto_increment,
ime varchar(33) not null,
prezime varchar(33) not null,
svecenik_id int,
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

insert into posao(naziv_opis) values('Pranje podova'),('Pranje suđa'),('Zlostavljanje maloljetnika');
insert into svecenik(ime,prezime,svecenik_id) values('Prle','Primus',null),('Pedo','File',1);
insert into korektna_sljaka(vrijeme,posao_id,svecenik_id) values('2019-01-01 22:00:00',3,2);

select * from svecenik;
update svecenik set prezime='Neko prezime' where id=1;
select * from svecenik;
alter table svecenik drop column vrijeme_kreiranja;
select * from svecenik;