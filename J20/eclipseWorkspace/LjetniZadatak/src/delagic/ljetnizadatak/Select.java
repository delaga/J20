
package delagic.ljetnizadatak;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Select {

	public static int tablica;

	public static int getTablica() {
		return tablica;
	}

	public static void setTablica(int tablica) {
		Select.tablica = tablica;
	}

	public static void ispisiTablice() {

		try {
			System.out.println();
			Database spajanje = new Database();
			spajanje.getVeza();
			PreparedStatement izraz;
			izraz = spajanje.veza.prepareStatement("show tables");
			ResultSet tablice = izraz.executeQuery();
			int i = 1;
			System.out.println("Odaberi tablicu iz baze Pausalni_obrt1:");
			while (tablice.next()) {

				String t = tablice.getString("Tables_in_pausalni_obrt");
				System.out.println(i + ". " + t);
				i++;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("0. Izlaz");
		System.out.println("11. Otvori ERA u browseru");
		System.out.println("12. Otvori Git");
		System.out.println("_____________________");
		int key = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));

		System.out.println();
		ispisiTablicu(key);

	}

	public static void ispisiTablicu(int key) {
		switch (key) {
		case 1:
			try {
				tablica = 1;
				System.out.println("Tablica klijent_kupac:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement("SELECT * FROM klijent_kupac");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("id") + " " + rs.getString("naziv") + " " + rs.getString("adresa")
							+ " " + rs.getString("post_broj") + " " + rs.getString("grad") + " "
							+ rs.getString("drzava") + " " + rs.getString("oib_jmbg"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 2:
			try {
				tablica = 2;
				System.out.println("Tablica korisnik:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement("SELECT * FROM korisnik");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("id") + " " + rs.getString("ime") + " " + rs.getString("prezime") + " "
							+ rs.getString("email") + " " + rs.getString("lozinka") + " " + rs.getString("mobitel")
							+ " " + rs.getString("potpis_URL"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				tablica = 3;
				System.out.println("Tablica podaci_o_obrtu:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement("SELECT * FROM podaci_o_obrtu");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(
							rs.getString("naziv") + " " + rs.getString("vlasnik") + " " + rs.getString("adresa"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
			break;
		case 4:
			try {
				tablica = 4;
				System.out.println("Tablica racun:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement(
						" select racun.broj_racuna,klijent_kupac.naziv,racun.vrijeme_idavanja, korisnik.ime "
								+ "from racun inner join klijent_kupac on racun.klijent_kupac_id=klijent_kupac.id "
								+ "inner join korisnik on racun.izdao_korisnik_id=korisnik.id;");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("racun.broj_racuna") + " " + rs.getString("klijent_kupac.naziv")
							+ " " + rs.getString("racun.vrijeme_idavanja") + " " + rs.getString("korisnik.ime"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

			break;
		case 5:
			try {
				tablica = 5;
				System.out.println("Tablica stavka:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement(
						"select stavka.id,usluga_proizvod.naziv,racun.broj_racuna,rabat,kolicina from stavka "
								+ "inner join usluga_proizvod on stavka.usluga_proizvod_id=usluga_proizvod.id inner join racun on stavka.racun_id=racun.id");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("stavka.id") + " " + rs.getString("usluga_proizvod.naziv") + " "
							+ rs.getString("racun.broj_racuna") + " " + rs.getDouble("rabat") + " "
							+ rs.getDouble("kolicina"));
				}
				rs.close();
				spajanje.veza.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 6:
			try {
				tablica = 6;
				System.out.println("Tablica usluga_prozvod:");
				Database spajanje = new Database();
				spajanje.getVeza();
				PreparedStatement izraz;
				izraz = spajanje.veza.prepareStatement("select * from usluga_proizvod");
				ResultSet rs = izraz.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt("id") + " " + rs.getString("naziv") + " " + rs.getString("opis") + " "
							+ rs.getString("jedinica_mjere") + " ");
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}

			break;
		case 11:
			String url = "https://github.com/delaga/Pausalni_obrt_ZR/blob/master/izdavanje_racuna_za_pausalni_obrt-ERD.png";
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(URI.create(url));
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		case 12:
			String url2 = "https://github.com/delaga/J20/tree/master/J20/eclipseWorkspace/LjetniZadatak";
			Desktop desktop2 = Desktop.getDesktop();
			try {
				desktop2.browse(URI.create(url2));
			} catch (IOException e) {

				e.printStackTrace();
			}
			break;
		case 0:

			break;
		default:

			break;

		}

	}

}