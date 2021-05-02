/*
 * Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo que nos
 * vetor B e C ser�o armazenados o valores pares e �mpares de A, respectivamente.
 */
package Vetores;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[20];
		int[] par = new int[A.length];
		int[] impar = new int[A.length];
		int posPar = 0;
		int posImpar = 0;

		for (int i = 0; i < A.length; i++) {
			System.out.print("Digite um n�mero para o indice " + i + ": ");
			A[i] = scan.nextInt();
			if (A[i] % 2 == 0) {
				par[posPar] = A[i];
				posPar++;
			}
			if (A[i] % 2 != 0) {
				impar[posImpar] = A[i];
				posImpar++;
			}
		}

		System.out.print("N�meros pares: ");
		for (int i = 0; i < posPar; i++) {
			System.out.print(par[i] + " ");
		}

		System.out.print("\nN�meros impares: ");
		for (int i = 0; i < posImpar; i++) {
			System.out.print(impar[i] + " ");
		}
		scan.close();
	}

}
