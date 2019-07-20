package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	// Program unosi cijeli broj
	// Program ispisuje apsolutnu vrijednost broja
	
	public Zadatak6() {
		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		System.out.println(Math.abs(i));
		
		
	}
	public static void main(String[] args) {
		new Zadatak6();
	}
}

