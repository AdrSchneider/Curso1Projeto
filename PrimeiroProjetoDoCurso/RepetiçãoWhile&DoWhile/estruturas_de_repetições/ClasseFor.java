package estruturas_de_repetições;

public class ClasseFor {
	
	public static void main(String[] args) {
	
		/*A estrutura de repetição FOR é mais utilizada quando sabemos quantas vezes queremos repetir!*/
		
		/*Pode ser usadas desta forma, declarando primeiro a variável*/
		int numero = 0;
		/*Mas é preciso lembrar que quando declarar antes, precisa deixar o primeiro campo vazio, apenas com o ;*/
		for (; numero <= 10; numero ++) {
			System.out.println("numero é: " + numero);
			
			/*Ou pode ser feito com a declaração dentro da Estrutura do For*/
			/*Desta forma o campo da declaração da variavel é preenchido, e só é executado a primeira vez*/
			for (int numero2 = 0; numero <= 10; numero ++) {
				System.out.println("O numero atual é : " + numero2);
				
			}
			
		}
			
			
		
	}

}
