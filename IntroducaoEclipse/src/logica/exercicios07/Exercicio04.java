package logica.exercicios07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		
		for(int i = 1; i <=10; i++) {
			System.out.printf("Digite o %d° numero: ", i);
			soma += entrada.nextDouble(); 
		}
		System.out.println("Soma Final: " + soma);
		
		entrada.close();
	}

}
