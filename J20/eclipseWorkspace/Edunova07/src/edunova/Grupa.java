package edunova;

public class Grupa {
	
	//definirajte POJO klasu koja odgovara tablici 
	// smjer u Edunovaj20 bazi
	
	private int sifra;
	private String naziv;
	private int trajanje;
	private double cijena;
	private float upisnina;
	private boolean certificiran;
	
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanje() {
		return trajanje;
	}
	public void setTrajanje(int trajanje) {
		this.trajanje = trajanje;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public float getUpisnina() {
		return upisnina;
	}
	public void setUpisnina(float upisnina) {
		this.upisnina = upisnina;
	}
	public boolean isCertificiran() {
		return certificiran;
	}
	public void setCertificiran(boolean certificiran) {
		this.certificiran = certificiran;
	}

	
	
}
