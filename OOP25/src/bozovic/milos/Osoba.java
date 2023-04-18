package bozovic.milos;

public class Osoba {

	public String ime, datumRodjenja, adresaStanovanja;
	
	//konstruktor
	// ukoliko n navedemo konstruktor, povezace se podrazumevani konstruktor
	
	public String ispisi() {
		return "Ime: " + ime + "\n" + "Datum rođenja: " + datumRodjenja + "\n" + "Adresa: " + adresaStanovanja + "\n";
		
	}
	
}
