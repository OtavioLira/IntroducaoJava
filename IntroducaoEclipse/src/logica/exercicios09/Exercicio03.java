package logica.exercicios09;

import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {
	
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		Random ale = new Random();
		
		do {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();			
		}	while(numero <= 0); 
					
		float[] vetor = new float[numero];
		
		//For Each para preencher o vetor
		for(int i = 0; i <= vetor.length - 1; i++){
			vetor[i] = ale.nextFloat(1, (float) numero);
			System.out.printf("[%.2f]",vetor[i]);
		}
		entrada.close();
	}
	
}