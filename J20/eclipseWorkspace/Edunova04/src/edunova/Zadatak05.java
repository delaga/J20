package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	public static void main(String[] args) {
//	int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi"));
//	boolean prosti=true;
//	for(int i=2;i<b;i++) {
//		if(b%i==0) {
//			prosti=false;
//			break;
//		}
//		
//	}
//	if(prosti) {
//		System.out.println(b+ " je P");
//	}else {
//		System.out.println(b+ " nije P");
//	}
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		boolean jeProsti=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				jeProsti=false;
				break;
			}
		}
		if(jeProsti) {
			System.out.println(a+" je prosti");
		} else {
			System.out.println(a+" nije prosti");
		}
}
}
