/*
 * Implementar um programa que obtenha a cota��o do d�lar (U$) em rela��o ao real (R$) e a seguir
 * armazene em vetor A com 20 elementos as seguintes convers�es:
 * 		A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.
 */
package Vetores;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cotacaoDolar = 5.62;
		double[] conversao = new double[20];
		int real = 1;
		for (int i = 0; i < conversao.length; i++) {
			conversao[i] = cotacaoDolar * real;
			System.out.println("R$" + real + " = USD" + conversao[i]);
			real++;
		}
		scan.close();
	}

}
