package edunova;

import javax.swing.JOptionPane;

public class Krug {
	public Krug() {
		double r=Double.parseDouble(JOptionPane.showInputDialog("Unesi polumjer"));
		System.out.println("Promjer je: "+2*r);
		System.out.println("Površina je: "+(Math.pow(r, 2)*Math.PI));
		System.out.println("Opseg je: "+(2*r)*Math.PI);
	}
	public static void main(String[] args) {
		new Krug();
	}
}
