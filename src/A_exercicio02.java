//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais

import java.util.Locale;
import java.util.Scanner;

public class A_exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi*raio*raio;
		
		System.out.printf("Area = %.4f%n", area);
		
		sc.close();
	}

}