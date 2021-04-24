/*
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o
 * n�mero de horas trabalhadas no m�s. Calcule e mostre o total do seu
 * sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o
 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um
 * programa que nos d�:
 * . sal�rio bruto.
 * a. quanto pagou ao INSS.
 * b. quanto pagou ao sindicato.
 * c. o sal�rio l�quido.
 * d. calcule os descontos e o sal�rio l�quido, conforme a tabela
 * abaixo:
 * + Sal�rio Bruto : R$ - IR (11%) : R$ - INSS
 * (8%) : R$ - Sindicato ( 5%) : R$ = Sal�rio
 * Liquido : R$
 * Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora? R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Quantas horas voc� trabalha por m�s? ");
		int horas = scan.nextInt();
		
		double salarioBruto = salarioHora * horas;
		System.out.printf("Sal�rio Bruto +R$%.2f%n", salarioBruto);
		
		double descontoIR = salarioBruto * 0.11;
		System.out.printf("Desconto Imposto de Renda -R$%.2f%n", descontoIR);
		
		double descontoINSS = salarioBruto * 0.08;
		System.out.printf("Desconto INSS -R$%.2f%n", descontoINSS);
		
		double descontoSindicato = salarioBruto * 0.05;
		System.out.printf("Desconto sindicato -R$%.2f%n", descontoSindicato);
		
		double totalDescontos = descontoIR + descontoINSS + descontoSindicato;
		double salarioLiquido = salarioBruto - totalDescontos;
		System.out.printf("Sal�rio L�quido +R$%.2f%n", salarioLiquido);
		
		scan.close();
	}

}
