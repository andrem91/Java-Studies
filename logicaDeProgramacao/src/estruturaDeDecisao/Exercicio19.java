/*
 * Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar.
 * Dica: utilize o operador m�dulo (resto da divis�o).
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = scan.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O n�mero " + numero + " � par.");
		} else {
			System.out.println("O n�mero " + numero + " � impar.");
		}
		scan.close();
	}
}
