drop database if exists frizerski_salon;
create database frizerski_salon default character set utf8;
use frizerski_salon;

create table osoba(
id int not null primary key auto_increment,
ime varchar(22) not null,
prezime varchar(22) not null,
email varchar(44)
);

create table usluga(
id int not null primary key auto_increment,
naziv varchar(22) not null,
opis text,
cijena decimal(18,2)
);

create table djelatnica(
id int not null primary key auto_increment,
osoba_id int not null,
iban varchar(32)
);

create table korisnik(
id int not null primary key auto_increment,
osoba_id int not null
);

create table dogadjaj(
id int not null primary key auto_increment,
vrijeme_dog datetime,
usluga_id int not null,
korisnik_id int not null,
djelatnica_id int not null
);

alter table dogadjaj add foreign key (usluga_id) references usluga(id);
alter table dogadjaj add foreign key (korisnik_id) references korisnik(id);
alter table dogadjaj add foreign key (djelatnica_id) references djelatnica(id);
alter table djelatnica add foreign key (osoba_id) references osoba(id);
alter table korisnik add foreign key (osoba_id) references osoba(id);

insert into osoba(ime,prezime) values('Iva','Ivić'),('Josip','Kraš');
insert into usluga(naziv) values('Šišanje'),('Ž frizura'),('Bojanje');
insert into djelatnica(osoba_id) values(1);
insert into korisnik(osoba_id) values(2);
insert into dogadjaj(vrijeme_dog,usluga_id,korisnik_id,djelatnica_id) values('2019-05-25 15:00:00',1,1,1);

update usluga set cijena=12.99 where id=1;
update djelatnica set iban='HR9325000095657746874' where id=1;

insert into osoba(ime,prezime) values('Adolf','Hitler');
select * from osoba;
select id from osoba where ime='Adolf'; 
delete from osoba where id=3;

