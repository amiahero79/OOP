package bozovic.milos;

import java.util.Scanner;

public class Ime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cat macka = new Cat();
		
		System.out.print("Unesite ime mačke: ");
		
		macka.ime = sc.nextLine();
		
		macka.prikazatiIme();

	}

	
		
	}


