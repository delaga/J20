package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// U slu�aju da je zbroj tri unesena cijela broja 
	// ve�i od 100
	// ispi�i OK, ina�e nemoj ni�ta ispisati
	
	public static void main(String[] args) {
//		int i = Integer.parseInt(
//				JOptionPane.showInputDialog("B1")
//				);
//		int j = Integer.parseInt(
//				JOptionPane.showInputDialog("B2")
//				);
//		int k = Integer.parseInt(
//				JOptionPane.showInputDialog("B3")
//				);
//		
//		int zbroj = i+j+k;
//		
//		if(zbroj>100) {
//			System.out.println("OK");
		
		int a =Integer.parseInt(JOptionPane.showInputDialog("b1"));
		int b =Integer.parseInt(JOptionPane.showInputDialog("b2"));
		int c =Integer.parseInt(JOptionPane.showInputDialog("b3"));
		
		int zbroj=a+b+c;
		if(zbroj<100) {
			System.out.println(zbroj);
		}else {
			System.err.println("Ve�i je od 100");
		}
		}
		
				
	}

