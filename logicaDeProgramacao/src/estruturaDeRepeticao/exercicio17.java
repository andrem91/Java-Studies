/*
 * Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero para descobrir seu fatorial: ");
		int numero = scan.nextInt();
		int numero2 = numero;
		int fat = 1;
		while (numero > 0) {
			fat *= numero;
			numero--;
		}
		System.out.println(numero2 + "! = " + fat);
		scan.close();
	}
}
