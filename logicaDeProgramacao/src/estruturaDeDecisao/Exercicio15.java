/*
 * Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo.
 * Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
 * Dicas:
 * Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
 * Tri�ngulo Equil�tero: tr�s lados iguais;
 * Tri�ngulo Is�sceles: quaisquer dois lados iguais;
 * Tri�ngulo Escaleno: tr�s lados diferentes;
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os 3 lados de um tri�ngulo: ");
		System.out.print("Lado 1: ");
		double lado1 = scan.nextDouble();
		System.out.print("Lado 2: ");
		double lado2 = scan.nextDouble();
		System.out.print("Lado 3: ");
		double lado3 = scan.nextDouble();
		
		String triangulo = "";

		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado2 == lado3) {
				triangulo = "Equil�tero";
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				triangulo = "Is�sceles";
			} else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
				triangulo = "Escaleno";
			}
			System.out.println("� um tri�ngulo " + triangulo);
		} else {
			System.out.println("N�o � um tri�ngulo");
		}
		
		scan.close();
	}
}
