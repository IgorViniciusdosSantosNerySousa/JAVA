package ExemploEstrutura1;

import java.util.Scanner;

public class ExemploDeSele��o {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		int idade;
		
		System.out.println("Escreva a idade do meliante : ");
		idade = sc.nextInt();
		
		if (idade>=18) {
			System.out.println("Di Mai�");
			System.out.println("Ganha convite pra PlayBoy");
		}else {
			System.out.println("Di Men�");
			System.out.println("Ganha ingresso pra exposi��o do Mundo Bita");
		}
	}

}
