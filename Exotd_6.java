package application;

import java.util.Scanner;

public class Exotd_6 {

	public static void main(String[] args) {
		// Exercice 6 :
		//Faire un programme qui saisit  les coordonnées de 2 points A (x1, y1) et b(x2, y2) et qui affiche la distance entre les 2 points.
		//Formule : distante = racine carrée de ((x1 – x2)2  + (y1 – y2)2)
		 //Racine carrée : sqrt. Ex : sqrt(7) ; <math.h>
		Scanner sc = new Scanner(System.in);
		double a, b, x1, y1, x2, y2, d;
		System.out.println("saisir les coordonnées de A");
		 x1= sc.nextDouble();
		y1 = sc.nextDouble();
			System.out.println("saisir les coordonnées de B");
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();

		//calcul de la distance
			d = Math.sqrt(Math.pow((x1 - x2),2) +Math.pow((y1 - y2),2));
		System.out.println("la distance entre A et B est : " + d);
			

	}

}
