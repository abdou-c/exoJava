package application;

import java.util.Scanner;

public class Exotd_7 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int montant, billet_20, billet_10, billet_5, piece_2, piece_1;
	
			System.out.println("veuillez saisir un montant");
			montant = sc.nextInt();
		billet_20 = montant/20;
		montant = montant % 20;
		System.out.println("la decomposition en billet de 20 euro est : " + billet_20);
		billet_10 = montant /10;
		montant = montant % 10;
		System.out.println("la decomposition en billet de 10 euro est : " + billet_10);
		billet_5 = montant / 5;
		montant = montant % 5;
		System.out.println("la decomposition en billet de 05 euro est : " + billet_5);
		piece_2 = montant / 2;
		System.out.println("la decomposition en piece de 02 euro est : " + piece_2);
		piece_1 = montant  / 1;
		System.out.println("la decomposition en piece de 01 euro est : " + piece_1);

		
	}

}
