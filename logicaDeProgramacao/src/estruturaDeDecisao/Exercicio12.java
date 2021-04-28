/*
 * Fa�a um programa para o c�lculo de uma folha de pagamento, sabendo que os descontos s�o do
 * Imposto de Renda, que depende do sal�rio bruto (conforme tabela abaixo) e
 * 3% para o Sindicato e que o FGTS corresponde a 11% do Sal�rio Bruto, mas n�o � descontado
 * (� a empresa que deposita). O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos.
 * O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s.
 *   Desconto do IR:
 *   * Sal�rio Bruto at� 900 (inclusive) - isento
 *   * Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
 *   * Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
 *   * Sal�rio Bruto acima de 2500 - desconto de 20%
 *   * Imprima na tela as informa��es, dispostas conforme o exemplo abaixo.
 *   * No exemplo o valor da hora � 5 e a quantidade de hora � 220.
 *   ```
 *       Sal�rio Bruto: (5 * 220)        : R$ 1100,00
 *       (-) IR (5%)                     : R$   55,00  
 *       (-) INSS ( 10%)                 : R$  110,00
 *       FGTS (11%)                      : R$  121,00
 *       Total de descontos              : R$  165,00
 *       Sal�rio Liquido                 : R$  935,00
 *   ```
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o valor das da sua hora: ");
		int valorHora = scan.nextInt();
		System.out.print("Informe  quantidade de horas trabalhadas no m�s: ");
		int horasTrabalhadas = scan.nextInt();
		double salarioBruto = (double) valorHora * (double )horasTrabalhadas;
		int percentDescontoIR;
		if(salarioBruto <= 900) {
			percentDescontoIR = 0;
		} else if(salarioBruto <= 1500) {
			percentDescontoIR = 5;
		} else if(salarioBruto <= 2500) {
			percentDescontoIR = 10;
		} else {
			percentDescontoIR = 20;
		}
		
		double descontoIR = salarioBruto * percentDescontoIR / 100;
		double descontoINSS = salarioBruto * 0.1;
		double FGTS = salarioBruto * 0.11;
		double totalDesconto = descontoINSS + descontoIR;
		double salarioLiquido = salarioBruto - totalDesconto;
		System.out.println("Sal�rio bruto: ("+ valorHora + " * " + horasTrabalhadas + ") : R$" + salarioBruto);
		System.out.println("(-) IR (" + percentDescontoIR + "%) : R$" + descontoIR);
		System.out.println("(-) INSS (10%): R$" + descontoINSS);
		System.out.println("FGTS (11%): R$" + FGTS);
		System.out.println("Total de descontos: R$" +  totalDesconto);
		System.out.println("Sal�rio L�quido: R$" + salarioLiquido);
		
		scan.close();
	}
}
