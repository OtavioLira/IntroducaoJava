package logica.exercicios09;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//pedir um valor inteiro maior que 0
		int num;
		do {
			num = entrada.nextInt();
		} while (num <=0);
		
		//preencher um vetor de n tamanho com n valores
		String[] vetor = new String[num];
		for(int i = 0; i <= vetor.length-1; i++) {
			System.out.print("\nDigite qualquer coisa: ");
			vetor[i] = entrada.nextLine();
		}
		//inveter vetor
		for(int c = 0; c <= vetor.length-1; c++) {
			for(int f = vetor.length-1; f >= 0; f--) {
				String aux = vetor[c];
				System.out.println(vetor[c]);
				vetor[c] = vetor[f];
				vetor[f] = aux;
				System.out.println(vetor[c]);
			}
		}
//		//imprimir vetor
//		for(String elemento: vetor) {
//			System.out.println(elemento);
//		}
		entrada.close();
	}
	
}