package edunova;

import java.util.Date;

public abstract class Dokument {
	
	public abstract String getTip();
	
	private int sifra;
	private Date datum;
	private Operater operater;
	
	
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public Operater getOperater() {
		return operater;
	}
	public void setOperater(Operater operater) {
		this.operater = operater;
	}

	
	
}
