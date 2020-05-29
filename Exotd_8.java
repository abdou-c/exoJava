package application;

import java.util.Scanner;

public class Exotd_8 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		double a, b, c, delta, x1, x2, x0;
		System.out.println("saisir les valeurs de A, de B et de C");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
			delta = Math.pow(b,2) - 4*a*c;
		
		if (delta > 0) {
			System.out.println("l'equation admet deux solutions distinctes que sont X1 et X2");
			x1 = -b + Math.sqrt(delta)/2 * a;
			x2 =  -b - Math.sqrt(delta)/2 * a;
			System.out.println("X1 = " + x1);
			System.out.println("X2 = " + x2);
		}else if(delta == 0){
			System.out.println("l'equation admet une racine double");
			x0 = -b/2*a;
			System.out.println("la solution est : " + x0);
		}else {
			System.out.println("l'equation n'admet pas de solution");
		
		

		
	}

}
}