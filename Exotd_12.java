package application;

import java.util.Scanner;

public class Exotd_12 {

	public static void main(String[] args) {
		// Exercice 12 : Un nombre est parfait s’il est égal à la somme de ses diviseurs stricts (différents de lui-même).
		// Ainsi par exemple, l’entier 6 est parfait car 6 = 1 + 2 + 3. 
				// Écrire un algorithme permettant de déterminer si un entier naturel est un nombre parfait.
		Scanner sc = new Scanner(System.in);
		int val, somme, i;
			System.out.println("veuillez une valeur");
			val = sc.nextInt();
			somme = 0;
			for (i = 1; i <= val-i ; i++) {
				if(val % i == 0) {
					somme = somme + i;
				}
			}if(somme == val) {
				System.out.println("Ce nombre est parfait");
			}else {
				System.out.println("Ce nombre n'est pas parfait");
			}
	}
	   }