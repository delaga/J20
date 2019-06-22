package edunova;

import javax.swing.JOptionPane;

public class PrimitivniTipoviPodataka {
		
	public static void main(String[] args) {
		//deklariranje varijable
		int godine;
		
		//dodjeljivanje vrijednosti
		godine=22;
		//korištenje vrijednosti varijable
		System.out.println(godine);
		//int je primitivni tip
		//nema svojstva
		//godine. -> nema liste
		//Integer je wraper klasa
		System.out.println(Integer.MAX_VALUE+1);
		/*
		int i=Integer.parseInt("34");
		System.out.println(i);
		
		i=Integer.parseInt(
				JOptionPane.showInputDialog("Unesi broj")
				);
		System.out.println(i);
			*/	
		//tipovi podataka
		boolean aktivan=true;
		byte b=12;
		short s=12134;
		int integer=2345431;
		long jakoVelikiBroj=222;
		float f=1.2F;
		double d=1.2;
		char z='A';
		
		//imaju omotaæe
		System.out.println(Boolean.TRUE);
		System.out.println(Byte.SIZE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Character.isDigit('A'));
	}
	
}
