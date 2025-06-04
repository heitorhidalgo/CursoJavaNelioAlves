//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTAS PESSOAS SERAO DIGITADAS: ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("DADOS DA " + (i+1) + "ª PESSOA:");
			System.out.print("NOME: ");
			nomes[i] = sc.next();
			System.out.print("IDADE: ");
			idades[i] = sc.nextInt();
			System.out.print("ALTURA: ");
			altura[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i=0;i<n;i++) {
			soma = soma + altura[i];			
		}
		double mediaAltura = soma/n;
		
		System.out.println();
		System.out.printf("ALTURA MEDIA: %.2f%n", mediaAltura);
		
		int cont=0;
		for (int i=0; i<n; i++) {
			if(idades[i]<16) {
				cont = cont+1;
			}
		}
		
		double percent = cont*100.0/n;
		System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f%%%n", percent);
		
		for(int i=0;i<n;i++) {
			if(idades[i]<16) {
				System.out.println(nomes[i]);
			}	
		}
		sc.close();
	}
}