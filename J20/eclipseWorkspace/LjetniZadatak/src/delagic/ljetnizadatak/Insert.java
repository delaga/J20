package delagic.ljetnizadatak;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

public class Insert {

	static boolean uspjesno;
	public static final String DATE_FORMAT = "dd.MM.yyyy.";

	public static void DodavanjeUTablicu() {
		Database spajanje = new Database();
		spajanje.getVeza();
		PreparedStatement izraz;
		String table = null;

		

		switch (Select.tablica) {
		case 1:
			try {
				izraz = spajanje.veza.prepareStatement("insert into " + Start.odabranaTablica()
						+ "(naziv,adresa,post_broj,grad,drzava,oib_jmbg)" + " values(?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi naziv:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi adresu:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi po�tanski broj:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi grad:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi dr�avu:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi OIB ili JMBG:"));

				System.out.println(izraz.executeUpdate());

			} catch (SQLException e) {
				uspjesno = false;
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				izraz = spajanje.veza.prepareStatement("insert into " + Start.odabranaTablica() + "(ime,"
						+ "prezime,email,lozinka,mobitel,potpis_url) values(?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi ime:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi prezime:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi e-mail:"));
				izraz.setString(4, JOptionPane.showInputDialog("Unesi lozinku:"));
				izraz.setString(5, JOptionPane.showInputDialog("Unesi broj telefona/mobitela:"));
				izraz.setString(6, JOptionPane.showInputDialog("Unesi URL scan potpisa:"));
				System.out.println(izraz.executeUpdate());
			} catch (SQLException e) {
				uspjesno = false;
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				izraz = spajanje.veza.prepareStatement("insert into " + Start.odabranaTablica() + "(naziv,vlasnik,adresa,oib,iban,banka,"
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
				uspjesno = false;
				e.printStackTrace();
			}
			break;
		case 4:
			try {
				izraz = spajanje.veza.prepareStatement("insert into " + Start.odabranaTablica() + "(broj_racuna,klijent_kupac_id,"
						+ "vrijeme_idavanja,datum_dospijeca,datum_isporuke,izdao_korisnik_id"
						+ ",napomena,nacin_placanja) values(?,?,?,?,?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi broj ra�una:"));
				izraz.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Unesi �ifru klijenta/kupca")));
				izraz.setDate(3,
						new java.sql.Date(unosDatum("Unesi datum izdavanja ra�una. Format:" + DATE_FORMAT).getTime()));
				izraz.setDate(4,
						new java.sql.Date(unosDatum("Unesi datum dospije�a ra�una. Format:" + DATE_FORMAT).getTime()));
				izraz.setDate(5, new java.sql.Date(unosDatum("Unesi datum isporuke. Format:" + DATE_FORMAT).getTime()));
				izraz.setInt(6, Integer.parseInt(JOptionPane.showInputDialog("Unesi �ifru djelatnika:")));
				izraz.setString(7, JOptionPane.showInputDialog("Unesi napomenu"));
				izraz.setString(8, JOptionPane.showInputDialog("Unesi na�in pla�anja:"));
				izraz.executeQuery();
			} catch (SQLException e) {
				uspjesno = false;
				e.printStackTrace();
			}
			break;

		case 5:
			try {
				izraz = spajanje.veza.prepareStatement(
						"insert into " + Start.odabranaTablica() + "(usluga_proizvod_id,racun_id" + ",rabat,kolicina) values(?,?,?,?)");
				izraz.setInt(1, Integer.parseInt(JOptionPane.showInputDialog("Unesi �ifru usluge ili proizvoda:")));
				izraz.setInt(2, Integer.parseInt(JOptionPane.showInputDialog("Unesi �ifru ra�una:")));
				izraz.setDouble(3, Double.parseDouble(JOptionPane.showInputDialog("Unesi rabat (%):")));
				izraz.setDouble(4, Double.parseDouble(JOptionPane.showInputDialog("Unesi koli�inu:")));
				izraz.executeQuery();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 6:
			try {
				izraz = spajanje.veza.prepareStatement(
						"insert into " + Start.odabranaTablica() + "(naziv,opis,jedinica_mjere,cijena) values (?,?,?,?)");
				izraz.setString(1, JOptionPane.showInputDialog("Unesi naziv usluge ili proizvoda:"));
				izraz.setString(2, JOptionPane.showInputDialog("Unesi opis usluge ili proizvoda:"));
				izraz.setString(3, JOptionPane.showInputDialog("Unesi mjernu jedinicu usluge ili proizvoda:"));
				izraz.setDouble(4,
						Double.parseDouble(JOptionPane.showInputDialog("Unesi cijenu usluge ili proizvoda:")));
				izraz.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			break;
		}
		// return 0;
	}

	public static java.util.Date unosDatum(String poruka) {

		SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);
		while (true) {

			try {
				return df.parse(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Obavezan unos u formatu: " + DATE_FORMAT
						+ "\nPrimjer na dana�njem datumu:" + df.format(new Date(0)));
			}

		}

	}

}
