package edunova;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {
	private List<Osoba>osobe;
	
	public Start() {
		osobe=new ArrayList<>();
		glavna_petlja:
		while(true) {
			izbornik();
			switch (Pomocno.unosInteger("Odaberite redni broj akcije")) {
			case 5:
				break glavna_petlja;
			case 1:
				izlistajOsobe();
				break;
			case 2:
				osobe.add(unosOsobe());
				break;
			case 3:
				promjenaOsobe();
				break;
			default:
				break;
			}
		}
		
	}
	
	private void promjenaOsobe() {
		izlistajOsobe();
		Osoba o=osobe.get(redniBrojOsobe()-1);
		o=postaviVrijednosti(o);
		
		
	}

	private void izlistajOsobe() {
			int i=0;
			System.out.println("\nIspis osoba:");
		
		for (Osoba osoba : osobe) {
			
			
			System.out.println(++i + ". "+osoba);
		}
		System.out.println("");
		
	}
	private int redniBrojOsobe() {
		int rb;
		while(true) {
			rb=Pomocno.unosInteger("Unesite redni broj");
			if(rb>osobe.size()) {
				JOptionPane.showConfirmDialog(null, "Obavezno unutar ponuðenih brojeva");
				continue;
			}
			return rb;
		}
	}
	private void izbornik() {
		System.out.println("##### Konzola App ######");
		System.out.println("1. Izlistaj sve osobe");
		System.out.println("2. Unos nove osobe");
		System.out.println("3. Promjena osobe");
		System.out.println("4. Brisanje osobe");
		System.out.println("5. Izlaz iz App");
		
		
		
	}

	private Osoba unosOsobe() {
		Osoba o=new Osoba();
		
		return o;
	}
	
	private Osoba postaviVrijednosti(Osoba o) {
		o.setIme(Pomocno.unosString("Unesi ime"));
		o.setPrezime(Pomocno.unosString("Unesi prezime"));
		o.setVisina(Pomocno.unosInteger("Unesi visinu"));
		o.setDatumRodjenja(Pomocno.unosDatum("Unesi datum roðenja"));
		return o;
	}
	public static void main(String[] args) {
		new Start();
	}
}
