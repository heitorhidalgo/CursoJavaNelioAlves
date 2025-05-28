//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Locale;
import java.util.Scanner;

public class B_exercicioCond07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.println("origem");
		}
		else if(x == 0) {
			System.out.println("eixo y");
		}
		else if(y == 0) {
			System.out.println("eixo x");
		}
		else if(x > 0.0 && y > 0.0) {
			System.out.println("Quadrante 1");
		}
		else if(x < 0.0 && y > 0.0) {
			System.out.println("Quadrante 2");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.println("Quadrante 3");
		}
		else {
			System.out.println("Quadrante 4");
		}

		sc.close();
	}
}