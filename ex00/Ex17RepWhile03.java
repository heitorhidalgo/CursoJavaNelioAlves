//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Scanner;

public class Ex17RepWhile03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		int tipo = sc.nextInt();
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		
		while(tipo != 4) {
			if (tipo == 1) {
				Alcool = Alcool + 1;
			}
			else if(tipo == 2) {
				Gasolina = Gasolina + 1;
			}
			else if (tipo == 3) {
				Diesel = Diesel + 1;
			}
			
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel " + Diesel);
			
		sc.close();
	}

}