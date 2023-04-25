package logica.exercicios07;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = entrada.nextInt();
		
		for(int i = 0; i <= 20; i++) {
			System.out.printf("%d X %d = %d", num, i, num*i);
			System.out.println();
		}
		entrada.close();

	}

}
