package application;

import java.util.Scanner;

public class Exotd_11 {

	private static Scanner sc;

	public static void main(String[] args) {

		//Exercice 11 : Ecrire un algorithme calculatrice permettant la saisie du premier entier (a) de l'op�ration
	    // ( + ou � ou * ou / : sont des caract�res) et du deuxi�me entier (b) et qui affiche le r�sultat.
		
		sc = new Scanner(System.in);
			int a, b;
			int r;
			String operateur;
			char opr;
			System.out.println("saisir les valeurs de A");
			a = sc.nextInt();
			System.out.println("saisir l'operateur");
			operateur = sc.next();
			System.out.println("saisir les valeurs de B");
			b = sc.nextInt();
			opr = operateur.charAt(0);
	
			if(opr == '+') {
				r = a + b;
				System.out.println("le resultat = " + r);
			}else if (opr == '-') {
				r = a - b;
				System.out.println("le resultat = " + r);
			}else if(opr == '*') {
				r = a * b;
				System.out.println("le resultat = " + r);
			}else if(opr == '/') {
				r = a/b;
				System.out.println("le resultat = " + r);
			}else {
				System.out.println("le calcul n'est pas valide");
			}
			
	}

}
