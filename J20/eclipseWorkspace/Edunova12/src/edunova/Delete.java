package edunova;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	private Connection veza;
	private PreparedStatement izraz;
	private Delete() {
		veza=Baza.getConnection();
		primjer1();
	}
	private int primjer1() {
		try {
			izraz=veza.prepareStatement("delete from smjer where sifra =?");
			izraz.setInt(1, 100);
			return izraz.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		new Delete();
	}
}
