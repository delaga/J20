package edunova;

public class Racun extends Dokument{

	private Kupac kupac;

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	@Override
	public String getTip() {
		return "Ja sam raèun";
	}
	
	
	
}
