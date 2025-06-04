//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program06 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("QUANTOS NUMEROS VOCE VAI DIGITAR? ");
	int N = sc.nextInt();
	
	int[] vet = new int[N];
	
	for(int i=0; i<N; i++) {
		System.out.print("DIGITE UM NUMERO: ");
		vet[i] = sc.nextInt();
	}
	
	System.out.print("NUMEROS NEGATIVOS: ");
	System.out.println();
	for(int i=0;i<N;i++) {
		if(vet[i]<0) {
			System.out.println(vet[i]);
		}
	}
	sc.close();
	}
}