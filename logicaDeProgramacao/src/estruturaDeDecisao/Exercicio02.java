/*
 * Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int numero = scan.nextInt();
		
		if(numero < 0) {
			System.out.println("O n�mero " + numero + " � negativo.");
		} else {
			System.out.println("O n�mero " + numero + " � positivo.");
		}
		scan.close();
	}
}
