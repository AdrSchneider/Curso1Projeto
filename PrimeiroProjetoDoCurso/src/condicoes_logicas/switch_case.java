package condicoes_logicas;

public class switch_case {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		/*Operações lógicas aninhadas com Switch Case (Caso)*/
		/*Eles servem para condições EXATAS*/
		
		int dia = 5;
		
		switch (dia) {
		case 1:
			System.out.println("Dia atual: Domingo");
			break;
		case 2:
			System.out.println("Dia atual: Segunda-Feira");
			break;
		case 3:
			System.out.println("Dia atual: Terça-Feira");
			break;
		case 4:
			System.out.println("Dia atual: Quarta-Feira");
			break;
		case 5:
			System.out.println("Dia atual: Quinta-Feira");
			break;
		case 6:
			System.out.println("Dia atual: Sexta-Feira");
		case 7:
			System.out.println("Dia atual: Sabado");
			break;

		default: System.out.println("Valor incorreto!");
			break;
		}
		
	}

}
