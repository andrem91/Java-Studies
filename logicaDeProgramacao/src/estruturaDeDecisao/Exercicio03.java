/*
 * Fa�a um Programa que verifique se uma letra digitada � "F" ou "M".
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Infome o sexo (F ou M): ");
		char sexo = scan.next().charAt(0);
		
		if(sexo == 'M') {
			System.out.println("Masculino");
		} else if (sexo == 'F') {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo inv�lido");
		}
		
		scan.close();
	}
}
