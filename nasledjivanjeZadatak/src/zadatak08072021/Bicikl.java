package zadatak08072021;

public class Bicikl extends ZaJednuOsobu {
	
	private double velicinaTockova;

	public double getVelicinaTockova() {
		return velicinaTockova;
	}

	public void setVelicinaTockova(double velicinaTockova) {
		this.velicinaTockova = velicinaTockova;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n\t\t " + this.brojTockova() + " *** Velicina tockova = " +
				this.getVelicinaTockova() + "\"";
	}
	
	@Override
	public String brojTockova() {
		return "Ima 2 velika tocka";
	}
	
	public void materijalBicikla() {
		System.out.println("Okvir bicikla se pravi od celika, aluminijuma ili titanijuma...");
	}

}
