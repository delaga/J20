package edunova;

import java.util.Date;

public class StartDokument {

	public StartDokument() {

		Dokument[] niz = new Dokument[2];

		// kreirajte novu instancu klase dokument
		Racun racun = new Racun();
		racun.setSifra(1);
		Date date = new Date();
		racun.setDatum(date);

		Operater operater = new Operater();
		operater.setSifra(1);
		operater.setIme("Pero");

		racun.setOperater(operater);

		// ispišite ime operatera
		// koristeæi objekt dokument iskljuèivo
		System.out.println(racun.getOperater().getIme());

		// Postavite prezime operatera
		// ispišite prezime operatera
		// koristeæi iskljuèivo instancu dokument

		racun.getOperater().setPrezime("Periæ");

		System.out.println(racun.getOperater().getPrezime());

		niz[0] = racun;
		
		Dostavnica dostavnica = new Dostavnica();
		dostavnica.setSifra(2);
		
		niz[1]=dostavnica;
		
		ispis(niz);

	}

	// kreirajte metodu tipa void
	// koja prima jedan parametar tipa Dokument
	// metoda se zove ispis
	private void ispis(Dokument[] dokumenti) {
		// postavi šifru operatera na 2
		//dokument.getOperater().setSifra(2);
		for (Dokument dokument : dokumenti) {
			//ovdje se prikazuje korištenje 
			//polimorfizam principa
			System.out.println(dokument.getTip());
		}
		//Polimorfizam ili višeoblièje
		//je svojstvom da se objekt razlièito ponaša
		//u odnosu na tip koji je postavljen
	}

	public static void main(String[] args) {
		new StartDokument();
	}

}
