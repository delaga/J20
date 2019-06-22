package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	public static void main(String[] args) {
		double a, b;
		a = Double.parseDouble(JOptionPane.showInputDialog("B1"));
		b = Double.parseDouble(JOptionPane.showInputDialog("B2"));
		System.out.println(a + " - " + b + " = " + (a - b));
		
	}
}
