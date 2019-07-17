<?php
switch ($_SERVER["REMOTE_ADDR"]) {
    case '127.0.0.1':
            $server="localhost";
            $baza="edunovapp19";
            $korisnik="edunova";
            $lozinka="edunova";
        break;
    case '31.147.185.242':
            $server="localhost";
            $baza="nika_edunova";
            $korisnik="nika_edunova";
            $lozinka="edunova";
        break;
    
}


echo "<pre>";
//print_r($_SERVER);
echo "</pre>";

$veza = new PDO("mysql:dbname=". $baza .";host=" . $server,$korisnik,$lozinka);
