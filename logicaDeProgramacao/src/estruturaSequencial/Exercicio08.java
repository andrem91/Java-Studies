/*
 * Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas
 * trabalhadas no m�s. Calcule e mostre o total do seu sal�rio no referido m�s.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto voc� ganha por hora? R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Quantas horas voc� trabalha por m�s? ");
		int horas = scan.nextInt();
		
		double salarioMes = salarioHora * horas;
		System.out.printf("Total do seu sal�rio no m�s foi R$%.2f%n ", salarioMes);
		
		scan.close();
	}

}
