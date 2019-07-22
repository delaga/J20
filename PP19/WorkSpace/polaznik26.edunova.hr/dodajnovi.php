<!doctype html>
<html class="no-js" lang="en" dir="ltr">
  <head>
    <?php include_once "head.php" ?>

    

  </head>
  <body>
    <div class="grid-container">
    
    <form action="dodaj.php" method="post">
    <div class="grid-container">
        <div class="grid-x grid-padding-x">
            
        </div>
            <div class="large-12 cell">
                <a href="index.php" class="alert button expanded">Odustani</a>
            </div>
            
            
            <div class="medium-6 cell">
                <label>Naziv
                    <input type="text" name="naziv">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Trajanje
                    <input type="text" name="trajanje">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Cijena
                    <input type="text" name="cijena" step="0.01">
                </label>
            </div>
            <div class="medium-6 cell">
                <label>Upisnina
                    <input type="text" name="upisnina" step="0.01">
                </label>
            </div>
            <div class="large-12 cell">
                <label>Verificiran
                    <select name="verificiran">
                        <option value="1">Da</option>
                        <option value="0">Ne</option>
                    </select>
                </label>
            </div>
            <div class="large-12 cell">
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
