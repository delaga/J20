<?php
require_once "baza.php";
$izraz=$veza->prepare("select * from smjer");
$izraz->execute();
foreach ($izraz ->fetchAll(PDO::FETCH_OBJ) as $red) {
    echo $red->naziv,"<br/>";
}