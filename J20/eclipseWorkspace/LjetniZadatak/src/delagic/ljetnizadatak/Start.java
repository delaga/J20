/*
 * Trebalo bi da izlista tablice u bazi Paušalni_obrt i InputDialog da se unese broj ispred tablice
 * zatim izlista što je trenutno u tablici i ponudi radnje:
 * Brišemo?
 * Dodajemo?
 * Mjenjamo?
 * Povratak na izbor tablice?
 * IZLAZ
 * 
 * PROBLEM 001: ne znam kako da proslijedim u klasu BrisanjeIzTablice odabranu tablicu
 * 				(a onda bih opet SWITCH u odnosu koja je tablica)
 * 
 * 
 */
package delagic.ljetnizadatak;

import javax.swing.JOptionPane;

public class Start {
	public static void main(String[] args) {
		SelectIzBaze.ispisiTablice();
		izbornikDelanja();
		int radnja=Integer.parseInt(JOptionPane.showInputDialog("Unesite redni broj predviðene radnje:"));
		switch (radnja) {
		case 1:
			new BrisanjeIzTablice();
			break;
		case 2:
			new DodavanjeUTablicu();
			break;
		case 3:
			new MjenjanjeuTablici();
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
