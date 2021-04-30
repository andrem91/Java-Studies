/*
 * A s�rie de Fibonacci � formada pela seq��ncia 0,1,1,2,3,5,8,13,21,34,55,...
 * Fa�a um programa que gere a s�rie at� que o valor seja maior que 500.
 */

package estruturaDeRepeticao;

public class exercicio16 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 1;
		int proximo = 0;
		System.out.println(num1);
		while (num1 < 500) {
			proximo = num1 + num2;
			num1 = num2;
			num2 = proximo;
			System.out.println(num1);
		}
	}
}
