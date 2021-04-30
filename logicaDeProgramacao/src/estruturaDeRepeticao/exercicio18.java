/*
 * Fa�a um programa que, dado um conjunto de N n�meros, determine o menor valor, o maior valor e a soma dos valores.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe quantos n�meros ter� no conjunto N: ");
		int n = scan.nextInt();
		int num = 0;
		int soma = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o " + i + "� n�mero: ");
			num = scan.nextInt();
			soma += num;

			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("A soma dos valores �: " + soma);
		System.out.println("O maior n�mero �: " + maior);
		System.out.println("O menor n�mero �: " + menor);

		scan.close();
	}
}
