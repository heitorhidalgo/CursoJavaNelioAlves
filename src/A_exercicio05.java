//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class A_exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroPecas1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int numeroPecas2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorTotal1 = numeroPecas1*valor1;
		double valorTotal2 = numeroPecas2*valor2;
		
		double valorPago = valorTotal1 + valorTotal2;
				
		System.out.printf("VALOR A PAGAR = %.2f%n", valorPago);
		
		sc.close();
	}

}