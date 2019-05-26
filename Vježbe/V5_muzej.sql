drop database if exists muzej;
create database muzej default character set utf8;
use muzej;

create table sponzor(
id int not null primary key auto_increment,
naziv_ili_ime varchar(33) not null,
vrijeme_kreiranja datetime not null default current_timestamp,
vrijeme_promjene datetime not null default current_timestamp on update current_timestamp
);

create table kustos(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
vrijeme_kreiranja datetime not null default current_timestamp
);

create table djelo(
id int not null primary key auto_increment,
naziv_ili_ime varchar(33) not null,
opis text,
vrijeme_kreiranja datetime not null default current_timestamp
);

create table izlozba(
id int not null primary key auto_increment,
naziv_ili_ime varchar(33) not null,
predvidjeni_pocetak datetime,
kustos_id int not null,
sponzor_id int not null
);

create table djelo_izlozba(
djelo_id int not null,
izlozba_id int not null
);

alter table izlozba add foreign key (kustos_id) references kustos(id);
alter table izlozba add foreign key (sponzor_id) references sponzor(id);
alter table djelo_izlozba add foreign key (djelo_id) references djelo(id);
alter table djelo_izlozba add foreign key (izlozba_id) references izlozba(id);

insert into sponzor(naziv_ili_ime) values('Josip Pejaković & son'),('HEP'),('Unikom');
insert into kustos(ime,prezime) values('Kule','Kustosić'),('Marko','Perković');
insert into djelo(naziv_ili_ime,opis) values('Posljednja večera','Leo nacrtao ljude kako jedu'),('Vrisak','pomalo sick slika'),('Venera','bucka bez ruku');

insert into izlozba(naziv_ili_ime,kustos_id,sponzor_id) values('Mjesečna izložba',2,2);

insert into djelo_izlozba(djelo_id,izlozba_id) values(1,1),(2,1);

alter table djelo add column autor varchar(22) not null;

update djelo set autor='Neki talijan' where id=1;

select * from sponzor;
update sponzor set naziv_ili_ime='HEP d.d.' where id=2;
select * from sponzor;
