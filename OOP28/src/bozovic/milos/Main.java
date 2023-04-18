package bozovic.milos;

public class Main {

	public static void main(String[] args) {
		
	Domine d1 = new Domine(2, 4);
	Domine d2 = new Domine(3, 4);
	
	System.out.println(d1.ista(d2));
	//System.out.println(d1.okreni());
	System.out.println(d1.tekstualniOpis());	
	System.out.println(d2.tekstualniOpis());
	System.out.println(d2.okreni());

	}

}
