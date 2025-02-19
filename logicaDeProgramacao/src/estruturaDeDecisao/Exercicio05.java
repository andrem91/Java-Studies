/*
 * Fa�a um programa para a leitura de duas notas parciais de um aluno.
 * O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
 * o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
 * o A mensagem "Reprovado", se a m�dia for menor do que sete;
 * o A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		if(media == 10) {
			System.out.println("APROVADO COM DISTIN��O");
		} else if(media >= 7) {
			System.out.println("APROVADO");
		} else if (media < 7) {
			System.out.println("REPROVADO");
		}
		
		scan.close();
	}
}
