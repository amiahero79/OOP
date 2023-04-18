package bozovic.milos;

public class Domine {
	
	private int a;
	private int b;
	
	Domine(int aa, int bb) {
		
		a = aa;
		b = bb;
	}
		
		public int getA() {
			return a;
		}
		
		public int getB() {
			return b;
		}
		
	public Domine okreni() {
		int temp = a;
		a = b;
		b = temp;
		return this;
		
	}
	
	public boolean ista(Domine d)  {
	return a == d.a && b == d.b || b == d.a && a == d.b;
		
	}
	
	
	public String tekstualniOpis()  {
		return  "(" + a + ", " + b + ")";
		
	}
		
	}
		
        	
	
	
	


