/*
 * Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a quantidade de n�meros pares e a quantidade de n�meros impares.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero;
		int impar = 0;
		int par = 0;
		for (int i = 0; i <= 10; i++) {
			System.out.print("Informe o " + i + "� n�mero: ");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros impares: " + impar);

		scan.close();
	}
}
