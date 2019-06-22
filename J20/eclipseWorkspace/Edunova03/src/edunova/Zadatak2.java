package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// U sluèaju da je zbroj tri unesena cijela broja 
	// veæi od 100
	// ispiši OK, inaèe nemoj ništa ispisati
	
	public static void main(String[] args) {
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("B1")
				);
		int j = Integer.parseInt(
				JOptionPane.showInputDialog("B2")
				);
		int k = Integer.parseInt(
				JOptionPane.showInputDialog("B3")
				);
		
		int zbroj = i+j+k;
		
		if(zbroj>100) {
			System.out.println("OK");
		}
		
				
	}
}
