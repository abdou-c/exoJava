package application;

import java.util.Scanner;

public class algotd_13 {

	public static void main(String[] args) {
		/* Exercice 13 : Faire un programme qui saisit une date (jour, mois et année) 
		et qui indique si la date est valide */
		Scanner sc = new  Scanner(System.in);
		int date, jour, mois, annee, annee_act;
		System.out.println("saisir le jour");
		jour = sc.nextInt();
		System.out.println("saisir le mois");
		mois = sc.nextInt();
		System.out.println("saisir l'année");
		annee = sc.nextInt();
      		annee_act = 2020;
		if(jour > 31 || jour < 0 || mois > 12 || mois < 0 || annee < 1 || annee > annee_act  || mois == 2 && jour > 29 || annee % 4 != 0 || mois == 2 && jour > 29){
			System.out.println("l'annee n'est pas valide");
		}else {
			System.out.println("l'annee est valide");
		}

	}

}
