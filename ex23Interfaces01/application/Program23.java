//Uma empresa deseja automatizar o processamento de seus contratos. O processamento de
//um contrato consiste em gerar as parcelas a serem pagas para aquele contrato, com base no
//número de meses desejado.
//A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas.
//Os serviços de pagamento online tipicamente cobram um juro mensal, bem como uma taxa
//por pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplica
//juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.
//Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato,
//e valor total do contrato). Em seguida, o programa deve ler o número de meses para
//parcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
//sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda parcela dois
//meses após o contrato e assim por diante. Mostrar os dados das parcelas na tela.

package application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program23 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract Value: ");
		double totalValue = sc.nextDouble();

		Contract obj = new Contract(number, date, totalValue);

		System.out.print("Enter the number of installments: ");
		int n = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());

		contractService.processContract(obj, n);

		System.out.println("Installments:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();
	}
}