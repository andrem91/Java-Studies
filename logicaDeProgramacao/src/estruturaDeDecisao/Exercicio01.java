/*
 * Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro n�mero: ");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		scan.close();
	}
}
