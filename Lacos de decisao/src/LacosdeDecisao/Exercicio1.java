package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		n1= ler.nextInt();
		System.out.print("digite um numero: ");
		n2= ler.nextInt();
		System.out.print("digite um numero: ");
		n3= ler.nextInt();
		
		
	if (n1>=n2 && n1>=n3 )
		System.out.print("o maior numero ?: "+ n1);
	else if (n2>=n1 && n2>=n3)
	   System.out.print("o maior numero ?: "+ n2);
	   else
	   System.out.print("o maior numero ?: "+ n3);
	System.out.print("fim de programa  ");
	
	
	
	

		
	

	}

}
