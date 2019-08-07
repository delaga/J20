
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
		int radnja=Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
		//int rad=izbornikDelanja();
		switch (radnja) {
		case 1:
			Delete.BrisanjeIzTablice();
			JOptionPane.showMessageDialog(null, "OBRISANO");
			System.out.println(">>>NAKON BRISANJA<<<");
			Select.ispisiTablicu(Select.tablica);
			izbornikDelanja();
			
			
			break;
		case 2:
			new Insert();
			break;
		case 3:
			
			break;
		case 4:
			Select.ispisiTablice();
			break;
		case 5:
			System.out.println();
			System.out.println(">>>Stay beautiful and goodbye :D<<<");
			break;
		default:
			break;
		}
	}
}
