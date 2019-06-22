package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi"));
		System.out.println(a + "+" + b + "=" + (a + b));

	}
}
