//Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
//podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
//bem como o total de imposto arrecadado.
//Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
//são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
//seguintes:
//Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
//renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
//destes gastos são abatidos no imposto.
//Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
//fica: (50000 * 25%) - (2000 * 50%) = 11500.00
//Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
//funcionários, ela paga 14% de imposto.
//Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
//400000 * 14% = 56000.00

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<TaxPayer>();

		System.out.print("Enter the number of taxpayers: ");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.println("Taxpayer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer tp : list) {
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
		}

		System.out.println();
		double sum = 0.0;
		for (TaxPayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}