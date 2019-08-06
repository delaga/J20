package edunova;

import javax.swing.DefaultComboBoxModel;

public class RadSPolaznik {

	public static void main(String[] args) {
		Polaznik p = new Polaznik();
		
		p.setIme("Pero");
		p.setPrezime("Periæ");
		p.setBrojUgovora("2019/22");
		
		System.out.println(p.imePrezime());
		
		//1. puta dobije rezultat metode toString na klasi Object
		System.out.println(p);
		
		
		//kreireajte novu instancu klase Predavaca
		//postavite sva svojstva
		//ispišite predavaca
		Predavac predavac = new Predavac();
		predavac.setIme("Karlo");
		predavac.setPrezime("Jug");
		predavac.setIban("36456547621574");
		System.out.println(predavac);
		
	}
}
