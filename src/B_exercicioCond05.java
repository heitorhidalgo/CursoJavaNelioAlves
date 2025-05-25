//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;

public class B_exercicioCond05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtde = sc.nextInt();
		
		double total;
		
		if(codigo == 1) {
			total = qtde * 4.00;	
		}
		else if (codigo==2) {
			total = qtde * 4.50;
		}
		else if (codigo==3) {
			total = qtde * 5.00;
		}
		else if (codigo==4) {
			total = qtde * 2.00;
		}
		else {
			total = qtde * 1.50;
		}
			
	
		System.out.printf("A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}