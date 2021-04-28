/*
 * As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e
 * lhe contraram para desenvolver o programa que calcular� os reajustes.
 * Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte
 * crit�rio, baseado no sal�rio atual:
 *   * sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
 *   * sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
 *   * sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 *   * sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
 *   * o sal�rio antes do reajuste;
 *   * o percentual de aumento aplicado;
 *   * o valor do aumento;
 *   * o novo sal�rio, ap�s o aumento.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o sal�rio do colaborador: R$");
		double antigoSalario = scan.nextDouble();
		int percentAumento;
		if(antigoSalario <= 280.00) {
			percentAumento = 20;
		} else if(antigoSalario <= 700.00) {
			percentAumento = 15;
		} else if(antigoSalario <= 1500.00) {
			percentAumento = 10;
		} else {
			percentAumento = 5;
		}
		
		double valorAumento = antigoSalario * percentAumento / 100;
		double novoSalario = valorAumento + antigoSalario;
		
		System.out.printf("Sal�rio antes do reajuste: R$%.2f%n", antigoSalario);
		System.out.println("Percentual de aumento aplicado: " + percentAumento + "%");
		System.out.printf("Valor do aumento: R$%.2f%n", valorAumento);
		System.out.printf("Novo sal�rio: R$%.2f%n", novoSalario);
		
		scan.close();
	}
}
