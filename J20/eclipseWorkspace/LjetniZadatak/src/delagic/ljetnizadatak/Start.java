
package delagic.ljetnizadatak;

import javax.swing.JOptionPane;

public class Start {
	
	
	public static void main(String[] args) {
		Select.ispisiTablice();
		izbornikDelanja();
		int radnja=Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
		
		switch (radnja) {
		case 1:
			Delete.BrisanjeIzTablice();
			System.out.println(Select.tablica);
			
			
			break;
		case 2:
			new Insert();
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		default:
			break;
		}
	}

	private static void izbornikDelanja() {
		System.out.println(">>>>>>IZBORNIK<<<<<<");
		System.out.println("1. Brišemo?");
		System.out.println("2. Dodajemo?");
		System.out.println("3. Mjenjamo?");
		System.out.println("4. Povratak na izbor tablice?");
		System.out.println("5. IZLAZ");
		
	}
}
