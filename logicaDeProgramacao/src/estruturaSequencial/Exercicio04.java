/*
 * Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		double nota1 = scan.nextInt();
		System.out.print("Digite a nota 2: ");
		double nota2 = scan.nextInt();
		System.out.print("Digite a nota 3: ");
		double nota3 = scan.nextInt();
		System.out.print("Digite a nota 4: ");
		double nota4 = scan.nextInt();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("M�DIA: %.2f%n", media);
		scan.close();

	}

}
