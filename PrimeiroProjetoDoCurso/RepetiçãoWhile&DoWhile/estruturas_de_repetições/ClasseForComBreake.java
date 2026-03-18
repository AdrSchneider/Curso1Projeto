package estruturas_de_repetições;

public class ClasseForComBreake {

	public static void main(String[] args) {

		/* Vamos ver uma estrutura de repetição FOR com BREAK (PARADA) */

		for (int numero = 0; numero <= 10; numero++) {

			if (numero == 7) {
				System.out.println("Encontrei o numero 7");
				continue;
				/*
				 * Este comando continue ele faz com que o comando abaixo não seja executado
				 * quando entrar na condição do If Por exemplo, quando ele encontrar o numero 7,
				 * ele não executará o comando sysout abaixo e sim, irá retornar ao inicio do
				 * bloco
				 * Ou seja, um exemplo: o "produto" que esta sendo verificado no if, não pode ser 
				 * executado nos comandos abaixos, ai se usa o continue, para que volte ao inicio do bloco
				 */
				}
			System.out.println("Atual: " + numero);
		}
	}

}
