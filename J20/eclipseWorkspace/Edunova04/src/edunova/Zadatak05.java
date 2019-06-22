package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	public static void main(String[] args) {
	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi"));
	boolean prosti=true;
	for(int i=2;i<b;i++) {
		if(b%i==0) {
			prosti=false;
			break;
		}
		
	}
	if(prosti) {
		System.out.println(b+ " je P");
	}
}
}
