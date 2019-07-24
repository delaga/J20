<?php include_once "konfiguracija.php";?>
Javni dio
<a href="kontakt.php">Kontakt</a>
<?php 
//$_SESSION["edunova"]="Osijek";
?>
<form action="autoriziraj.php" method="post">
<label>email
    <input type="email" name="email"/>
</label>

<label>Lozinka
    <input type="password" name="lozinka" />
</label>

<input type="submit" value="Autoriziraj">



</form>

<?php
if(isset($_GET["g"])){
  echo $poruke[$_GET["g"]];

}
?>
