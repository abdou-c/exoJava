package application;

import java.util.Scanner;

public class Exotd_3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double R1, R2, R3, RS, RP;
		System.out.println("saisir la première la résistance");
		R1 = sc.nextDouble();
		System.out.println("saisir la deuxième la résistance");
		R2 = sc.nextDouble();
		System.out.println("saisir la troisième la résistance");
		R3 = sc.nextDouble();
		RS =  R1 + R2 +R3;
		RP =  (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3);
		System.out.println("la résistance en série est : " + RS);
		System.out.println("la résistance en parallele est: " + RP);
			//version2
		 double fres, frep;
		int choix;
		System.out.println("faire ton choix");
		choix = sc.nextInt();
		System.out.println("saisir la première la résistance");
		R1 = sc.nextDouble();
		System.out.println("saisir la deuxième la résistance");
		R2 = sc.nextDouble();
		System.out.println("saisir la troisième la résistance");
		R3 = sc.nextDouble();
		RS =  R1 + R2 +R3;
		RP =  (R1 * R2 * R3) / (R1*R2 + R2*R3 + R1*R3);
		if (choix == 1){
			fres =  (R1/RS + R2/RS + R3/RS)/ RS;
			System.out.println("la frequence en serie est : " + fres);
		}
		else {
			if(choix == 2){
				frep = (R1/RS + R2/RS + R3/RS)/ RS;

				System.out.println("la frequence en parallèle est : " + frep);
			}

		}
		

		
		
	}

}
