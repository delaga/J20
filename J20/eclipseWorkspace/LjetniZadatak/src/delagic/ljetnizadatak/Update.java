package delagic.ljetnizadatak;

import java.sql.Date;
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
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set ime=?,prezime=?,email=?,lozinka=?,mobitel=?," + "potpis_URL=? where id=" + redak);
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
			break;
		case 3:
			try {
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set naziv=?,vlasnik=?,adresa=?,"
						+ "oib=?,iban=?,banka=?,djelatnost=?,email=?,telefon_mobitel=?,logo_URL=? where id=" + redak);
				izraz.setString(1, JOptionPane.showInputDialog("Unesi novi naziv"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi novog vlasnika"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi novu adresu"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi novi OIB"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi novi IBAN"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi novi naziv banke"));
				izraz.setString(7, JOptionPane.showInputDialog("Unesi novu djelatnost"));
				izraz.setString(8, JOptionPane.showInputDialog("Unesi novi email"));
				izraz.setString(9, JOptionPane.showInputDialog("Unesi novi telefon ili mobitel"));
				izraz.setString(10, JOptionPane.showInputDialog("Unesi novi URL scana loga:"));
				izraz.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set broj_racuna=?,klijent_kupac_id=?,"
						+ "vrijeme_idavanja=?,datum_dospijeca=?,datum_isporuke=?,izdao_korisnik_id=?,napomena=?,"
						+ "nacin_placanja=? where id=" + redak);
				izraz.setString(1, JOptionPane.showInputDialog("Unesi novi broj raèuna:"));
				izraz.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Unesi šifru klijenta ili kupca:")));
				izraz.setDate(3, new java.sql.Date(
						Insert.unosDatum("Unesi datum izdavanja raèuna. Format:" + Insert.DATE_FORMAT).getTime()));
				izraz.setDate(4, new java.sql.Date(
						Insert.unosDatum("Unesi datum dospijeèa raèuna. Format:" + Insert.DATE_FORMAT).getTime()));
				izraz.setDate(5, new java.sql.Date(
						Insert.unosDatum("Unesi datum isporuke. Format:" + Insert.DATE_FORMAT).getTime()));
				izraz.setInt(6, Integer.parseInt(JOptionPane.showInputDialog("Unesi šifru korisnika:")));
				izraz.setString(7, JOptionPane.showInputDialog("Unesi napomenu:"));
				izraz.setString(8, JOptionPane.showInputDialog("Unesi naèin plaèanja:"));
				izraz.executeQuery();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			break;
		case 5:
			try {
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set usluga_proizvod_id=?," + "racun_id=?,rabat=?,kolicina=? where id=" + redak);
				izraz.setInt(1, Integer.parseInt(JOptionPane.showInputDialog("Unesi šifru usluge ili proizvoda:")));
				izraz.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Unesi šifru raèuna:")));
				izraz.setDouble(3, Double.parseDouble(JOptionPane.showInputDialog("Unesi rabat (%):")));
				izraz.setDouble(4, Double.parseDouble(JOptionPane.showInputDialog("Unesi koliæinu:")));
				izraz.executeQuery();

			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			break;
		case 6:
			try {
				izraz = spajanje.veza.prepareStatement("update " + Start.odabranaTablica()
						+ " set naziv=?,opis=?,jedinica_mjere=?," + "cijena=? where id=" + redak);
				izraz.setString(1, JOptionPane.showInputDialog("Unesi naziv usluge ili proizvoda:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi opis usluge ili proizvoda:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi jedinicu mjeru usluge ili proizvoda:"));
				izraz.setDouble(4, Double.parseDouble(JOptionPane.showInputDialog("Unesi cijenu:")));
				izraz.executeQuery();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		default:
			break;
		}
		try {
			spajanje.veza.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
