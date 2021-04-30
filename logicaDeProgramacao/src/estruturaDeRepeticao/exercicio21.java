/*
 * Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou n�o um n�mero primo.
 * Um n�mero primo � aquele que � divis�vel somente por ele mesmo e por 1.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		boolean primo = true;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				primo = false;
			}
		}
		if (primo) {
			System.out.println("O n�mero " + numero + " � primo.");
		} else {
			System.out.println("O n�mero " + numero + " n�o � primo.");
		}
		scan.close();
	}
}