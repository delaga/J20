package edunova;

public class RadSStringKlasom {

	public static void main(String[] args) {
		
		//deklarirao i konstruirao u jednom redu
		String s = new String();
		
		//vrijedi jedino za String
		String ime="";
		
		//PROÈITATI
		//https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
		
		ime = "Edunova";
		
		ime = ime + " Osijek a";
		
		String[] djelovi = ime.split(" ");
		
		System.out.println(ime);
		//koliko ima elemenata u nizu djelovi
		System.out.println(djelovi.length);
		//ispisati vrijednost 1. elementa
		System.out.println(djelovi[0]);
		//ispisati zanji element niza djelovi
		System.out.println(djelovi[djelovi.length-1]);
		
		String dio = ime.substring(0,2);
		
		System.out.println(dio);
		
		String stringili="Riba ribi grize rep";
		String razvaljeniString[]=stringili.split(" ");
		System.out.println(razvaljeniString.length);
	
		
		
	}
	
}
