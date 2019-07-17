<?php
require_once "baza.php";

//echo $veza->getAttribute(PDO::SERVER_INFO);
$izraz=$veza->query("select * from smjer;");
$izraz->execute();
$rezultati=$izraz->fetchAll(PDO::FETCH_OBJ);
echo "<pre>";
//var_dump($rezultati);
echo "</pre>";

foreach($rezultati as $red){
    echo $red->naziv,"<br/>";
}
$zbroj=0;
foreach($rezultati as $red) {
    $zbroj+=$red->cijena;
}
echo $zbroj;

echo $zbroj /count($rezultati);




