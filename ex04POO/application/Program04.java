//Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
//uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
//que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
//para ser responsável pelos cálculos.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(amount,dollarPrice);
		System.out.printf("Amout to be paid in reais? %.2f%n", result);
		
		sc.close();
	}

}