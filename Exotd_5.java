package application;

import java.util.Scanner;

public class Exotd_5 {

	private static Scanner sc;
	private static int n;
	//Ecrire un programme qui saisit 5 variables de type entier au clavier et qui affiche leur somme. Utiliser une boucle (for ou while ou do..while).
	//Algo : somme
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int s = 0;
		int val;
		int i;
		n = 5;	
		for(i = 1; i <= 5 ;i++){
			System.out.println("saisir les valeurs");
			val = sc.nextInt();
			s = s + val;
		}
		System.out.println("la somme des valeurs est : " + s);

		

	}

}
