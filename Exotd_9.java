package application;

import java.util.Scanner;

public class Exotd_9 {


	private static Scanner sc;

	public static void main(String[] args) {
	//Exercice 9 : Ecrire un algorithme qui donne la dur�e de vol en heure minute connaissant l'heure de d�part et l'heure d'arriv�e. 
		//a. On consid�re que le d�part et l'arriv� ont lieu le m�me jour 
		//b. On suppose que la dur�e de vol est inf�rieure � 24 heures mais peut avoir lieu le lendemain
		
		
		sc = new Scanner(System.in);
		int dv, hd, ha, min_d, min_a, dh, dm;
		System.out.println("saisir l'heure de d�part");
		hd = sc.nextInt();
		min_d = sc.nextInt();
		System.out.println("saisir l'heure d'arriv�e");
		ha = sc.nextInt();
		min_a = sc.nextInt();
		
		//conversion de l'heure en minute
		
		min_d =min_d + hd * 60;
		min_a =min_a + ha * 60;
		
		//calcul de la dur�e de vol
		dv = min_a - min_d;
		dh = dv / 60;
		dm = dv % 60;
		
		System.out.println("la dur�e de vol en heure est : " + dh );
		System.out.println("la dur�e de vol en minute est : " + dm );

		
		
		

	}

}
