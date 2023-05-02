package logica.exercicios09;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {
		int[][] matriz1 = new int[2][3];
		int[][] matriz2 = new int[2][3];
		int[][] soma = new int[2][3];
		Random ale = new Random();
		//Valores aleatorios nos vetores
		for(int l = 0; l <= matriz1.length-1; l++) {
			for(int c = 0; c <= matriz1.length-1; c++) {
				matriz1[l][c] = ale.nextInt(-10,11);
				matriz2[l][c] = ale.nextInt(-10,11);
			}
		}
		
		//Somar
		for(int l = 0; l <= matriz1.length-1; l++) {
			for(int c = 0; c <= matriz1.length-1; c++) {
				soma[l][c] = matriz1[l][c] + matriz2[l][c];
			}
		}
		//imprimir matriz1
		System.out.println("Matriz 1");
		for(int[] l: matriz1) {
			for(int elemento: l) {
				System.out.print("[" + elemento + "]");
			}
			System.out.println();
		}
		//imprimir matriz2
		System.out.println("Matriz 2");
		for(int[] l: matriz2) {
			for(int elemento: l) {
				System.out.print("[" + elemento + "]");
			}
			System.out.println();
		}
		//imprimir
		System.out.println("Soma das matrizes");
		for(int[] l: soma) {
			for(int elemento: l) {
				System.out.print("[" + elemento + "]");
			}
			System.out.println();
		}

	}

}
