/*
 * Fa�a um Programa que pe�a a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * o C = (5 * (F-32) / 9).
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Farenheit: ");
		double F = scan.nextDouble();
		
		double C = (5 * ( F-32 ) / 9);
		
		System.out.printf("a temperatura em graus Celsius � de: %.2f �C%n", C);
		
		scan.close();

	}

}
