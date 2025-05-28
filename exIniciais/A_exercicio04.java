//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class A_exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHoraTrabalhada = sc.nextDouble();
		
		double salario = valorPorHoraTrabalhada*horasTrabalhadas;
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = R$ %.2f%n", salario);
		
		sc.close();
	}

}