package edunova;

import javax.swing.JOptionPane;

public class Metode {

	// 1. može imati naèini pristupa metodama
	//public
	//private
	//https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
	
	// 2. može imati oznaku static i final
	
	// 3. mora imati tip podatka ili void
	// ako ima tip podatka ponaša se kao fukncija => vraæa vrijednost
	// ako ima void ponaša se kao procedura
	
	// 4. mora imati ime 
	
	// 5. mora imati listu parametara koju prima. Odvojeni su zarezom
	public static void main(String[] ff) {
		
		
		//A1.
		ispisiVrijeme();
		
		// A2.
		int ttt=Integer.parseInt(JOptionPane.showInputDialog("B"));
		zbroji(ttt, 7);
		
		// A3. mi smo ovdje pozivatelj i nama se vraæa
		//najmanjiIntBroj(); // vratilo se ovdje ali baèeno u vjetar
		najmanjiIntBroj();
		//System.out.println(n);
		System.out.println(najmanjiIntBroj());
		
		
		// A4.
		long p = produkt(2, 3);
		//p+=2;
		System.out.println(p);

		
		
	}
	
	//static æemo napustiti kada krenemo u OOP
	//ovdje za sada sve æe metode biti static
	
	// A1. metoda ne prima parametar i ne vraæa vrijednost
	
	static void ispisiVrijeme() {
		System.out.println(System.currentTimeMillis()); //unix epoch time
	}
	
	// A2. metoda prima dva parametra i ne vraæa vrijednost
	private static void zbroji(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	// A3. metoda koja vraæa vrijednost a ne prima parametra
	
	static int najmanjiIntBroj() {
		System.out.println("Izvoðenje najmanjiIntBroj");
		return Integer.MIN_VALUE;
	}
	
	// A4. metoda prima parametre i vraæa vrijednost
	protected static long produkt(int a, int b) {
		return a*b;
	}
	
	

}
