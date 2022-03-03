package LacosdeDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int x;
		Scanner ler =new Scanner(System.in);
		
		System.out.print("digite um numero: ");
		x= ler.nextInt();
		
		if (x>10 && x<14)
		System.out.print("infantil ");
		else if (x>15 && x<17)
		System.out.print("juvenil");
		else 
		System.out.print("adulto ");

	}

}
