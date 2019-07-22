<div class="large-4 cell">
    <div class="<?php echo $i===1 ? "warning ": ($i===2 ? "success " : "alert ") ; ?>callout">
        <h1><?php echo $red->naziv; ?></h1>
        <?php echo $red->trajanje; ?>
        <hr>

        <div class="grid-x grid-padding-x">
            <div class="large-6 cell">
                <a href="promjena.php?sifra=<?php echo $red->sifra; ?>">
                    <i class="fas fa-edit fa-2x" style="color:green;"></i>
                </a>
            </div>
            <div class="large-6 cell">
                <a onclick="return confirm('Jeste li sigurni')" href="brisanje.php?sifra=<?php echo $red->sifra; ?>">
                    <i class="fas fa-trash-alt fa-2x"style="color:red;"></i>
                </a>
            </div>
        </div>
    </div>
</div>