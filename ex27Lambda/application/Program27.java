//Fazer um programa para ler os dados (nome, email e salário)
//de funcionários a partir de um arquivo em formato .csv.
//Em seguida mostrar, em ordem alfabética, o email dos
//funcionários cujo salário seja superior a um dado valor
//fornecido pelo usuário.
//Mostrar também a soma dos salários dos funcionários cujo
//nome começa com a letra 'M'.

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee27;

public class Program27 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee27> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee27(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();

			List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted()
					.collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);

			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0,
					(x, y) -> x + y);

			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}