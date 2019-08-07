package edunova;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	private Connection veza;

	public Insert() {
		veza = Baza.getConnection();
		// primjer1();
		// zadatak1();
		zadatak2();
	}

	private void zadatak2() {

		String naziv;
		try {
			PreparedStatement izraz = veza.prepareStatement(
					"insert into smjer(naziv,trajanje,cijena,upisnina,certificiran) values(?,?,?,?,?)");
			for (int i = 1; i <= 100; i++) {
				naziv = "Smjer" + i;
				System.out.println(naziv);
				// najnosijeRjesenje(naziv);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void zadatak1() {
		try {
			PreparedStatement izraz = veza.prepareStatement("insert into osoba(ime,prezime,email) values(?,?,?)");
			izraz.setString(1, "Goran");
			izraz.setString(2, "Kovaè");
			izraz.setString(3, "gk@gmail.com");

			System.out.println(izraz.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void primjer1() {
		try {
			PreparedStatement izraz = veza.prepareStatement(
					"insert into smjer(naziv,trajanje,cijena,upisnina,certificiran) values(?,?,?,?,?)");
			izraz.setString(1, "Smjer iz jave");
			izraz.setInt(2, 100);
			izraz.setBigDecimal(3, new BigDecimal(2999.99));
			izraz.setBigDecimal(4, new BigDecimal(500));
			izraz.setBoolean(5, false);

			System.out.println(izraz.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void najlosijeRjesenje(String naziv) {
		try {
			PreparedStatement izraz = veza.prepareStatement(
					"insert into smjer(naziv,trajanje,cijena,upisnina,certificiran) values(?,?,?,?,?)");
			izraz.setString(1, naziv);
			izraz.setInt(2, 100);
			izraz.setBigDecimal(3, new BigDecimal(2999.99));
			izraz.setBigDecimal(4, new BigDecimal(500));
			izraz.setBoolean(5, false);

			System.out.println(izraz.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void najboljeRjesenje(String naziv, PreparedStatement izraz) {
		try {

			izraz.setString(1, naziv);
			izraz.setInt(2, 100);
			izraz.setBigDecimal(3, new BigDecimal(2999.99));
			izraz.setBigDecimal(4, new BigDecimal(500));
			izraz.setBoolean(5, false);

			System.out.println(izraz.executeUpdate());

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new Insert();
	}
}
