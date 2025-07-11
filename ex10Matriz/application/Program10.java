//Fazer um programa para ler um número inteiro N e uma matriz de
//ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.

package application;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIN DIAGONAL: ");
		for(int i=0;i<mat.length;i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count =0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]<0) {
					count++;
				}
			}
		}
		System.out.println("NEGATIVA NUMBER = " + count);
		
		sc.close();

	}

}