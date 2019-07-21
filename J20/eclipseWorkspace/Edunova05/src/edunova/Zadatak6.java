package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	// Koristeæi petlje po izboru
	// pronaæi najmanji prim (prosti) broj - prime number
	// izmeðu dva unesena broja
	
	public static void main(String[] args) {
		
		int odKuda = Integer.parseInt(JOptionPane.showInputDialog("OD"));
		int doKuda = Integer.parseInt(JOptionPane.showInputDialog("DO"));
		int poc = odKuda<=doKuda ? odKuda : doKuda;
		int kraj = doKuda>=odKuda ? doKuda : odKuda;
		boolean pronasao=false;
		boolean prim;
		for(int i=poc;i<=kraj;i++) {
			prim=true;
			for(int t=2;t<i;t++) {
				if(i%t==0) {
					prim=false;
					break;
				}
			}
			if(prim) {
				System.out.println(i);
				pronasao=true;
				break;
			}
		}
		
		if(!pronasao) {
			System.out.println("Ne postoji prim broj izmeðu dva unesena broja");
		}
		
	}
}
