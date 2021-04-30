/*
 * Altere o programa de c�lculo do fatorial, permitindo ao usu�rio calcular o fatorial
 * v�rias vezes e limitando o fatorial a n�meros inteiros positivos e menores que 16.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero = 0;

		boolean valida = false;
		while (!valida) {
			while (!valida) {
				System.out.print("Digite um n�mero para descobrir seu fatorial: ");
				numero = scan.nextInt();
				if (numero >= 16) {
					System.out.println("N�mero inv�lido. Voc� deve digitar um n�mero menor que 16.");
				} else {
					valida = true;
				}
			}
			valida = false;
			int fat = 1;
			int numero2 = numero;
			while (numero > 0) {
				fat *= numero;
				numero--;
			}
			System.out.println(numero2 + "! = " + fat);
			boolean opcaoValida = false;
			while (!opcaoValida) {
				System.out.print("Deseja calcular outro fatorial (S-N)?");
				String repetir = scan.next();
				if (repetir.equalsIgnoreCase("n")) {
					System.out.println("Fim!");
					valida = true;
					opcaoValida = true;
				} else if (repetir.equalsIgnoreCase("s")) {
					opcaoValida = true;
				} else {
					System.out.println("Op��o inv�lida. Digire S para sim e N para n�o.");
				}
			}
		}
		scan.close();
	}
}