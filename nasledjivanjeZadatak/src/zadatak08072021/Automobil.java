package zadatak08072021;

public class Automobil extends Putnicko {
	
	private String tipPogona;

	public String getTipPogona() {
		return tipPogona;
	}

	public void setTipPogona(String tipPogona) {
		this.tipPogona = tipPogona;
	}
	
	@Override
	public String brojTockova() {
		return "ima 4 tocka";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t\t Tip pogona je " + this.getTipPogona() + " i " + this.brojTockova();
	}

}
