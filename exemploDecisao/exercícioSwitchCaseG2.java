package exemploDecisao;

import java.util.Scanner;

public class exerc�cioSwitchCaseG2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int erro;
		
		System.out.println("Digite o c�digo do departamento : ");
		erro = leia.nextInt();
		
		switch (erro) {
		case 10:
			System.out.println("Seu departamento ser� : Expedi��o");
			break;
		case 20:
			System.out.println("Seu departamento ser� : Recursos Humanos");
			break;
		case 30: 
			System.out.println("Seu departamento ser� : Log�stica");
			break;
		case 40:
			System.out.println("Seu departamento ser� : Contabilidade");
			break;
		case 50:
			System.out.println("Seu departamento ser� : Departamento Pessoal");
			break;
		case 60:
			System.out.println("Seu departamento ser� : Inform�tica");
			break;
			default:
			System.out.println("Departamento n�o encontrado...");
		}
	}

}
