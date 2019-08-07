package delagic.ljetnizadatak;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Insert {
	private static PreparedStatement izraz;
	private static int redak = 0;
	static boolean uspjesno;

	public static int DodavanjeUTablicu() {
		Database spajanje = new Database();
		spajanje.getVeza();
		PreparedStatement izraz;
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

		switch (Select.tablica) {
		case 1:
			try {
				izraz = spajanje.veza.prepareStatement("insert into " + table
						+ "(naziv,adresa,post_broj,grad,drzava,oib_jmbg)" + " values(?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi naziv:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi adresu:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi poštanski broj:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi grad:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi državu:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi OIB ili JMBG:"));
				
				System.out.println(izraz.executeUpdate());

			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 2:
			try {
				izraz=spajanje.veza.prepareStatement("insert into "+table+"(ime,"
						+ "prezime,email,lozinka,mobitel,potpis_url) values(?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi ime:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi prezime:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi e-mail:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi lozinku:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi broj telefona/mobitela:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi URL scan potpisa:"));
				System.out.println(izraz.executeUpdate());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				izraz=spajanje.veza.prepareStatement("insert into "+table+"(naziv,vlasnik,adresa,oib,iban,banka,"
						+ "djelatnost,email,telefon_mobitel,logo_URL) values(?,?,?,?,?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi naziv:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi vlasnika:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi adresu:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi OIB:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi IBAN:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi naziv banke:"));
				izraz.setString(7, JOptionPane.showInputDialog("Unesi djelatnost:"));
				izraz.setString(8, JOptionPane.showInputDialog("Unesi email:"));
				izraz.setString(9, JOptionPane.showInputDialog("Unesi telefon:"));
				izraz.setString(10, JOptionPane.showInputDialog("Unesi URL loga tvrtke"));
				izraz.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				izraz=spajanje.veza.prepareStatement("insert into "+tablica+"(broj_racuna,klijent_kupac_id,"
						+ "vrijeme_idavanja,datum_dospijeca,datum_isporuke,izdao_korisnik_id"
						+ ",napomena,nacin_placanja) values(?,?,?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi broj raèuna:"));
				izraz.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Unesi šifru klijenta/kupca")));
				//sranje, nastavljam sutra: izraz.setDate(3, Date.parse(JOptionPane.showInputDialog("Unesi datum ")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			break;
		}
		return 0;
	}

}
