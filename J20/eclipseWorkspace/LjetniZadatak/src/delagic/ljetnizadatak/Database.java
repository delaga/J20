package delagic.ljetnizadatak;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	public Connection veza;

	public Connection getVeza() {
		return veza;
	}

	public void setVeza(Connection veza) {
		this.veza = veza;
	}

	public Database() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			veza = DriverManager.getConnection("jdbc:mariadb://134.209.23.129/pausalni_obrt", "edunova", "edunova");

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}