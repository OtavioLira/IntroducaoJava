package logica.exercicios07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int num,numMaior = 0;
		
		for(int i = 0; i <= 12; i++) {
			System.out.printf("Digite o %d° numero: ", i);
			num = entrada.nextInt();
			
			if(num > numMaior) {
				numMaior = num;
			}
			
		}
		System.out.println("O maior numero é: " + numMaior);
		entrada.close();
	}

}
