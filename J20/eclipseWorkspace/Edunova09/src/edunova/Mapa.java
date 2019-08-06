package edunova;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Mapa {
	public Mapa() {
//		Map<String, Osoba> podaci =new HashMap<>();
//		//var pero=new HashMap<String,Osoba>();
//		podaci.put("O1", new Osoba("Pero","Periæ"));
//		podaci.put("O2", new Osoba("Maja","Mrak"));
//		
//		for (String s : podaci.keySet()) {
//			System.out.println(podaci.get(s).getIme());
//			
//		}
//		
//		Map<String,String> mapa=new Hashtable<String, String>();
//		
//		mapa.put("01", "1");
//		mapa.put("02", "1");
//		for (String s: mapa.keySet()) {
//			System.out.println(mapa.get(s));
//			
//		}
		Map<String,Osoba> podaci=new HashMap<String, Osoba>();
		podaci.put("A", new Osoba("Pero","Mikiæ"));
		podaci.put("B", new Osoba("Kurac","palac"));
		podaci.put("C", new Osoba("OJO","ojvcoidsfj"));
		for (String s : podaci.keySet()) {
			System.out.println(podaci.get(s).getIme());
		}
		
		Map<String,String> mapa=new Hashtable<String, String>();
		mapa.put("01", "Kurac");
		mapa.put("02", "Palac");
		for (String s : mapa.keySet()) {
			System.out.println(mapa.get(s));
		}
		mapa.put("03", "japanac");
		for(String s : mapa.keySet())
		System.out.println(mapa.get(s));
		System.out.println(mapa.get("02"));
	}
	public static void main(String[] args) {
		new Mapa();
	}
}
