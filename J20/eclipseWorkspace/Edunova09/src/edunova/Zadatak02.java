package edunova;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Zadatak02 {
//	public Zadatak02() {
//		while(true) {
//			try {
//				System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Daj broj")));
//				break;
//			} catch (Exception e) {
//				System.out.println("Niste unjeli broj");
//			}
//		}
//	}
//	public static void main(String[] args) {
//		new Zadatak02();
//	}
	
	
	
	public Zadatak02() {
		while (true) {
			try {
				System.out.println(Integer.parseInt(JOptionPane.showInputDialog("DDR broj")));
				//KONTAM: ako izbaci Exep u 27 onda hendla sa Exep i preskoæi Break
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Nije broj");
			} 
		}
	}
	public static void main(String[] args) {
		new Zadatak02();
	}
}
