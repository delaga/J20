<?php
require_once "baza.php";

$veza->beginTransaction();

$izraz =$veza ->prepare("insert into smjer (naziv,cijena,upisnina,trajanje,certificiran) values(:naziv,1000,500,100,1);");

for ($i=1; $i <=250000 ; $i++) { 
    $izraz->execute(["naziv"=>"Smjer".$i]);
}

$veza->commit();