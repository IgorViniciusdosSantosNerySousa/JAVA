package exemploDecisao;

import java.util.Scanner;

public class exerc�cioSwitchCase {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int erro;
		
		System.out.println("Digite o c�digo do erro : ");
		erro = leia.nextInt();
		
		switch (erro) {
		case 1:
			System.out.println("Seu erro � : Identificador Inv�lido");
			break;
		case 2:
			System.out.println("Seu erro � : Esperando N�mero Inteiro");
			break;
		case 3: 
			System.out.println("Seu erro � : Tipo de Dado Indefinido");
			break;
		case 4:
			System.out.println("Seu erro � : Par�metro Incorreto");
			break;
		case 5:
			System.out.println("Seu erro � : Mem�ria Insuficiente");
			break;
		default:
			System.out.println("C�digo de erro inexistente...");
		}
	}

}
