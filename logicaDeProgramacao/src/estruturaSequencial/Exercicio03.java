/*
 * Fa�a um Programa que pe�a dois n�meros e imprima a soma.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Informe outro n�mero: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + soma );
		
		scan.close();
	}

}
