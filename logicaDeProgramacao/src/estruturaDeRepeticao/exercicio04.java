/*
 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes com uma taxa anual de
 * crescimento de 3% e que a popula��o de B seja 200000 habitantes com uma taxa de crescimento
 * de 1.5%. Fa�a um programa que calcule e escreva o n�mero de anos necess�rios para que a
 * popula��o do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas de crescimento.
 */

package estruturaDeRepeticao;

public class exercicio04 {

	public static void main(String[] args) {
		double populacaoA = 80000;
		double crescimentoAnualA = 3;

		double populacaoB = 200000;
		double crescimentoAnualB = 1.5;

		int ano = 0;
		while (populacaoA <= populacaoB) {
			populacaoA += (populacaoA * crescimentoAnualA / 100);
			populacaoB += (populacaoB * crescimentoAnualB / 100);

			ano++;
		}
		System.out.println("o n�mero de anos necess�rios para que a popula��o do pa�s A ultrapasse ou iguale a\r\n"
				+ "popula��o do pa�s B �: " + ano + " anos.");
		System.out.println("Popula��o A: " + populacaoA);
		System.out.println("Popula��o B: " + populacaoB);
	}
}
