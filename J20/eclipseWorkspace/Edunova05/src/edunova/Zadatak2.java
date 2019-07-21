package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Program unosi dva cijela pozitivna broja
	// ispisuje zbroj
	
	public static void main(String[] args) {
//		int i,j;
//		
//		while(true) {
//			i=Integer.parseInt(JOptionPane.showInputDialog("B1"));
//			if(i>=0) {
//				break;
//			}
//			JOptionPane.showConfirmDialog(null,"B1 neispravan");
//		}
//		
//		
//		while(true) {
//			j=Integer.parseInt(JOptionPane.showInputDialog("B2"));
//			if(j>=0) {
//				break;
//			}
//			JOptionPane.showConfirmDialog(null,"B2 neispravan");
//		}
//		
//		System.out.println(i+j);
		
		int i,j;
		while (true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("Unesi B1"));
			if(i>0) {
				break;
			}
			JOptionPane.showConfirmDialog(null, "de, ne seri");
		}
		while (true) {
			j=Integer.parseInt(JOptionPane.showInputDialog("Unesi B2"));
			if(j>0) {
				break;
			}
			JOptionPane.showConfirmDialog(null, "de, opet ne seri");
		}
		System.out.println(i+j);
	}

}
