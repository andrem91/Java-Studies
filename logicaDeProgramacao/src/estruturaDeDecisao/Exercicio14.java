/*
 * Fa�a um programa que l� as duas notas parciais obtidas por um aluno numa
 * disciplina ao longo de um semestre, e calcule a sua m�dia.
 * A atribui��o de conceitos obedece � tabela abaixo:
 *   M�dia de Aproveitamento  Conceito
 *   Entre 9.0 e 10.0        A
 *   Entre 7.5 e 9.0         B
 *   Entre 6.0 e 7.5         C
 *   Entre 4.0 e 6.0         D
 *   Entre 4.0 e zero        E
 * O algoritmo deve mostrar na tela as notas, a m�dia,o conceito
 * correspondente e a mensagem �APROVADO� se o conceito for
 * A, B ou C ou �REPROVADO� se o conceito for D ou E.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		char conceito;
		if (media < 4) {
			conceito = 'E';
		} else if (media < 6) {
			conceito = 'D';
		} else if (media < 7.5) {
			conceito = 'C';
		} else if (media < 9) {
			conceito = 'B';
		} else {
			conceito = 'A';
		}

		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("M�dia: " + media);
		System.out.println("Conceito: " + conceito);
		
		switch (conceito) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("APROVADO");
			break;
		case 'D':
		case 'E':
			System.out.println("REPROVADO");
			break;
		}
		scan.close();
	}
}
