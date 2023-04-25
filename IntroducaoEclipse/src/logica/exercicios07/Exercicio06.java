package logica.exercicios07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um numero: ");
		num = entrada.nextInt();
		
		for(int i = 2; i <= num; i++) {
			
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
			
		}
		entrada.close();
	}

}
