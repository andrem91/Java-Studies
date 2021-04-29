/*
 * Altere o programa anterior permitindo ao usu�rio informar as popula��es e as
 * taxas de crescimento iniciais. Valide a entrada e permita repetir a opera��o.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double populacaoA = 0;
		double crescimentoAnualA = 0;

		double populacaoB = 0;
		double crescimentoAnualB = 0;

		boolean valido = false;

		do {
			System.out.print("Entre com a popula��o A: ");
			populacaoA = scan.nextDouble();

			if (populacaoA > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o A precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a popula��o B: ");
			populacaoB = scan.nextDouble();

			if (populacaoB > 0) {
				valido = true;
			} else {
				System.out.println("Popula��o B precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a taxa de crescimento da popul��o A: ");
			crescimentoAnualA = scan.nextDouble();

			if (crescimentoAnualA > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento A precisa ser maior do que zero.");
			}
		} while (!valido);

		valido = false;
		do {
			System.out.print("Entre com a taxa de crescimento da popul��o B: ");
			crescimentoAnualB = scan.nextDouble();

			if (crescimentoAnualB > 0) {
				valido = true;
			} else {
				System.out.println("A taxa de crescimento B precisa ser maior do que zero.");
			}
		} while (!valido);

		int ano = 0;
		while (populacaoA <= populacaoB) {
			populacaoA += (populacaoA * crescimentoAnualA / 100);
			populacaoB += (populacaoB * crescimentoAnualB / 100);

			ano++;
		}
		System.out.println("o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a\r\n"
				+ "popula��o do pa�s B �: " + ano + " anos.");
		System.out.println("Popula��o A: " + populacaoA);
		System.out.println("Popula��o B: " + populacaoB);
		scan.close();
	}
}
