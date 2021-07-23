package zadatak08072021;

public class GlavnaKlasa {

	public static void main(String[] args) {

		Vozilo vozilo1 = new Vozilo();
		vozilo1.setNaziv("Djubretarac");
		vozilo1.setTezina(2000);
		vozilo1.setMaxBrzina(30);
		System.out.println(vozilo1);
		vozilo1.dozvoljenoNaAutoputu();
		
		System.out.println("\n=================================");
		ZaJednuOsobu osoba1 = new ZaJednuOsobu();
		osoba1.setNaziv("Invalidska kolica");
		osoba1.setTezina(20);
		osoba1.setTipPogona("Elektricni motor");
		osoba1.setMaxBrzina(10);
		System.out.println(osoba1);
		osoba1.dozvoljenoNaAutoputu();
		
		System.out.println("\n=================================");
		Bicikl bicikl1 = new Bicikl();
		bicikl1.setNaziv("Trkacki bicikl");
		bicikl1.setTezina(10);
		bicikl1.setMaxBrzina(50);
		bicikl1.setTipPogona("nozni");
		bicikl1.setVelicinaTockova(20);
		System.out.println(bicikl1);
		bicikl1.materijalBicikla();
		bicikl1.dozvoljenoNaAutoputu();
		
		System.out.println("********** Razliciti tipovi reference i klase objekta ***********");
		Vozilo vozilo2 = bicikl1;
		System.out.println(vozilo2);
//		 vozilo2.materijalBicikla();	// ovo ne moze jer klasa Vozilo ne vidi metodu materijalBicikla iz klase Bicikl
		vozilo2.dozvoljenoNaAutoputu();
		System.out.println();
		
		System.out.println("\n=================================");
		Trotinet trotinet1 = new Trotinet();
		trotinet1.setNaziv("Neki trotinet");
		trotinet1.setTezina(7);
		trotinet1.setMaxBrzina(60);
		trotinet1.setTipPogona("Elektricni motor");
		trotinet1.setKapacitetBaterije(10);
		System.out.println(trotinet1);
		trotinet1.dozvoljenoNaAutoputu();
		
		System.out.println("********** Razliciti tipovi reference i klase objekta ***********");
		ZaJednuOsobu osoba2 = trotinet1;	// ne vidi metodu getKapacitetBaterije()
		System.out.println(osoba2);
		
		System.out.println("\n=================================");
		Automobil auto1 = new Automobil();
		auto1.setNaziv("Toyota Prius");
		auto1.setSnagaMotora(100);
		auto1.setTezina(1600);
		auto1.setMaxBrzina(180);
		auto1.setTipPogona("hibridni");
		System.out.println(auto1);
		auto1.dozvoljenoNaAutoputu();
		
		System.out.println("\n=================================");
		Autobus bus1 = new Autobus();
		bus1.setNaziv("Setra bus");
		bus1.setTezina(5000);
		bus1.setMaxBrzina(140);
		bus1.setSnagaMotora(250);
		bus1.setBrojPutnika(50);
		System.out.println(bus1);
		bus1.dozvoljenoNaAutoputu();
		
		System.out.println("\n=================================");
		Kamion kamion1 = new Kamion();
		kamion1.setNaziv("Iveco");
		kamion1.setMaxBrzina(120);
		kamion1.setNosivost(20);
		kamion1.setTezina(8);
		kamion1.setImaPrikolicu(true);
		System.out.println(kamion1);
		kamion1.dozvoljenoNaAutoputu();
		
//		Putnicko put1 = new Kamion();	// ovo ne moze jer Kamion nije dete klasa od Putnicko klase
		
		

	}

}
