package edunova;

import java.util.ArrayList;
import java.util.List;

public class Liste {
	public Liste() {
		
	}
	public static void main(String[] args) {
		new Liste();
		//u niz osobe koji ima 2 dumine ulazi objekt Osoba
		Osoba[] osobe=new Osoba[2];
		//kreiranje instance susjed
		Osoba susjed=new Osoba();
		susjed.setIme("Goran");
		susjed.setPrezime("Kovaè");
		//ubac susjeda u niz osobe na index 0
		osobe[0]=susjed;
		//kreiranje "ja"(Osoba)
		Osoba ja=new Osoba();
		ja.setIme("Mirza");
		ja.setPrezime("Delagiæ");
		//dodavanje "ja" u niz na index 1
		osobe[1]=ja;
		
		for( Osoba o:osobe) {
			System.out.println(o.getIme());
		}
		ArrayList lista=new ArrayList();
		lista.add("Osijek");
		lista.add(susjed);
		for (Object object : lista) {
			System.out.println(object.toString());
		}
		System.out.println(lista.get(0));
		Osoba a=(Osoba) lista.get(1);
		System.out.println(a.getIme());
		
		
		List<Osoba> listaOsoba=new ArrayList<>();	
		Osoba o;
		for (int i = 0; i < 100; i++) {
			o=new Osoba();
			o.setIme("Ime"+(i+1));
			o.setPrezime("Prezime"+(i+1));
			listaOsoba.add(o);
			listaOsoba.add(new Osoba("Ime"+(i+1), "Prezime"+(i+1)));			
		}
		for (Osoba osoba : listaOsoba) {
			System.out.println(osoba.getIme()+" "+osoba.getPrezime());
		}
		System.out.println(listaOsoba.get(0).getIme());
		
		List<String> gradovi=new ArrayList<>();
		gradovi.add("Osijek");
		System.out.println(gradovi.get(0).substring(0,4));
		gradovi.add("Vukovar");
		for (int i = 0; i < 10; i++) {
			gradovi.add("Grad"+(i*10));
		}
		for (String string : gradovi) {
			System.out.println(string);
		}
	}
}
