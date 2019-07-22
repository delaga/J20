<?php
require_once "baza.php";
$izraz=$veza->prepare("delete from smjer where sifra=:sifra");


$izraz->execute($_GET);

header("location:index.php");
