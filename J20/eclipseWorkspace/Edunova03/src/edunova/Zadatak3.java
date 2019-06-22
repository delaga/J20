package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	// Za tri unesena cijela broja
	// ispiši najveæi
	
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
	
		if(i>=j && i>=k) {
			System.out.println(i);
		}else if (k>=i && k>=j) {
			System.out.println(k);
		}else {
			System.out.println(j);
		}
		
		//isto kao i prethodno
		if(i>=j && i>=k) {
			System.out.println(i);
		}else {
			
			if (k>=i && k>=j) {
				System.out.println(k);
			}else {
				System.out.println(j);
			}
		}
	
	}

}
