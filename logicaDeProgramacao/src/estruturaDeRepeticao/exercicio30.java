/*
 * O Sr. Manoel Joaquim expandiu seus neg�cios para al�m dos neg�cios de 1,99 e agora possui uma loja de conveni�ncias.
 * Fa�a um programa que implemente uma caixa registradora rudimentar. O programa dever� receber um n�mero desconhecido
 * de valores referentes aos pre�os das mercadorias. Um valor zero deve ser informado pelo operador para indicar o final
 * da compra. O programa deve ent�o mostrar o total da compra e perguntar o valor em dinheiro que o cliente forneceu,
 * para ent�o calcular e mostrar o valor do troco. Ap�s esta opera��o, o programa dever� voltar ao ponto inicial, para
 * registrar a pr�xima compra. A sa�da deve ser conforme o exemplo abaixo:
 * 	Lojas Tabajara 
 * 	Produto 1: R$ 2.20
 * 	Produto 2: R$ 5.80
 * 	Produto 3: R$ 0
 * 	Total: R$ 9.00
 * 	Dinheiro: R$ 20.00
 * 	Troco: R$ 11.00
 * 	...
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		String continuarCompra;
		double preco = 0;
		int count = 0;
		double total = 0;
		double dinheiro = 0;
		double troco = 0;
		do {
			System.out.print("Deseja informar uma nova compra? (S/N)");
			continuarCompra = scan.next();
			if (continuarCompra.equalsIgnoreCase("N")) {
				sair = true;
			} else if (continuarCompra.equalsIgnoreCase("S")) {
				System.out.println("===LOJAS TABAJARAS===");
				count = 0;
				total = 0;
				do {
					count++;
					System.out.print("Produto " + count + ": R$ ");
					preco = scan.nextDouble();
					total += preco;
				} while (preco != 0);
				System.out.println("Total: R$ " + total);
				System.out.print("Dinheiro: R$ ");
				dinheiro = scan.nextDouble();
				troco = dinheiro - total;
				System.out.println("Troco: R$ " + troco);
			}
		} while (!sair);
		System.out.println("Programa finalizado!");
		scan.close();
	}
}
