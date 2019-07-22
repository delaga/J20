<?php
require_once "baza.php";
$izraz=$veza->prepare("insert into smjer(naziv,trajanje,cijena,upisnina,certificiran) 
values(:naziv,:trajanje,:cijena,:upisnina,:verificiran)");
$izraz->execute($_POST);

header("location:index.php");
