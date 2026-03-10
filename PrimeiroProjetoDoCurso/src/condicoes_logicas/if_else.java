package condicoes_logicas;

public class if_else {

	public static void main(String[] args) {

		int nota1 = 19;
		int nota2 = 66;
		int nota3 = 17;
		int nota4 = 59;
		int media = 100;
		String nomeAluno = "Adrian";

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Parabens! você passou com média alta");
				}else {
					System.out.println("Aluno aprovado direto!");
				}
			}else {
				System.out.println("Aluno em recuperação!");
			}
			
		}else {
			System.out.println("Aluno reprovado!");
		}
		
	}

}