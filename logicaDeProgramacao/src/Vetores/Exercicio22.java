/*
 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que verifique se
 * "todos" os elementos do vetor A s�o pares. Se pelo menos um elemento do vetor n�o for
 * par o processo de repeti��o para percorrer os elementos do vetor deve ser encerrado,
 * como sugest�o: utilize uma vari�vel do tipo flag para atingir este prop�sito.
 */
package Vetores;

public class Exercicio22 {

	public static void main(String[] args) {
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * 100);
			System.out.println(A[i]);
			if (A[i] % 2 != 0) {
				System.out.println("N�mero impar. programa encerrado.");
				break;
			}
		}
	}

}
