package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int x, i;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		x= ler.nextInt();
		i= (x%2);
		
		
		
		if(i==0)
			
			System.out.print("o numero "+Math.sqrt(x)+"é par");
		else
			System.out.print("o numero "+Math.pow(x, x)+" é impar");
		
		

	}

}
