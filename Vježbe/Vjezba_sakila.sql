select * from film;

select title from film where release_year>'2006';
select title from film where title like 'B%';

select * from actor;

select concat(first_name,' ',last_name) from actor;
select concat(first_name,' ',last_name) as 'Ime i prezime' from actor;

select concat(first_name,' ',last_name) as 'Ime i prezime' from actor where last_name like 'D%';
select film_id from film_actor where actor_id=2;
select * from film where film_id in(select film_id from film_actor where actor_id=2);
