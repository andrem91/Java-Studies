/*
 * Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o raio do c�rculo (cm): ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A �rea do c�rculo � %.2fcm�%n", area);
		
		scan.close();
	}

}
