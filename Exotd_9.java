package application;

import java.util.Scanner;

public class Exotd_9 {


	private static Scanner sc;

	public static void main(String[] args) {
	//Exercice 9 : Ecrire un algorithme qui donne la durée de vol en heure minute connaissant l'heure de départ et l'heure d'arrivée. 
		//a. On considère que le départ et l'arrivé ont lieu le même jour 
		//b. On suppose que la durée de vol est inférieure à 24 heures mais peut avoir lieu le lendemain
		
		
		sc = new Scanner(System.in);
		int dv, hd, ha, min_d, min_a, dh, dm;
		System.out.println("saisir l'heure de départ");
		hd = sc.nextInt();
		min_d = sc.nextInt();
		System.out.println("saisir l'heure d'arrivée");
		ha = sc.nextInt();
		min_a = sc.nextInt();
		
		//conversion de l'heure en minute
		
		min_d =min_d + hd * 60;
		min_a =min_a + ha * 60;
		
		//calcul de la durée de vol
		dv = min_a - min_d;
		dh = dv / 60;
		dm = dv % 60;
		
		System.out.println("la durée de vol en heure est : " + dh );
		System.out.println("la durée de vol en minute est : " + dm );

		
		
		

	}

}
