package bozovic.milos;

import java.util.Scanner;

public class BrojStranicaNaslov {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
		
		Knjiga naslov = new Knjiga();
		
		Knjiga broj = new Knjiga();
		
		System.out.print("Unesite naslov knjige: ");
		
		naslov.imeKnjige = sc.nextLine();
		
	System.out.print("Unesite broj stranica: ");
		
		broj.brojStr = sc.nextInt();
		
		naslov.Knjiga();
		broj.Knjiga();
		
		
		
		
	}

}
