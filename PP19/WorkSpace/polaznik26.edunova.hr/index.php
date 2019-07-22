<?php require_once "baza.php" ?>
<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <?php include_once "head.php" ?>

    <script src="https://kit.fontawesome.com/8ed8fdbe2e.js"></script>

  </head>
  <body>
    <div class="grid-container">
    <a class="success button expanded" href="dodajnovi.php">Dodaj novi smjer</a>
      <div class="grid-x grid-padding-x">


        <?php 
        
        $izraz=$veza->prepare("select * from smjer");
        $izraz->execute();
        $i=0;
        foreach ($izraz->fetchAll(PDO::FETCH_OBJ) as $red) {
            $i++;
            include "smjerCelija.php";
            if($i===3){
              $i=0;
            }
        }
        
        ?>


      </div>
    </div>

    <script src="js/vendor/jquery.js"></script>
    <script src="js/vendor/what-input.js"></script>
    <script src="js/vendor/foundation.js"></script>
    <script src="js/app.js"></script>
  </body>
</html>
