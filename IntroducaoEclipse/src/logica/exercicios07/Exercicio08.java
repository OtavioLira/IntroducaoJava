package logica.exercicios07;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0, num = 0;
		
		do {
			System.out.println("Digite um numero inteiro: ");
			num = entrada.nextInt();
			

		} while(num <= 0); 

		for(int i = 0; i <= num; i++) {
			total += i;
		}
		System.out.printf("A soma de 1 até %d é %d", num, total);
		
		entrada.close();
	}

}
