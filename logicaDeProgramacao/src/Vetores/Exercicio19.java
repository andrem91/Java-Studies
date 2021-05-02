/*
 * Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar as notas informadas
 * em dois vetores �Nota1� e �Nota2� do tipo real. Escreva um programa que calcule a m�dia
 * aritm�tica simples das notas informadas armazenando o resultado em um vetor �Result� de
 * mesmo tipo e tamanho. Ao mostrar os resultados exibir a situa��o de cada aluno. Se a m�dia
 * calculada for superior ou igual a 7 o aluno estar� �aprovado�, caso contr�rio, a situa��o
 * do aluno ser� �reprovado�.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas1.length];
		String output = "";
		for (int i = 0; i < notas1.length; i++) {
			System.out.print("Digite a nota 1 do aluno " + i + ": ");
			notas1[i] = scan.nextDouble();
			System.out.print("Digite a nota 2 do aluno " + i + ": ");
			notas2[i] = scan.nextDouble();
		}

		for (int i = 0; i < results.length; i++) {
			results[i] = (notas1[i] + notas2[i]) / 2;
			output = "A nota do aluno de indice " + i + " foi " + results[i] + " Aluno foi ";
			if (results[i] >= 7) {
				System.out.println(output + "APROVADO");
			} else if (results[i] < 7) {
				System.out.println(output + "REPROVADO");
			}
		}
		scan.close();
	}

}
