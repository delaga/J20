package delagic.ljetnizadatak;

import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Delete {
	
	private static PreparedStatement izraz;
	
	public static int BrisanjeIzTablice() {
		Database spajanje=new Database();
		spajanje.getVeza();
		String table = null;
		switch (Select.tablica) {
		case 1:
			 table="klijent_kupac";
			break;
		case 2:
			 table="korisnik";
			break;
		case 3:
			table="podaci_o_obrtu";
			break;
		case 4:
			table="racun";
			break;
		case 5:
			table="stavka";
			break;
		case 6:
			table="usluga_proizvod";
			break;
		default:
			break;
		}
		try {
			izraz=spajanje.veza.prepareStatement("delete from "+table+" where id=?");
			int redak=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj retka kojeg želite obrisatu i tabeli "+table));
			izraz.setInt(1,redak);
			JOptionPane.showConfirmDialog(null, "OBRISAN redak: "+redak);
			
			return izraz.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//gdje da stavim izlistanje nakon brisanja
		//brisanje se izvrši ali ne mogu dobiti da mi izlista kako tablica sada izgleda
		
			
		
		return 0;
		
	}
	
	
	}
	

	

