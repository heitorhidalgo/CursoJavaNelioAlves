package entities;

public class Employee {
	
	public String name; 
	public double grossSalary; //salario bruto
	public double tax; //imposto
	
	public double netSalary() { //calcular salario liquido
		return grossSalary-tax;		
	}
	
	public void increaseSalary(double percentage) { //calcular aumento do salario com base em porcentagem dada
		grossSalary += grossSalary*percentage/100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}