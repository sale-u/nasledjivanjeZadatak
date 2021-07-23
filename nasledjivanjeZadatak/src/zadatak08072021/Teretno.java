package zadatak08072021;

public class Teretno extends Vozilo {
	
	private double nosivost;

	public double getNosivost() {
		return nosivost;
	}

	public void setNosivost(double nosivost) {
		this.nosivost = nosivost;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t Nosivost = " + this.getNosivost() + " T";
	}

}
