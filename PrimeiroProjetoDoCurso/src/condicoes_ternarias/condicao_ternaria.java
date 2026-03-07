package condicoes_ternarias;

public class condicao_ternaria {
	
	/*Aqui nós vamos aprender um pouco sobre condições ternárias*/
	
	/*Aqui vamos utiliazar o exemplo da média do aluno novamente*/
	
	public static void main(String[] args) {
		
	/* Vou deixar tudo como comentário, para apenas mexer com o resultado da média, fica mais fácil.
	int nota1 = 90;
	int nota2 = 50;
	int nota3 = 77;
	int nota4 = 21;
	int media = (nota1 + nota2 + nota3 + nota4) / 4;
	*/
		int media = 71;
	System.out.println(media);
	
	String mediaResultado = media >= 70 ? "Aluno aprovado!" : "Aluno reprovado";
	System.out.println(mediaResultado);
	
	
	}
}
