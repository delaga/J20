<?php
include_once "konfiguracija.php";

if(!$_POST || !isset($_POST["email"]) || !isset($_POST["lozinka"])){
    exit;
}
//auth na bazu
if($_POST["email"]==="edunova@edunova.hr" && $_POST["lozinka"]==="edunova"){
    
    //sve ok
    $_SESSION["autoriziran"]="edunova";
    header("location:privatno.php");
}else{
    //nije ok
    header("location:index.php?g=1");

}


