package application;

import java.util.Scanner;

public class Exotd10 {

	private static Scanner sc;

	public static void main(String[] args) {
		// Exercice 10 : Ecrire un algorithme qui lit trois valeurs entières ( A, B et C) et qui permet de les trier par échanges successifs
       // Et enfin les afficher dans l'ordre.
		
		
		sc = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("veuillez saisir les valeurs entières");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		if(A < B && B < C) {
			System.out.println("l'ordre des valeurs est :"+ A + " " +  B + " "  + C);
	
		}else if(A < C && C < B) {
			System.out.println("l'ordre des valeurs est : " + A + " " + C + " " + B);
	
		}else if(B < A && A < C) {
			System.out.println("l'ordre des valeurs est : " + B + " " + A + " " + C);
				
		}else if(B < C && C < A) {
			System.out.println("l'ordre des valeurs est : " + B + " " + C + " " + A);
				
	}else if(C < A && A < B) {
		System.out.println("l'ordre des valeurs est : " + C + " " + A + " " + B);
			
	}else if(C < B && B < A) {
		System.out.println("l'ordre des valeurs est : " + C + " " + B + " " + A);
		
	}
		
	}
	
}

