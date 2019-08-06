<<<<<<< HEAD
package delagic.ljetnizadatak;

import javax.swing.JOptionPane;

public class Start {
	
	public static void main(String[] args) {
		SelectIzBaze.ispisiTablice();
		izbornikDelanja();
		int radnja=Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
	
		glavna_petlja:
		while(true) {
			switch (radnja) {
			case 1:
				brisanje();
				break;
			case 2:
				dodavanje();
				break;
			case 3:
				mjenjanje();
				break;
			case 4:
				SelectIzBaze.ispisiTablice();
				izbornikDelanja();
				
				break;
			case 5:
				break glavna_petlja;
			default:
				break;
		}
		}
	}

	private static void mjenjanje() {
		// TODO Auto-generated method stub
		
	}

	private static void dodavanje() {
		// TODO Auto-generated method stub
		
	}

	private static void brisanje() {
		// TODO Auto-generated method stub
		
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
=======
package delagic.ljetnizadatak;

import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] args) {
		SelectIzBaze.ispisiTablice();
		izbornikDelanja();
		int radnja=Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
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
>>>>>>> 99b8b9e34a7d12927a958980b9989377458dbfa6
