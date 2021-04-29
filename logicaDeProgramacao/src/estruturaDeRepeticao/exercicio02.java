/*
 * Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio,
 * mostrando uma mensagem de erro e voltando a pedir as informa��es.
 */
package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean infoValida = false;
		String userName;
		String password;
		while (!infoValida) {
			System.out.print("Digite o nome de usu�rio: ");
			userName = scan.next();
			System.out.print("Digite a senha: ");
			password = scan.next();

			if (userName.equals(password)) {
				System.out.println("Nome e senha n�o podem ser iguais. Tente novamente.");
			} else {
				infoValida = true;
				System.out.println("Nome de usu�rio e senha salvas com sucesso.");
			}
		}
		scan.close();
	}
}
