package edunova;

import javax.swing.JOptionPane;

public class Zadatak6 {

	// Koriste�i petlje po izboru
	// prona�i najmanji prim (prosti) broj - prime number
	// izme�u dva unesena broja
	
	public static void main(String[] args) {
//		
//		int odKuda = Integer.parseInt(JOptionPane.showInputDialog("OD"));
//		int doKuda = Integer.parseInt(JOptionPane.showInputDialog("DO"));
//		int poc = odKuda<=doKuda ? odKuda : doKuda;
//		int kraj = doKuda>=odKuda ? doKuda : odKuda;
//		boolean pronasao=false;
//		boolean prim;
//		for(int i=poc;i<=kraj;i++) {
//			prim=true;
//			for(int t=2;t<i;t++) {
//				if(i%t==0) {
//					prim=false;
//					break;
//				}
//			}
//			if(prim) {
//				System.out.println(i);
//				pronasao=true;
//				break;
//			}
//		}
//		
//		if(!pronasao) {
//			System.out.println("Ne postoji prim broj izme�u dva unesena broja");
//		}
		//Unos
		int odkud=Integer.parseInt(JOptionPane.showInputDialog("Krece od:"));
		int dokud=Integer.parseInt(JOptionPane.showInputDialog("Krece do:"));
		
		//provjera i podesi da je kreten stvarno unjeo ve�i pa manji
		int start=odkud<=dokud ? odkud:dokud;
		int kraj=dokud>=odkud ? dokud:odkud;
		//tra�i prosti u rangeu
		boolean pronasao=false;
		boolean prim;
		for(int i=start;i<=kraj;i++) {
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
			System.out.println("Ne postoji primarni u rangeu");
		}
	}
}
