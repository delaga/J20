package edunova;

import java.util.Date;

public class Osoba {
	private String ime;
	private String prezime;
	private int visina;
	private Date datumRodjenja;
	
	
	public Osoba(String ime, String prezime, int visina, Date datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.visina = visina;
		this.datumRodjenja = datumRodjenja;
	}
	
	public Osoba() {
	
	}
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getVisina() {
		return visina;
	}
	public void setVisina(int visina) {
		this.visina = visina;
	}
	public Date getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(Date datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	@Override
	public String toString() {
		return getIme()+" "+getPrezime()+" "+getVisina()+" "+getDatumRodjenja();
	
	}
}
