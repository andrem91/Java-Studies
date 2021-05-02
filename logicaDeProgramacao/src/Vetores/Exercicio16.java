/*
 * Criar um vetor A com 10 elementos inteiros. Escrever um programa que calcule e escreva:
 * a) a soma de elementos armazenados neste vetor que s�o inferiores a 15;
 * b) a quantidade de elementos armazenados no vetor que s�o iguais a 15;
 * c) a m�dia dos elementos armazenados no vetor que s�o superiores a 15.
 */

package Vetores;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int menor15 = 0;
		int igual15 = 0;
		int maior15 = 0;
		int qtdMaior15 = 0;
		double mediaMaior15 = 1;

		for (int i = 0; i < A.length; i++) {
			System.out.print("insira um n�mero para o indice" + i + ": ");
			A[i] = scan.nextInt();
			if (A[i] < 15) {
				menor15 += A[i];
			} else if (A[i] == 15) {
				igual15++;
			} else if (A[i] > 15) {
				maior15 += A[i];
				qtdMaior15++;
			}
		}
		mediaMaior15 = maior15 / qtdMaior15;
		System.out.println("A soma dos elementos menores que 15 �: " + menor15);
		System.out.println("A quantidade dos elementos igual a 15 �: " + igual15);
		System.out.println("A media dos elementos maior que 15 �: " + mediaMaior15);
		scan.close();
	}

}
