/*
 * Fa�a um Programa para leitura de tr�s notas parciais de um aluno. O programa deve calcular
 * a m�dia alcan�ada por aluno e presentar: Resolu��o
 * a. A mensagem "Aprovado", se a m�dia for maior ou igual a 7, com a respectiva m�dia alcan�ada;
 * b. A mensagem "Reprovado", se a m�dia for menor do que 7, com a respectiva m�dia alcan�ada;
 * c. A mensagem "Aprovado com Distin��o", se a m�dia for igual a 10.
 */

package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		String mensagem;
		if(media == 10) {
			mensagem = "Aprovado com distin��o";
		} else if(media >= 7 ) {
			mensagem = "APROVADO";
		} else {
			mensagem = "REPROVADO";
		}
		
		System.out.printf("M�dia: %.2f%n", media);
		System.out.println("Status: " + mensagem);
		
		scan.close();
		
	}

}
