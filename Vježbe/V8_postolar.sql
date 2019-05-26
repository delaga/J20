drop database if exists postolar;
create database postolar default character set utf8;
use postolar;

create table klijent(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
kontakt varchar(100),
napomena text,
vrijeme_kreiranja datetime not null default current_timestamp,
vrijeme_promjene datetime not null default current_timestamp on update current_timestamp
);

create table obuca(
id int not null primary key auto_increment,
vrsta varchar(22) not null,
opis text,
klijent_id int not null
);

create table popravak(
id int not null primary key auto_increment,
opis_popravka varchar(150) not null,
cijena decimal(18,2) not null,
kolicina int not null default 1,
sa_segrtom boolean default false,
obuca_id int not null
);

alter table obuca add foreign key (klijent_id) references klijent(id);
alter table popravak add foreign key (obuca_id) references obuca(id);

insert into klijent(ime,prezime,kontakt,napomena) values('Željka','Markić',null,'smrde joj noge. PAKLENO!'),('Stari','Joza','mob: 098 123 123','nema noge');
insert into obuca(vrsta,opis,klijent_id) values('nanule','raspale se od bada',1),('cipele','sve OK',2);
insert into popravak(opis_popravka,cijena,kolicina,sa_segrtom,obuca_id) values('zamjeni sve podložno raspadanju od znoja debelih žena',999.99,2,true,1),('samo prebriši i vrati',0,1,false,2);

select * from klijent;
select * from obuca;
select * from popravak;

alter table klijent add column kreten boolean default true;
update klijent set kreten=0 where id=2;
update klijent set kontakt='deri se sa druge planine' where id=1;
select * from klijent;
