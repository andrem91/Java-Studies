/*
 * Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Digite o ultimo n�mero: ");
		int num3 = scan.nextInt();
		
		int maior = num1;
		int menor = num1;
		
		if(num2 > maior) {
			maior = num2;
		}
		if(num3 > maior) {
			maior = num3;
		}
		
		if(num2 < menor) {
			menor = num2;
		}
		if(num3 < menor) {
			menor = num3;
		}
		
		System.out.println("Maior n�mero: " + maior);
		System.out.println("Menor n�mero: " + menor);
		
		scan.close();
	}
}
