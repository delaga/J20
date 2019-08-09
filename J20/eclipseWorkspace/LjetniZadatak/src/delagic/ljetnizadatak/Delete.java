package delagic.ljetnizadatak;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;

public class Delete {

	private static PreparedStatement izraz;
	private static int redak = 0;
	static boolean uspjesno;

	public static void BrisanjeIzTablice() {

		Database spajanje = new Database();
		spajanje.getVeza();

		Start.odabranaTablica();

		try {
			izraz = spajanje.veza.prepareStatement("delete from " + Start.odabranaTablica() + " where id=?");
			redak = Integer.parseInt(JOptionPane.showInputDialog(
					"Unesite broj retka kojeg želite obrisati u tabeli " + Start.odabranaTablica() + ":"));
			izraz.setInt(1, redak);

			izraz.executeUpdate();

		} catch (SQLIntegrityConstraintViolationException e) {

			uspjesno = false;
			// e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		if (uspjesno) {
			JOptionPane.showConfirmDialog(null, "OBRISAN redak: " + redak);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry, redak ima FK");
		}

		try {
			spajanje.veza.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
