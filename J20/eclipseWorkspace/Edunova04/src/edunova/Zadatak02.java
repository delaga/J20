package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
		int ukupan=Integer.parseInt(JOptionPane.showInputDialog("Ukupan?"));
		int[] niz=new int[ukupan];
		
		for(int i=0;i<ukupan;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi ocjenu"));
			
		}
		System.out.println(Arrays.toString(niz));
		
		int zbroj=0;
		for(int i=0;i<niz.length;i++) {
			zbroj+=niz[i];
			
		}
		System.out.println(zbroj/(float)ukupan);
	}
}
