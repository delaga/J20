package edunova;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	private Connection veza;
	private PreparedStatement izraz;
	public Update() {
		veza=Baza.getConnection();
		updateBezParametar("update smjer set cijena=cijena*1.25 where sifra >=100 and sifra<=150");
		updateBezParametar("update smjer set upisnina=upisnina-100 where sifra like '%2%'");
	}
	
	private void updateBezParametar(String upit) {
		try {
			izraz= veza.prepareStatement(upit);
			System.out.println(izraz.executeUpdate());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

	public static void main(String[] args) {
		new Update();
	}
}
