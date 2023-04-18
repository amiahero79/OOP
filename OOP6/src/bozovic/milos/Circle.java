package bozovic.milos;

public class Circle {
	
	private double radius;
	
	
	Circle( double rad) //Konstruktor sa parametrom
	{
		radius = rad;
	}
	
	public double area()
	{
		return 3.14 * radius * radius;
	}
	
	

}
