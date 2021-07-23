package zadatak08072021;

public class Putnicko extends Vozilo {
	
	private double snagaMotora;

	public double getSnagaMotora() {
		return snagaMotora;
	}

	public void setSnagaMotora(double snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t Snaga motora = " + this.getSnagaMotora() + " kW";
	}

}
