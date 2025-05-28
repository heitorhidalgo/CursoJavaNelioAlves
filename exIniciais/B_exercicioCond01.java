//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Locale;
import java.util.Scanner;

public class B_exercicioCond01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("ESSE NÚMERO É NEGATIVO: " + x);
		}
		else {
			System.out.println("ESSE NÚMERO É POSITIVO: " + x);
		}
		
		sc.close();
	}

}