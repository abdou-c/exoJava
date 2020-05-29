package application;

import java.util.Scanner;

public class Exotd_17 {

	public static void main(String[] args) {
		
		//Exercice 17: Faire un programme qui calcule le PGCD de deux nombres saisis au clavier en utilisant l'astuce suivante:
		 //soustrait le plus petit des deux entiers du plus grand jusqu'à ce qu'ils soient égaux 
			Scanner sc = new Scanner(System.in);
			int nbr1, nbr2;
				System.out.println("saisir le premier nombre");
				nbr1 = sc.nextInt();
				System.out.println("saisr le deuxième nombre");
				nbr2 = sc.nextInt();
			while(nbr1 != nbr2) {
				if(nbr1 < nbr2) {
					nbr2 = nbr2 - nbr1;
				}else {
					nbr1 = nbr1 - nbr2;
					System.out.println(nbr1);
				}
			}
	}

}
