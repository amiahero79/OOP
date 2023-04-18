package bozovic.milos;

public class ProsledjivanjeObjektaMetodiPrikaza {

	public static void main(String[] args) {
		
	Circle c1 = new Circle(20);
	Circle c2 = new Circle(30);
	
	calcArea(c1);
	calcArea(c2);
		
		

	}
	
	public static void calcArea(Circle asd) {
		System.out.println("Povrsina kruga: " + asd.area());
	}

}
