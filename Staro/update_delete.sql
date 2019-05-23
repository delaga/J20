select * from osoba;

#
# nije dobro raditi update bew where-a
#
# postavlja vrijednost 123 na sve oibe u tablici
update osoba set oib='123';
# "vraćanje nazad" -> ne postoji undo
update osoba set oib=null;
# sva imena neka dobiju vrijednosti od prezimena
update osoba set ime=prezime;

select * from smjer;

#insert into smjer (sifra,naziv,trajanje,cijena,upisnina,verificiran)
#values (null,'Smjer 1',130,1599,400,false),
# (null,'Smjer 2',130,2568,400,false);

#umanjiti sve cijene za 10 %
update smjer set cijena=cijena*0.9;

# na upisninu dodati pdv
update smjer set upisnina=upisnina*1.25;

#
# Update s where dijelom
#
#siguran update
# 1. napravi select s samo jednim rezultatom
select * from osoba where sifra=8;

# 2. pripremi update 
update osoba set oib='21585688591', email='isolic@gmail.com'
# i dovuci where iz selecta
where sifra=8;

# 3. korak provjeriti s prvotnom select naredbom
# obrisati tomislav jakopec
# ne može zbog FK
delete from osoba;

select * from predavac;
# e može zbog FK
delete from predavac where sifra=1;

select * from grupa where predavac=1;

# mičem predavača s grupe
update grupa set predavac=null where predavac=1;

# brišem predavača
delete from predavac where sifra=1;

# brišem osobu
delete from osoba where sifra=1;


select * from grupa;


