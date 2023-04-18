package bozovic.milos;

public class Radnik {
	
	private String ime;
	private double procenat;
	private double prihod;
	
	Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
		
	}
	public double prihod() {
		return prihod;
	}
	public double plata() {
		return prihod()*procenat/100;
	}
	
	public String opis() {
		return ime + "/" + plata();
	}
	
	
	

}
