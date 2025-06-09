//Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
//N funcionários. Não deve haver repetição de id.
//Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
//Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
//mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
//conforme exemplos.
//Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
//ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
//aumento por porcentagem dada.

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee01;

public class Program09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee01> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee01 emp = new Employee01(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for(Employee01 emp : list) {
			System.out.println(emp);
		}
		
		sc.close();

	}
	
	public static Integer position(List<Employee01> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee01> list, int id) {
		Employee01 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}