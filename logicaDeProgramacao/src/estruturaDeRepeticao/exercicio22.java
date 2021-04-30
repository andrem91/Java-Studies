/*
 * Altere o programa de c�lculo dos n�meros primos, informando, caso
 * o n�mero n�o seja primo, por quais n�mero ele � divis�vel.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio22 {

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
			System.out.print("Ele � divis�vel por: ");
			for (int i = 2; i < numero; i++) {
				if (numero % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		scan.close();
	}
}