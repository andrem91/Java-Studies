/*
 * Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
 * produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o pre�o do primeiro produto: ");
		double produto1 = scan.nextDouble();
		System.out.println("Informe o pre�o do segundo produto: ");
		double produto2 = scan.nextDouble();
		System.out.println("Informe o pre�o do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if(produto1 <= produto2 || produto1 <= produto3) {
			System.out.println("O primero produto � o mais barato.");
		} else if(produto2 <= produto3) {
			System.out.println("O segundo produto � o mais barato");
		} else {
			System.out.println("O terceiro produto � o mais barato");
		}
		
		scan.close();
	}
}
