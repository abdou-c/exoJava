package application;

import java.util.Scanner;

public class Exotd_4 {

	private static Scanner sc;

	public static void main(String[] args) {
		//Exercice 4
		//Ecrire un programme qui saisit un r�el x et un entier n et affiche x � la puissance n.
		//Version 1 : utiliser la fonction pow  du fichier d�en-t�te <math.h>  ex : pow(x,n)
		//Version 2 : en utilisant un boucle
		sc = new Scanner(System.in);
		double x, p;
		int n, i;
		System.out.println("saisir un r�el");
		x = sc.nextDouble();
		System.out.println("saisir un entier");
		n = sc.nextInt();
		p = Math.pow(x,n);
		System.out.println("X � la puissance N est : " + p);
			//version
		
			for (i = 1; i <= n ; i++) {
				p = p * x;
			}
			
		

		


	}

}
