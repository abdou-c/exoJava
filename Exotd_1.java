package application;

import java.util.Scanner;

public class Exotd_1 {

	private static Scanner sc;

	public static void main(String[] args) {
		//exercice 1 :
		//Ecrire un programme qui saisit deux entiers a et b, calcule et affiche le quotient entier, le reste de la division et le ratio (quotient réel).
	//Algo : nombres
		
	sc = new Scanner(System.in);
	int a, b, qe, r;
	double qr;
	System.out.println("saisir le premier nombre");
	a = sc.nextInt();
	System.out.println("saisir le deuxième nombre");
	b = sc.nextInt();
		//calcul du quotient entier
	qe = a/b;
		//calcul du reste;
	r = a%b;
		//calcul du quotient reel
	qr = a/b;
	System.out.println("le quotient entier est: " + qe);
	System.out.println("le reste de la division est : " + r);
	System.out.println("le quotient reel est : " + qr);
	

	}

}
