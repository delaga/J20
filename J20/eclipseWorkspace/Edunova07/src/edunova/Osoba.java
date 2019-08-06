package edunova;

//klasa koja sadrži samo privatna svojstva i javne metode
// se naziva POJO Plain old java object

//klasa je opisnik objekta
public class Osoba {
	
	//konstanta
	public static final String GRAD="OSIJEK";

	// 1. OOP princip: uèahurivanje
	// privatna svojstva
	private int sifra;
	private double placa;
	private String ime;
	private String prezime;
	// ovo ne raditi
	// public String grad;

	// javne metode
	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}

	public double getPlaca() {
		return placa;
	}

	public void setPlaca(double placa) {
		this.placa = placa;
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

	public String imePrezime() {
		return this.ime + " " + this.prezime;
	}

	@Override
	public String toString() {
		return this.ime + " " + this.prezime;
	}

	public static boolean provjeraOib(String oib) {
		if (oib.length() != 11)
			return false;

		try {
			Long.parseLong(oib);
		} catch (NumberFormatException e) {
			return false;
		}

		int a = 10;
		for (int i = 0; i < 10; i++) {
			a = a + Integer.parseInt(oib.substring(i, i + 1));
			a = a % 10;
			if (a == 0)
				a = 10;
			a *= 2;
			a = a % 11;
		}
		int kontrolni = 11 - a;
		if (kontrolni == 10)
			kontrolni = 0;

		return kontrolni == Integer.parseInt(oib.substring(10));
	}

}
