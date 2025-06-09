//Fazer um programa para ler dois números inteiros M e N, e depois ler
//uma matriz de M linhas por N colunas contendo números inteiros,
//podendo haver repetições. Em seguida, ler um número inteiro X que
//pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//esquerda, acima, à direita e abaixo de X, quando houver, conforme
//exemplo.

package application;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]==x) {
					System.out.println("POSITION "+ i + "," + j +":");
					if(j>0) {
						System.out.println("LEFT: " + mat[i][j-1]);
					}
					if(i>0) {
						System.out.println("UP: " + mat[i-1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.println("RIGHT: " + mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.println("DOWN: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}