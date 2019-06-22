package edunova;

import javax.swing.JOptionPane;

public class Zadatak5 {

	// Za unesena dva decimalna broja ispišite 
	// razliku podjeljenu s brojem PI
	
	public static void main(String[] args) {
		float i = Float.parseFloat(
				JOptionPane.showInputDialog("B1")
				);
		
		float j = Float.parseFloat(
				JOptionPane.showInputDialog("B2")
				);
		
		float k = i-j;
		
		System.out.println(k/Math.PI);
	}
	
}
