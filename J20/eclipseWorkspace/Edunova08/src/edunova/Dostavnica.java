package edunova;

public class Dostavnica extends Dokument{

	private boolean zaprimio;

	public boolean isZaprimio() {
		return zaprimio;
	}

	public void setZaprimio(boolean zaprimio) {
		this.zaprimio = zaprimio;
	}

	@Override
	public String getTip() {
		return "Ja sam Dostavnica";
	}
	
	
}
