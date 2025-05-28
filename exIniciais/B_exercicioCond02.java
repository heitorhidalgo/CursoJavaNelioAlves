//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Locale;
import java.util.Scanner;

public class B_exercicioCond02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("ESSE NÚMERO É PAR: " + x);
		}
		else {
			System.out.println("ESSE NÚMERO É ÍMPAR: " + x);
		}
		
		sc.close();
	}

}