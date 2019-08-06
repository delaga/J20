package edunova;

public class StartKupac {

	public StartKupac() {
		
		//kreirati varijablu tipa Kupac i dodjeliti
		// šifru 1 te ime Pero
		
		
		//do sada nauèeni naèin
		Kupac kupac = new Kupac();
		kupac.setSifra(1);
		kupac.setIme("Pero");
		
		System.out.println(kupac.getIme());
		
		kupac = new Kupac(1,"Marko");
		
		System.out.println(kupac.getIme());
		
	}
	
	public static void main(String[] args) {
		new StartKupac();
	}
}
