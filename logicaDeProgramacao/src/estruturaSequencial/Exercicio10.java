/*
 * Fa�a um Programa que pe�a a temperatura em graus Celsius,
 * transforme e mostre em graus Farenheit.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em graus Celsius: ");
		double C = scan.nextDouble();
		double F = ( C * 9 / 5 ) + 32;
		System.out.printf("A temperatura em gaus Farenheit �: %.2f �F%n", F);
		
		scan.close();
	}

}
