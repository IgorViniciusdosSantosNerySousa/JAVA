package Lista2;

import java.util.Scanner;

public class i5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, n4, aluno;
		int totAprovados=0;
		int totReprovados=0;
		double media, mediaEscolar;
		
		for(aluno=1; aluno<=10; aluno++) {
			System.out.println("Escreva a nota do 1�B do aluno: ");
			n1=sc.nextInt();
			System.out.println("Escreva a nota do 2�B do aluno: ");
			n2=sc.nextInt();
			System.out.println("Escreva a nota do 3�B do aluno: ");
			n3=sc.nextInt();
			System.out.println("Escreva a nota do 4�B do aluno: ");
			n4=sc.nextInt();
		
			media=(n1+n2+n3+n4)/4;
			
			System.out.println("A m�dia deste aluno � de: " + media);

		}
	}

}
