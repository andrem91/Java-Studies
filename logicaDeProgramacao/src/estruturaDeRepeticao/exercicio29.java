/*
 * O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende implantar a metodologia da tabelinha, que
 * j� � um sucesso na sua loja de 1,99. Voc� foi contratado para desenvolver o programa que monta a tabela de
 * pre�os de p�es, de 1 at� 50 p�es, a partir do pre�o do p�o informado pelo usu�rio, conforme o exemplo abaixo:
 * 	Pre�o do p�o: R$ 0.18
 * 	Panificadora P�o de Ontem - Tabela de pre�os
 * 	1 - R$ 0.18
 * 	2 - R$ 0.36
 * 	...
 * 	50 - R$ 9.00
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Pre�o do p�o : R$ ");
		double preco = scan.nextDouble();
		double total = 0;
		for (int i = 1; i <= 50; i++) {
			total = preco * i;
			System.out.printf("%d - R$ %.2f%n", i, total);
		}
		scan.close();
	}
}
