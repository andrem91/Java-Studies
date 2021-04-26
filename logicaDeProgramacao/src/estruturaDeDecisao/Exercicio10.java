/*
 * Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar
 * M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!",
 * "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Em que turno voc� estuda (M-V-N)? ");
		String turno = scan.next();
		
		switch(turno) {
		case "M":System.out.println("Bom dia!"); break;
		case "V":System.out.println("Boa tarde!"); break;
		case "N":System.out.println("Boa noite!"); break;
		default:System.out.println("Valor invalido."); break;
		}
		
		scan.close();
	}
}
