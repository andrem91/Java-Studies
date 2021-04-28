/*
 * Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em
 * seguida informe se este ano � ou n�o bissexto.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um ano: ");
		int ano = scan.nextInt();

		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " � ano bissesto.");
		} else {
			System.out.println(ano + " n�o � ano bissesto.");
		}
		
		scan.close();
	}

}
