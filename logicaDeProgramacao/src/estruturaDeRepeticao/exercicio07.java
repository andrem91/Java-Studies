/*
 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		int num;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "� n�mero: ");
			num = scan.nextInt();
			if (maior < num) {
				maior = num;
			}
		}
		System.out.println("Maior n�mero foi: " + maior);
		scan.close();
	}
}
