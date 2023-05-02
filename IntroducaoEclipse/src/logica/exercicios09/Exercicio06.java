package logica.exercicios09;

import java.util.Scanner;

public class Exercicio06 {

	public static void main (String args[]){
		Scanner entrada = new Scanner(System.in);
		int num = 0;
			
		do {
			System.out.print("Digite um numero inteiro: ");
			num = entrada.nextInt();
			
			int[] vetor = new int[num];
			
			//preencher vetor
			for(int i = 0; i <= vetor.length - 1; i ++){// vetor.length ou num
				vetor[i] = entrada.nextInt();
			}

			//somar vetor
			int soma = 0;
			for(int i: vetor){
				soma += i;
			}
			System.out.println("Soma total do vetor: " + soma);			
			
		} while(num <= 0);
		entrada.close();
	}

}