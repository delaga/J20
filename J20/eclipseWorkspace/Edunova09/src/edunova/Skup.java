package edunova;

import java.util.HashSet;
import java.util.Set;

public class Skup {
	public Skup() {
	Set<String> jedinstveni= new HashSet<>();
	jedinstveni.add("Osijek");
	jedinstveni.add("Zagreb");
	jedinstveni.add("Osijek");
	
	System.out.println(jedinstveni.size());
	
	for (String string : jedinstveni) {
		System.out.println(string);
		
	}
	Set<Osoba> osobe=new HashSet<>();
	osobe.add(new Osoba("Ivo","Iviæ"));
	osobe.add(new Osoba("Ivo","Iviæ"));
	
	for (Osoba osoba : osobe) {
		System.out.println(osoba.hashCode());
	}
	
	
	}
	
	public static void main(String[] args) {
		new Skup();
		
	}
}
