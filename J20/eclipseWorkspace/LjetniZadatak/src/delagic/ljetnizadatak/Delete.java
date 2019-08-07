package delagic.ljetnizadatak;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JOptionPane;

public class Delete {

	private static PreparedStatement izraz;
	private static int redak = 0;
	static boolean uspjesno;

	public static int BrisanjeIzTablice() {

		Database spajanje = new Database();
		spajanje.getVeza();
		String table = null;
		switch (Select.tablica) {
		case 1:
			table = "klijent_kupac";
			break;
		case 2:
			table = "korisnik";
			break;
		case 3:
			table = "podaci_o_obrtu";
			break;
		case 4:
			table = "racun";
			break;
		case 5:
			table = "stavka";
			break;
		case 6:
			table = "usluga_proizvod";
			break;
		default:
			break;
		}
		try {
			izraz = spajanje.veza.prepareStatement("delete from " + table + " where id=?");
			redak = Integer.parseInt(
					JOptionPane.showInputDialog("Unesite broj retka kojeg želite obrisatu i tabeli " + table));
			izraz.setInt(1, redak);

			return izraz.executeUpdate();

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

		return 0;

	}

}
