package application;

import java.util.Scanner;

public class Exotd_16 {

	public static void main(String[] args) {
		// Exercice 16 : Faire un programme qui calcule et affiche la division de a par b par soustractions successives
			Scanner sc =new Scanner(System.in);
			int a, b, i;
			System.out.println("saisir le dividant");
			a = sc.nextInt();
			System.out.println("saisir diviseur");
			b = sc.nextInt();
			i = 0;
		while(a >= b) {
			a = a - b;
			i++;
			System.out.println(a);
		}
	}

}
