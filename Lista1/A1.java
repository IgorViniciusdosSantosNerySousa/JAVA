package Lista1;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		Scanner leia=new Scanner (System.in);
		int n1,n2,n3,n4,media;
		
		System.out.println("Digite o 1� valor : ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2� valor : ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3� valor : ");
		n3 = leia.nextInt();
		
		System.out.println("Digite o 4� valor : ");
		n4 = leia.nextInt();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A m�dia desses valores � de :" + media);
		
		
	}

}
