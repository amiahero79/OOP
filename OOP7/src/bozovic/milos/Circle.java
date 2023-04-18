package bozovic.milos;

public class Circle {
	
	private double poluprecnik;
	
	Circle()
	{
		poluprecnik = 0.0;
	}
	
	Circle(double radius)
	{
		this.poluprecnik = radius;
	}
	
	public double area()
	{
		return 3.14 * poluprecnik * poluprecnik;
	}
	
	

}
