/*
 * Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		String letra = scan.next();
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
			break;
		}
		
		scan.close();
	}
}
