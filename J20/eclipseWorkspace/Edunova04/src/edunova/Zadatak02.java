package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
//		int ukupan=Integer.parseInt(JOptionPane.showInputDialog("Ukupan?"));
//		int[] niz=new int[ukupan];
//		
//		for(int i=0;i<ukupan;i++) {
//			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi ocjenu"));
//			
//		}
//		System.out.println(Arrays.toString(niz));
//		
//		int zbroj=0;
//		for(int i=0;i<niz.length;i++) {
//			zbroj+=niz[i];
//			
//		}
//		System.out.println(zbroj/(float)ukupan);
		
		int brojOcjena=Integer.parseInt(JOptionPane.showInputDialog("Broj ocjena:"));
		int[]ocjene=new int[brojOcjena];
		for(int i=0; i<brojOcjena;i++) {
			ocjene[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi ocjenu"));
		}
		System.out.println(Arrays.toString(ocjene));
		
		int zbroj=0;
		for (int i=0;i<brojOcjena-1;i++) {
			zbroj=zbroj+ocjene[i];
		}
		System.out.println("Prosjek je: "+zbroj/(double)brojOcjena);
	}
}
