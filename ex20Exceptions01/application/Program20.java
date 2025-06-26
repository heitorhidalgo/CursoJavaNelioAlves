//Fazer um programa para ler os dados de uma conta bancária e depois realizar um
//saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
//ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
//saque da conta.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account01;
import exceptions.BusinessException;

public class Program20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account01 acc = new Account01(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}