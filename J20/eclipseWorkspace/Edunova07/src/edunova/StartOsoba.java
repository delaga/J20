package edunova;

public class StartOsoba {
	
	//proèitati
	//https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/
	//https://www.javatpoint.com/java-oops-concepts
	//https://www.guru99.com/java-oops-concept.html

	public static void main(String[] args) {
		
		//kreiranje nove instance klase osoba - objekt
		// instance variable, varijabla, objekt
		//deklariranje instance varijable s tipa Osoba
		//objekt je instanca klase
		Osoba s;
		
		//konstruiranje objekta
		s=new Osoba();
		
		//korištenje objekta
		s.setSifra(1);
		s.setPlaca(8700.99);
		s.setIme("Marija");
		s.setPrezime("Zimska");
		//ovo ne raditi
		//s.grad="Osijek";
		System.out.println(s.getPlaca());
		
		//uništavanje objekta
		// odraðuje GC - garbage collector
		if(Osoba.provjeraOib("12121212121")) {
			System.out.println("OIB je OK");
		}
		
		System.out.println(Osoba.GRAD);
		System.err.println(Integer.MAX_VALUE);
		
	}
}
