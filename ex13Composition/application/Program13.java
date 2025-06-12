//Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
//do usuário um mês e mostrar qual foi o salário do funcionário nesse mês

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program13 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("ENTER DEPARTMENT'S NAME: ");
		String departmentName = sc.nextLine();
		System.out.println("ENTER WORKER DATA: ");
		System.out.print("NAME: ");
		String workerName = sc.nextLine();
		System.out.print("LEVEL: ");
		String workerLevel = sc.nextLine();
		System.out.print("BASE SALARY: ");
		Double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("HOW MANY CONTRACTS TO THIS WORKER?: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("ENTER CONTRACT #" + i +" data:");
			System.out.print("DATE (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("VALUE PER HOUR: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("DURATION (HOURS): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);	
		}
		
		System.out.println();
		System.out.print("ENTER MONTH AND YEAR TO CALCULATE INCOME (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("NAME: "+ worker.getName());
		System.out.println("DEPARTMENT: " + worker.getDepartment().getName());
		System.out.println("INCOME FOR: " + monthAndYear + ":" + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}