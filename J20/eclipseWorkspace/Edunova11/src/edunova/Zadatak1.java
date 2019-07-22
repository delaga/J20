package edunova;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Zadatak1 {
	public Zadatak1() {
		String znak=JOptionPane.showInputDialog("Unesi znakove koje tražiš:");
		SpajanjeNaMariaDB spajanje= new SpajanjeNaMariaDB();
		spajanje.getVeza();
		try {
			PreparedStatement izraz=spajanje.getVeza().prepareStatement("select ime,prezime from osoba where concat(ime,' ',prezime) like ?");
			izraz.setString(1, "%"+znak+"%");
			ResultSet rs=izraz.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("ime")+" "+rs.getString("prezime"));
								
			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Zadatak1();
	}
}

