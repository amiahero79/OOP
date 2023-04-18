package bozovic.milos;

public class XY {
	
	private double x;
	private double y;
	
	// konstruktor
	
	XY(double xx, double yy) {
		
		x = xx;
		y = yy;
	}
	// geter dohvata vrednost za koordinatu x.
	public double getX() {
		return x;
	}
	// geter dohvata koordinatu za y.
	public double getY() {
		return y;
	}
	
	public String ispisi()  {
		return  "(" + x + ", " + y + ")";
		
	}

}
