package Executavel;

public class Variavel_Local_Global {
	
	/*Esse variável é Global, porque ela está no package, ou fora de métodos e o seu valor é compartilhado*/
	static int maioridadeGlobal= 30;
	
	/*Main é um método auto executavel em Java*/
	public static void main(String[] args) {
		
		/*Variável Local, porque pertence somente a esse método e o seu valor fica dentro do metodo*/
		int maioridade = 18;
		System.out.println("Valor da variavel local é: " + maioridade);
		
		metodo2();
	}
	
	public static void metodo2 () { 
		System.out.println("Valor da variavel global é igual: " + maioridadeGlobal);
	}
	
}
