/*
 * Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].
 */
package estruturaSequencial;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("informe um n�mero: ");
		int numero = scan.nextInt();
		System.out.println("O n�mero informado foi " + numero);
		
		scan.close();
	}

}
