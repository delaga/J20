package edunova;

public class Liste_ja {
	public Liste_ja() {
		
	}
	public static void main(String[] args) {
		new Liste_ja();
		Osoba[]osobe=new Osoba[2];
		
		Osoba susjed=new Osoba();
		susjed.setIme("Ivo");
		susjed.setPrezime("Iviæ");
		
		osobe[0]=susjed;
		
		Osoba ja=new Osoba();
		ja.setIme("Mirza");
		ja.setPrezime("Delagiæ");
		
		osobe[1]=ja;
		
		for (Osoba osoba : osobe) {
			System.out.println(osoba.getIme());
		}
		
		
		
	}
}
