package application;

import java.util.Scanner;

public class Exotd_15 {

	public static void main(String[] args) {
		//Exercice 15 : Ecrire un algorithme qui demande un nombre de départ, et qui calcule la somme des entiers jusqu'à ce nombre.
		// Par exemple si l'on tape 4 , l’algorithme doit calculer: 1 + 2 + 3+ 4 = 10 Réécrire l'algorithme qui calcule cette fois la moyenne !

		
			Scanner sc = new Scanner(System.in);
			int val, somme, i;
			System.out.println("saisir une valeur");
			val = sc.nextInt();
			somme = 0;
			for(i = 1; i <= val+1;) {
				somme = somme+i;
	System.out.println(somme);
			}

	}

}
