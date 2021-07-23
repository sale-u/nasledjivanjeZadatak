package zadatak08072021;

public class Vozilo {
	
	private String naziv;
	private int maxBrzina;
	private int tezina;
	
	public int getMaxBrzina() {
		return maxBrzina;
	}
	public void setMaxBrzina(int maxBrzina) {
		this.maxBrzina = maxBrzina;
	}
	public int getTezina() {
		return tezina;
	}
	public void setTezina(int tezina) {
		this.tezina = tezina;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	// =====================================================
	
	public String brojTockova() {
		// ova metoda ce biti overrideovana
		return "Broj tockova moze biti razlicit";
	}
	
	@Override
	public String toString() {
		return "Vozilo " + this.getNaziv() + " ima tezinu od " + this.getTezina() +
				"kg i max brzinu od " + this.getMaxBrzina() + "km/h";
	}
	
	public boolean dozvoljenoNaAutoputu() {
		if (this.maxBrzina >= 40) {
			System.out.println("Dozvoljeno koristiti na autoputu");
			return true;
		}
		System.out.println("Nije dozvoljeno koristiti na autoputu zbog male max brzine");
		return false;
	}
}
