package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public Zadatak02() {
		while(true) {
			try {
				System.out.println(Integer.parseInt(JOptionPane.showInputDialog("Daj broj")));
				break;
			} catch (Exception e) {
				System.out.println("Niste unjeli broj");
			}
		}
	}
	public static void main(String[] args) {
		new Zadatak02();
	}
}
