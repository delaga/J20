<?php

$niz=array(2,3,"Pero",true);
echo "<pre>";
var_dump($niz);
echo "</pre>";
echo "<hr/>";
$x=[2,3,4];


$x=["Osijek","Valpovo","Vukovar"];
echo count($x);
echo "<hr/>";
echo $x[0];
echo "<hr/>";
echo $x[count($x)-1];
echo "<hr/>";
$x=[
    "sifra"=>1,
    "naziv"=>"PHP Programiranje",
    "cijena"=>4999.99
];
echo "<pre>";
var_dump($x);
echo "</pre>";
echo "<hr/>";
$podaci=[
    ["sifra"=>1,"naziv"=>"Prvi"],
    ["sifra"=>2,"naziv"=>"Drugi"],
    ["sifra"=>3,"naziv"=>"Treci"]
];
echo "<pre>";
var_dump($podaci);
echo "</pre>";
echo "<hr/>";
echo $podaci[0]["naziv"];