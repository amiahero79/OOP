package bozovic.milos;

public class DemoPrikaz {

	public static void main(String[] args) {

	Rastojanje r1 = new Rastojanje();
	Rastojanje r2 = new Rastojanje();
	Rastojanje r3 = new Rastojanje();
	
	r1.stopala = 14;
	r1.inci = 9.5;
	r2.stopala = 19;
	r2.inci = 5.5;
	
	
	System.out.println(r1.stopala + ", " + r1.inci);
	System.out.println(r2.stopala + ", " + r2.inci);
	System.out.println(r3.stopala + ", " + r3.inci);
		
	}

}
