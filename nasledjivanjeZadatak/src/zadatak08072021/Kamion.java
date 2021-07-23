package zadatak08072021;

public class Kamion extends Teretno {
	
	private boolean imaPrikolicu;

	public boolean isImaPrikolicu() {
		return imaPrikolicu;
	}

	public void setImaPrikolicu(boolean imaPrikolicu) {
		this.imaPrikolicu = imaPrikolicu;
	}
	
	@Override
	public String brojTockova() {
		return "ima 8 tockova";
	}
	
	@Override
	public String toString() {
		String izlaz = super.toString() + "\n\t\t ";
		if (this.isImaPrikolicu()) {
			izlaz += "Poseduje prikolicu";
		} else {
			izlaz += "Nema prikolicu";
		}
		izlaz += " i " + this.brojTockova();
		return izlaz;
	}

}
