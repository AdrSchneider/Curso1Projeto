package condicoes_logicas;

public class if_else {

	public static void main(String[] args) {

		int nota1 = 19;
		int nota2 = 66;
		int nota3 = 17;
		int nota4 = 59;
		int media;
		String nomeAluno = "Adrian";

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média final é: " + media);
		
		if (media >= 70 && nomeAluno.equals("Adrian")) {
			System.out.println("Você está aprovado! " + media);
		}else if (media >= 40) {
			System.out.println("Você está de Recuperação! " + media);
		} else {
			System.out.println("Você está Reprovado!! " + media);
		}
					
	}
}

