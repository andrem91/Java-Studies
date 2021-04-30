/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
 * O usu�rio deve informar de qual numero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo:
 * 	Tabuada de 5:
 * 	5 X 1 = 5
 * 	5 X 2 = 10
 * 	...
 * 	5 X 10 = 50
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um n�mero para descobrir a tabuada: ");
		int numero = scan.nextInt();
		int resultado = 0;
		for (int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
		}

		scan.close();
	}
}
