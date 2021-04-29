/*
 * Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
 * a. �lcool:
 * b. at� 20 litros, desconto de 3% por litro
 * c. acima de 20 litros, desconto de 5% por litro
 * d. Gasolina:
 * e. at� 20 litros, desconto de 4% por litro
 * f. acima de 20 litros, desconto de 6% por litro
 * Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de combust�vel (codificado da
 * seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente
 * sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o combust�vel (A ou G): ");
		String combustivel = scan.next();
		System.out.print("Informe a quantidade em litros: ");
		double litros = scan.nextDouble();
		double desconto = 0;
		double valor = 0;
		if (combustivel.equalsIgnoreCase("A")) {
			valor = 1.9;
			if (litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
		} else if (combustivel.equalsIgnoreCase("G")) {
			valor = 2.5;
			if (litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
		}

		double total = (valor * litros) - (valor * litros * desconto / 100);
		System.out.println("Valor a ser pago �: " + total);

		scan.close();
	}
}
