/*
 * Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o: Resolu��o
 * a. "Telefonou para a v�tima?"
 * b. "Esteve no local do crime?"
 * c. "Mora perto da v�tima?"
 * d. "Devia para a v�tima?"
 * e. "J� trabalhou com a v�tima?"
 * O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime.
 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
 */
package estruturaDeDecisao;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Responde S para sim ou N para n�o.");
		System.out.print("Telefonou para a v�tima?");
		String pergunta1 = scan.next();
		System.out.print("Esteve no local do crime?");
		String pergunta2 = scan.next();
		System.out.print("Mora perto da v�tima?");
		String pergunta3 = scan.next();
		System.out.print("Devia para a v�tima?");
		String pergunta4 = scan.next();
		System.out.print("J� trabalhou com a v�tima?");
		String pergunta5 = scan.next();
		
		int count = 0;
		if(pergunta1.equalsIgnoreCase("S")) count++;
		if(pergunta2.equalsIgnoreCase("S")) count++;
		if(pergunta3.equalsIgnoreCase("S")) count++;
		if(pergunta4.equalsIgnoreCase("S")) count++;
		if(pergunta5.equalsIgnoreCase("S")) count++;
		
		String classificacao;
		if(count == 2) {
			classificacao = "Suspeito";
		} else if(count == 3 || count == 4) {
			classificacao = "C�mplice";
		} else if(count == 5) {
			classificacao = "Assassino";
		} else {
			classificacao = "Inocente";
		}
		
		
		System.out.println("Respondeu positivamente a " + count + " Quest�es. Sua classicica��o � " + classificacao + ".");
		scan.close();
	}
}
