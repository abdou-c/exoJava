package application;

import java.util.Scanner;

public class Exotd_14 {

	public static void main(String[] args) {
		// Exercice 14 : Faire un programme qui saisit une date (jour, mois et année) at qui indique si l’année est bissextile
		
		Scanner sc = new Scanner(System.in);

		int date, jour, mois, annee, annee_act;
		System.out.println("saisir le jour");
		jour = sc.nextInt();
		System.out.println("saisir le mois");
		mois = sc.nextInt();
		System.out.println("saisir l'année");
		annee = sc.nextInt();
      		annee_act = 2020;
		if(jour < 31 || jour > 0 || mois <= 12 || mois > 0 || annee > 1 || annee <= annee_act  || mois == 2 && jour <= 29 || annee % 4 == 0 || mois == 2 || jour <= 29 || jour > 28){
			System.out.println("l'annee est bissextile");
		}else {
			System.out.println("l'annee n'est pas bissextile");
		}
	}

}
