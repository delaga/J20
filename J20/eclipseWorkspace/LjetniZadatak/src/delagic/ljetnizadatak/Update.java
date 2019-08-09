package delagic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Update {
	public static void mjenjanjeUTablici() {
		Database spajanje = new Database();
		spajanje.getVeza();
		PreparedStatement izraz;
		String table = null;
		int redak = Integer.parseInt(JOptionPane.showInputDialog("Broj redka (šifra) kojeg mjenjamo:"));

		switch (Select.tablica) {
		case 1:
			try {
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set naziv=?,adresa=?,post_broj=?,grad=?,drzava=?," + "oib_jmbg=? where id=" + redak);
				izraz.setString(1, JOptionPane.showInputDialog("Unesi novi naziv:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi novu adresu:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi novi poštanski broj:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi novi grad:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi novu državu:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi novi OIB ili JMBG:"));
				izraz.executeQuery();

			} catch (SQLException e) {
				e.printStackTrace();
			}

			break;
		case 2:
			try {
				izraz=spajanje.veza.prepareStatement("update "+Start.odabranaTablica()+" set ime=?,prezime=?,email=?,lozinka=?,mobitel=?,"
						+ "potpis_URL=? where id="+redak);
				izraz.setString(1, JOptionPane.showInputDialog("Unesi novo ime:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi novo prezime:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi novi e-mail:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi novu lozinku:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi novi broj telefona ili mobitela:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi novi URL scana potpisa:"));
				izraz.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		default:
			break;
		}

	}
}
