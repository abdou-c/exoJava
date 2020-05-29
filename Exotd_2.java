package application;

import java.util.Scanner;

public class Exotd_2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double r, s, p;
		double pi = 3.14;
		System.out.println("saisir le rayon");
		r = sc.nextDouble();
		//calcul de la surface
		 s = r * r * pi;
		 //calcul du perimetre
		 p = 2 * r * pi;
			System.out.println("la surface est : " + s);
			System.out.println("le perimètre est : " + p);


		 
		
	}

}
