package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		 int a, b, c;
			
			Scanner ler = new Scanner(System.in);
			
			System.out.print("digite um numero: ");
			a= ler.nextInt();
			System.out.print("digite um numero: ");
			b= ler.nextInt();
			System.out.print("digite um numero: ");
			c= ler.nextInt();
			
			if(a<b && b<c)
				System.out.print(a+"-"+b+"-"+c);
			else if (a<c)
				System.out.print(a+"-"+c+"-"+b);
			else 
				System.out.print(c+"-"+a+"-"+b);
				

	}

}
