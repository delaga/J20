package edunova;

import java.util.ArrayList;
import java.util.List;

public class Liste {
	public Liste() {
		
	}
	public static void main(String[] args) {
		new Liste();
		Osoba[] osobe=new Osoba[2];
		
		Osoba susjed=new Osoba();
		susjed.setIme("Goran");
		susjed.setPrezime("Kovaè");
		osobe[0]=susjed;
		
		Osoba ja=new Osoba();
		ja.setIme("Mirza");
		ja.setPrezime("Delagiæ");
		osobe[1]=ja;
		
		for( Osoba o:osobe) {
			System.out.println(o.getIme());
		}
		ArrayList lista=new ArrayList();
		lista.add("Osijek");
		lista.add(susjed);
		
		List<Osoba> listaOsoba=new ArrayList<>();	
		Osoba o;
		for (int i = 0; i < 100; i++) {
			o=new Osoba();
			o.setIme("Ime"+(i+1));
			o.setPrezime("Prezime"+(i+1));
			listaOsoba.add(o);
			listaOsoba.add(new Osoba("Ime"+(i+1), "Prezime"+(i+1)));			
		}
		System.out.println(listaOsoba.get(0).getIme());
		
		List<String> gradovi=new ArrayList<>();
		gradovi.add("Osijek");
		System.out.println(gradovi.get(0).substring(0,4));
		
	}
}
