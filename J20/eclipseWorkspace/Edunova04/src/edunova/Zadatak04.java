package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	public static void main(String[] args) {
//		int odkuda=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1.")), dokuda=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2."));
//		
//		int poc=odkuda<dokuda ? odkuda : dokuda;
//		
//		int kraj =dokuda>odkuda ? dokuda : odkuda;
//		
//		for(int i=poc;i<=kraj;i++) {
//			
//			if (i%2==1) {
//				continue;
//			}
//			System.out.println(i);
//		}
		int a=Integer.parseInt(JOptionPane.showInputDialog("A")),b=Integer.parseInt(JOptionPane.showInputDialog("B"));
		int start=a<b ? a : b;
		int kraj=b>a ? b :a;
		
		for (int i =start;i<kraj;i++) {
			if (i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
}
