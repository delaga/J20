package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
	public static void main(String[] args) {
//		int a=23,b=55;
//		for (int i=a;i<=b;i++)  {
//			System.out.println(i);
//		}
		int a=Integer.parseInt(JOptionPane.showInputDialog("A")),b=Integer.parseInt(JOptionPane.showInputDialog("B"));
		
		int pocetak,kraj;
		if(a<b) {
			pocetak=a;
			kraj=b;
		}else {
			pocetak=b;
			kraj=a;
		}
		
		for (int i=pocetak;i<kraj;i++) {
			System.out.println(i);
		}
	}
}
