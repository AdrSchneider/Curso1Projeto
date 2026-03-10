package condicoes_logicas;

public class aninhados {
	
	int mediaFinal = 60;
	
	/*Vamos aprender agora a fazer If e Else aninhados*/
	
	public static void main(String[] args) {
	
		int media = 92;	

		if (media >= 40) {
			if (media > 60) {
				if (media >= 70) {
					if (media > 90) {
						System.out.println("ótimo você está aprovado");
					}else {
						System.out.println("Parabéns aprovado!");
					}
					
				}else {
					System.out.println("Aluno aprovado!");
				}
				
			}else {
				System.out.println("Recuperação");
			}
		}else {
			System.out.println("Aluno reprovado!");
		}
		
	}
	
}
