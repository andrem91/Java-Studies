/*
 * Desenvolva um programa que fa�a a tabuada de um n�mero qualquer inteiro que ser� digitado pelo usu�rio,
 * mas a tabuada n�o deve necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser
 * informados tamb�m pelo usu�rio, conforme exemplo abaixo:
 * 	Montar a tabuada de: 5
 * 	Come�ar por: 4
 * 	Terminar em: 7
 * 
 * 	Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
 * 	5 X 4 = 20
 * 	5 X 5 = 25
 * 	5 X 6 = 30
 * 	5 X 7 = 35
 */

package estruturaDeRepeticao;

import java.util.Scanner;

public class exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int tabuadaDe = scan.nextInt();
		boolean valida = false;
		int comeca = 0;
		int termina = 0;
		int resultado = 0;

		while (!valida) {
			System.out.print("Come�a por: ");
			comeca = scan.nextInt();
			System.out.print("Termina em: ");
			termina = scan.nextInt();
			if (comeca > termina) {
				System.out.println("ERRO! O n�mero que come�a tem que ser maior que o n�mero que termina.");
			} else {
				valida = true;
			}
		}
		System.out.println(
				"Vou montar a tabuada de " + tabuadaDe + " come�ando em " + comeca + " e termina em " + termina + ":");
		for (int i = comeca; i <= termina; i++) {
			resultado = i * tabuadaDe;
			System.out.println(tabuadaDe + " x " + i + " = " + resultado);
		}
		scan.close();
	}
}
