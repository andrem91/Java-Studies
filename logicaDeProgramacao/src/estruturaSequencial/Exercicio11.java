/*
 * Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
		int num1 = scan.nextInt();
		System.out.print("Informe outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		System.out.print("Iforme um n�mero real: ");
		double num3 = scan.nextDouble();
		
		double A = (num1 * 2) * (num2 / 2);
		System.out.println("O produto do dobro de " + num1 + " com metade de " + num2 + " �: " + A);
		
		double B = (num1 * 3) + num3;
		System.out.println("A soma do triplo de " + num1 + " com " + num3 + " �: " + B);
		
		double C = Math.pow(num3, 3);
		System.out.println(num3 + " elevado ao cubo �: " + C);
		
		scan.close();

	}

}
