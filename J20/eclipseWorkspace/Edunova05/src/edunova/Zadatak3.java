package edunova;

import javax.swing.JOptionPane;

public class Zadatak3 {
	
	// Program unosi broj veæi od 1000
	// program ispisuje sve parne brojeve
	// od broja 0 do unesenog broja jedno 
	// pokraj drugog u redu odvojeno zarezom 
	// po 10 u redu
	
	
	public static void main(String[] args) {
//		int i;
//		
//		while(true) {
//			i=Integer.parseInt(JOptionPane.showInputDialog("B"));
//			if(i>1000) {
//				break;
//			}
//			JOptionPane.showConfirmDialog(null, ">1000 mora");
//		} // end while
//		
//		for(int t = 1;t<=i;t++) {
//			if(t%2==0) {
//				System.out.print(t + ", ");
//			}
//			if( t%20==0) {
//				System.out.println();
//			}
//		}
//		
//		
		int i;
		while (true) {
			i=Integer.parseInt(JOptionPane.showInputDialog("B:"));
			if(i>1000) {
				break;			
			} JOptionPane.showConfirmDialog(null, "ne seri");	
		}
		for(int a=1;a<=1000;a++) {
			if(a%2==0) {
				System.out.print(a+", ");
			}
			if(a%20==0) {
				System.out.println("d");
			}
		}
	}

}
