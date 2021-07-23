package zadatak08072021;

public class Autobus extends Putnicko {
	
	private int brojPutnika;

	public int getBrojPutnika() {
		return brojPutnika;
	}

	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	
	@Override
	public String brojTockova() {
		return "ima 6 tockova";
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t\t Prima " + this.getBrojPutnika() + " putnika i " + this.brojTockova();
	}

}
