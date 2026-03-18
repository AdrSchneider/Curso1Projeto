package estruturas_de_repetições;

public class repeticaoWhile {

	public static void main(String[] args) {

		/* Estrutura de repetição While */
		/* Relembrando: Vamos repetir enquanto uma condição for verdadeira */

		int numero = 0;
		/*Aqui o While primeiro VERIFICA e DEPOIS executa o bloco de código*/
		while (numero <= 10) {
			System.out.println("O numero atual é: " + numero);
			numero++;

		}
		/*Aqui o Do While primeiro EXECUTA e DEPOIS VERIFICA*/
		int numero2 = 0;
		do {
			System.out.println("O numero2 atual é : " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}

}
