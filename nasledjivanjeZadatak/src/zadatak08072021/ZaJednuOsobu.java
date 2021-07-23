package zadatak08072021;

public class ZaJednuOsobu extends Vozilo {
	
	private String tipPogona;

	public String getTipPogona() {
		return tipPogona;
	}

	public void setTipPogona(String tipPogona) {
		this.tipPogona = tipPogona;
	}
	
	@Override
	public String brojTockova() {
		return "Broj tockova je 2";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t Koristi jedna osoba. Tip pogona je " + this.getTipPogona();
	}

}
