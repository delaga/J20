package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {
		
		int niz[]= {
				Integer.parseInt(JOptionPane.showInputDialog("a")),Integer.parseInt(JOptionPane.showInputDialog("b"))
		};
		System.out.println(Arrays.toString(niz));
		}
}
