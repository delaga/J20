drop database if exists ordinacija;
create database ordinacija default character set utf8;
use ordinacija;

create table medicinsko_osoblje(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
kontakt varchar(100),
lijecnik boolean not null default false
);

create table pacijent(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
dijagnoza text
);

create table prijem(
id int not null primary key auto_increment,
pacijent_id int not null,
med_oso_lijecnik_id int not null check (lijecnik.medicinsko_osoblje=true),
med_oso_pomocno_id int not null check (lijecnik.medicinsko_osoblje=false),
vrijeme_prijema datetime not null,
napomena text
);

alter table prijem add foreign key (med_oso_lijecnik_id) references medicinsko_osoblje(id);
alter table prijem add foreign key (med_oso_pomocno_id) references medicinsko_osoblje(id);
alter table prijem add foreign key (pacijent_id) references pacijent(id);

insert into medicinsko_osoblje(ime,prezime,lijecnik) values('Ahmed','Delagić',1),('Sexi','Sestra',0);
insert into pacijent(ime,prezime,dijagnoza) values('Velimir','Bujanec','shizofrenija, misli da je poglavnik');
insert into prijem(pacijent_id,med_oso_lijecnik_id,med_oso_pomocno_id,vrijeme_prijema,napomena) values(1,1,2,current_timestamp,'veži i sedatiraj');

select * from prijem;

alter table prijem add column promjena datetime default current_timestamp on update current_timestamp;

update prijem set napomena='nema nade' where id=1;

select * from prijem;
