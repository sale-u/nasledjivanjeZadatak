package zadatak08072021;

public class Trotinet extends ZaJednuOsobu {
	
	private double kapacitetBaterije;

	public double getKapacitetBaterije() {
		return kapacitetBaterije;
	}

	public void setKapacitetBaterije(double kapacitetBaterije) {
		this.kapacitetBaterije = kapacitetBaterije;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t\t " + this.brojTockova() + " *** Kapacitet baterije = " +
				this.getKapacitetBaterije() + " Ah";
	}
	
	@Override
	public String brojTockova() {
		return "Ima 2 mala tocka";
	}

}
