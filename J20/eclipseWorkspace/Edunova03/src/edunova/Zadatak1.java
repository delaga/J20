package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	//U sluèaju da je upisani cijeli broj parni
	// ispišite Osijek, inaèe ispišite Vinkovci

	public static void main(String[] args) {
		int i = Integer.parseInt(
				JOptionPane.showInputDialog("B")
				);
		
		//boolean paran = i % 2 == 0;
		
		if(i % 2 == 0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Vinkovci");
		}
		
		
		
	}
}
