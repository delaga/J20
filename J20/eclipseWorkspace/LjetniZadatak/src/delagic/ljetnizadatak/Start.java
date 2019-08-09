
package delagic.ljetnizadatak;

import javax.swing.JOptionPane;

public class Start {

	public static void main(String[] args) {
		Select.ispisiTablice();
		Select.ispisiTablicu(0);
		izbornikDelanja();

	}

	private static void izbornikDelanja() {
		System.out.println(">>>>>>IZBORNIK<<<<<<");
		System.out.println("1. Brišemo?");
		System.out.println("2. Dodajemo?");
		System.out.println("3. Mjenjamo?");
		System.out.println("4. Povratak na izbor tablice?");
		System.out.println("5. IZLAZ");
		int radnja = Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
		// int rad=izbornikDelanja();
		switch (radnja) {
		case 1:
			Delete.BrisanjeIzTablice();
			JOptionPane.showMessageDialog(null, "OBRISANO");
			System.out.println();
			System.out.println(">>>NAKON BRISANJA<<<");
			Select.ispisiTablicu(Select.tablica);
			izbornikDelanja();

			break;
		case 2:
			Insert.DodavanjeUTablicu();
			JOptionPane.showMessageDialog(null, "DODANO");
			System.out.println();
			System.out.println(">>>NAKON DODAVANJA<<<");
			Select.ispisiTablicu(Select.tablica);
			izbornikDelanja();
			break;
		case 3:
			Update.mjenjanjeUTablici();
			JOptionPane.showMessageDialog(null, "PROMJENJENO");
			System.out.println();
			System.out.println(">>>NAKON PROMJENE<<<");
			Select.ispisiTablicu(Select.tablica);
			izbornikDelanja();

			break;
		case 4:
			Select.ispisiTablice();
			break;
		case 5:
			System.out.println();
			System.out.println(">>> Stay beautiful and goodbye :D <<<");
			break;
		default:
			break;
		}
	}

	public static String odabranaTablica() {
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
		return table;

	}
}
