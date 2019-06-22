package edunova;

public class UvjetnoGrananjeIf {
	
	public static void main(String[] args) {
	
		int i=0;
		
		boolean uvjet1 = i>=1;
		
		boolean uvjet2 = i<=5;
		
		
		System.out.println(uvjet1);
		System.out.println(uvjet2);
		
		//if radi s boolean tipom podatka
		if(uvjet1) {
			System.out.println("Veæe je od 0");
		}
		
		//ista sintaksa lošije napisana
		//kada nema {} if se primjenjuje samo na prvu liniju nakon njega
		if(uvjet1)
			System.out.println("Veæe je od 0");
			System.out.println("neštp");
		
		//ista funkcionalnost kao u prethodnim primjerima
		if(i>=1) {
			//true grana
			System.out.println("Veæe je od 0");
		}else {
			//false grana
			System.out.println("Nije veæe od 0");
		}
		
		//operator & - boolov operator and
		// provjerava oba uvjeta
		if(uvjet1 & uvjet2) {
			System.out.println("Ocjena je");
		}
		
		//operator && - uvjetovani and
		//u sluèaju ne zadovoljenja prvog uvjeta drugi se ne provjerava
		if(uvjet1 && uvjet2) {
			System.out.println("Ocjena je");
		}
		
		//ugnježðeno
		if(uvjet1) {
			if(uvjet2) {
				System.out.println("Ocjena je");
			}
		}
		
		//operator | - boolov operator ili
		if(uvjet1 | uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}
		
		
		//operator || - uvjetovani ili
		//u sluèaju zadovoljenja prvog uvjeta drugi se ne provjerava
		if(uvjet1 || uvjet2) {
			System.out.println("Jedan je zadovoljen");
		}
		
		//operator ! - boolov operator not
		if(!uvjet1) {
			System.out.println("Prvi uvjet nije zadovoljen");
		}
		
		
		//inline if - tercijarni operator
		//u sluèaju da if i else izvode istu naredbu s razlièitim ishodom
		
		int p = 4;
		
		if(p%2==0) {
			System.out.println("Paran");
		}else {
			System.out.println("Neparan");
		}
		// nakon ? true, nakon : false
		System.out.println(p%2==0 ? "Parana" : "Neparan");
		
		
		
		
		
	}

}
