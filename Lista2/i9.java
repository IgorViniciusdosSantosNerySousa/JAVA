package Lista2;

import java.util.Scanner;

public class i9 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		int senhorAneis=0, matrix=0, votos=0, voto=0, empate=0;
		
		for (votos=1; votos<=20; votos++) {
		
		System.out.println("Em qual filme voc� vai votar? 1- Matrix| 2-Senhor dos An�is: " + voto);
		voto=leia.nextInt();
		
		if (voto==1) {
			senhorAneis++;
			
		}else if (voto==2) {
			matrix++;
		
		}else {
			System.out.println("N�mero de vota��o inv�lida. Tente Novamente.");
		}
						
	}//fim for
		if (senhorAneis>matrix) {
			System.out.println("O Filme 'Senhor dos An�is � o vencedor.");
		} else if (matrix>senhorAneis) {
			System.out.println("O Filme 'Matrix' � o vencedor.");
		} else {
			System.out.println("EMPATE...");
		}
		
		System.out.println("N�mero de votos para o filme Senhor dos an�is: " + senhorAneis);
		System.out.println("N�mero de votos para o filme Senhor dos an�is: " + matrix);
  }
}







