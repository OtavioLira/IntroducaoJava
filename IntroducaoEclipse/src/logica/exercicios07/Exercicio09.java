package logica.exercicios07;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("Digite um numero inteiro positivo");
			num = entrada.nextInt();
			entrada.close();
			
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
				}	
			}
			
		} while(num < 0);
		
		
		
			
	}

}
