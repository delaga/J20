<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <?php include_once "head.php" ?>

    <?php require_once "baza.php";
$izraz=$veza->prepare("select * from smjer where sifra=:sifra");
$izraz->execute($_GET);
$smjer=$izraz->fetch(PDO::FETCH_OBJ);
var_dump($smjer);
?>


  </head>
  <body>
    <div class="grid-container">
    
    <form action="promjeni.php" method="post">
    <div class="grid-container">
        <div class="grid-x grid-padding-x">
            
        </div>
            <div class="large-12 cell">
                <a href="index.php" class="alert button expanded">Odustani</a>
            </div>
            
            
            <div class="medium-6 cell">
                <label>Naziv
                    <input type="text" name="naziv" value="<?php echo $smjer->naziv;?>">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Trajanje
                    <input type="text" name="trajanje" value="<?php echo $smjer->trajanje;?>">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Cijena
                    <input type="text" name="cijena" step="0.01" value="<?php echo $smjer->cijena;?>">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Upisnina
                    <input type="text" name="upisnina" step="0.01" value="<?php echo $smjer->upisnina;?>">
                </label>
            </div>
            <div class="large-12 cell">
                <label>Verificiran
                    <select name="verificiran">
                        <option <?php echo $smjer->certificiran ? "selected=\"selected\"" : "" ?>  value="1">Da</option>
                        <option <?php echo !$smjer->certificiran ? "selected=\"selected\"" : "" ?>  value="0">Ne</option>
                    </select>
                </label>
            </div>


            <div class="large-12 cell">
                <input type="hidden" name="sifra" value="<?php echo $smjer->sifra ?>" />
                <input type="submit" value="Dodaj" class="success button expanded" />
            </div>

        </div>
  </div>
</form>
    
    </div>

    <script src="js/vendor/jquery.js"></script>
    <script src="js/vendor/what-input.js"></script>
    <script src="js/vendor/foundation.js"></script>
    <script src="js/app.js"></script>
  </body>
</html>
