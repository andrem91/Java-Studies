/*
 * Fa�a um Programa que calcule a �rea de um quadrado, em
 * seguida mostre o dobro desta �rea para o usu�rio.
 */

package estruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe a medida do lado de um quadrado (cm): ");
		double lado = scan.nextDouble();
		
		double area = Math.pow(lado, 2);
		System.out.printf("A �rea do quadrado �: %.2fcm�%n", area);
		
		scan.close();
	}
}
