/*
 * Fa�a um programa que calcule o valor total investido por um colecionador em sua cole��o de CDs e o valor
 * m�dio gasto em cada um deles. O usu�rio dever� informar a quantidade de CDs e o valor para em cada um.
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Quantidade de CDs da cole��o: ");
		int quantidade = scan.nextInt();
		double valor = 0;
		double soma = 0;
		double media = 0;
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Informe o valor do CD " + i + ": ");
			valor = scan.nextDouble();

			soma += valor;
		}
		media = soma / quantidade;
		System.out.println("O valor total da cole��o � de : R$" + soma);
		System.out.println("A o valor m�dio de cada CD �: R$" + media);

		scan.close();
	}
}